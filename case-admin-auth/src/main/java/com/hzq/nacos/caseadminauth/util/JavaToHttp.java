package com.hzq.nacos.caseadminauth.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class JavaToHttp {
    static Log log = LogFactory.getLog(JavaToHttp.class);

    /**
     * 访问http服务
     *
     * @param requestUrl    传入url
     * @param requestMethod "POST"
     * @param outputStr     "传入参数"
     * @return
     */
    public static String httpRequest(String requestUrl, String requestMethod, String outputStr) {
        StringBuffer buffer = null;
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod(requestMethod);
            conn.setConnectTimeout(1000);
            conn.connect();
            log.debug("建立连接传入参数");
            //往服务器端写内容 也就是发起http请求需要带的参数
            if (null != outputStr) {
                OutputStream os = conn.getOutputStream();
                os.write(outputStr.getBytes("utf-8"));
                os.close();
                log.debug("传入参数:" + outputStr);
            }

            //读取服务器端返回的内容
            InputStream is = conn.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            buffer = new StringBuffer();
            String line = null;
            while ((line = br.readLine()) != null) {
                buffer.append(line);
            }
            return buffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e);
            return "error";
        }

    }
}
