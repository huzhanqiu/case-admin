/************************************************************************
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 ************************************************************************/
package com.hzq.nacos.caseadminauth.util;

import com.google.common.base.Optional;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author CSJ (email:raulcsj@163.com)
 * @since 2012-11-8
 */
public final class WebUtil {
    private static final String PAGESTART = "start";
    private static final String PAGELIMIT = "limit";

    private WebUtil() {
    }

    /****************************************
     * 获取请求参数hashMap
     *
     * @param request
     * @return map
     ****************************************/
    @SuppressWarnings("all")
    public static final Map<String, Object> getParamsMapFromRequest(HttpServletRequest request) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        Map reqParamMap = request.getParameterMap();
        Set<Map.Entry<String, Object>> entitySet = reqParamMap.entrySet();
        for (Map.Entry<String, Object> entry : entitySet) {
            String value = ((String[]) entry.getValue())[0];
            if (!PAGESTART.equals(entry.getKey()) || !PAGELIMIT.equals(entry.getKey())) {
                paramMap.put(entry.getKey(), value);
            }
        }
        // 处理分页
        String start = request.getParameter(PAGESTART);
        String limit = request.getParameter(PAGELIMIT);
        if (StringUtils.isNotEmpty(start) && StringUtils.isNotEmpty(limit)) {
            paramMap.put(PAGESTART, start);
            paramMap.put(PAGELIMIT, Integer.valueOf(start) + Integer.valueOf(limit));
        }
        return paramMap;
    }

    /****************************************
     * 判断是否为Ajax请求
     *
     * @param request
     * @return
     ****************************************/
    public static final boolean isAjax(HttpServletRequest request) {
        return "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));
    }

    public enum BrowserType {
        IE10, IE9, IE8, IE7, IE6, Firefox, Safari, Chrome, Opera, Camino, Gecko, Other
    }

    /**
     * 判断是否是IE
     */
    public static boolean isIE(HttpServletRequest request) {
        return request.getHeader("USER-AGENT").toLowerCase().indexOf("msie") > 0 ? true : false;
    }

    /**
     * 获取浏览器类型
     *
     * @param request
     * @return
     */
    public static BrowserType getBrowserType(HttpServletRequest request) {
        BrowserType browserType = BrowserType.Other;
        if (getBrowserType(request, "msie 10.0")) {
            browserType = BrowserType.IE9;
        }
        if (getBrowserType(request, "msie 9.0")) {
            browserType = BrowserType.IE9;
        }
        if (getBrowserType(request, "msie 8.0")) {
            browserType = BrowserType.IE8;
        }
        if (getBrowserType(request, "msie 7.0")) {
            browserType = BrowserType.IE7;
        }
        if (getBrowserType(request, "msie 6.0")) {
            browserType = BrowserType.IE6;
        }
        if (getBrowserType(request, "firefox")) {
            browserType = BrowserType.Firefox;
        }
        if (getBrowserType(request, "safari")) {
            browserType = BrowserType.Safari;
        }
        if (getBrowserType(request, "chrome")) {
            browserType = BrowserType.Chrome;
        }
        if (getBrowserType(request, "opera")) {
            browserType = BrowserType.Opera;
        }
        if (getBrowserType(request, "camino")) {
            browserType = BrowserType.Camino;
        }
        return browserType;
    }

    private static boolean getBrowserType(HttpServletRequest request, String brosertype) {
        return request.getHeader("USER-AGENT").toLowerCase().indexOf(brosertype) > 0 ? true : false;
    }

    @SuppressWarnings("unchecked")
    public static String[] StringToArray(String s, char b) {
        String[] a = null;
        if (s == null || s.trim().length() == 0) {
            a = new String[]{};
            return a;
        }
        @SuppressWarnings("rawtypes")
        java.util.Vector vec = new java.util.Vector();
        if (s.indexOf(b) == -1) {
            vec.addElement(s);
        } else {
            if (s.charAt(0) == b) {
                s = s.substring(1);
            }
            if (s.charAt(s.length() - 1) == b) {
                s = s.substring(0, s.length() - 1);
            }

            int i = 0;
            int j = 0;
            while (s.indexOf(b, i) > 0) {

                j = s.indexOf(b, i);

                String tmp = s.substring(i, j);
                vec.addElement(tmp);
                i = j + 1;
            }
            vec.addElement(s.substring(i, s.length()));
        }
        a = new String[vec.size()];
        vec.copyInto(a);

        return a;
    }

    public static String getStr(Object obj) {
        return Optional.of(obj).or("").toString();
    }

    public static String removeZero(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (i == 0 && str.substring(0, 2).equalsIgnoreCase("00")) {
                break;
            } else if (str.substring(i * 2, i * 2 + 2).equalsIgnoreCase("00")) {
                str = str.substring(0, i * 2);
                break;
            }
        }
        return str;
    }

    /**
     * 获取IP
     */
    public static String getIP(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("HTTP_CLIENT_IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("HTTP_X_FORWARDED_FOR");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getRemoteAddr();
            }
        }
        return ip;
    }
}
