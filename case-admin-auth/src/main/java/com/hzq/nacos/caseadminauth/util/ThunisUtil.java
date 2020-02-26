package com.hzq.nacos.caseadminauth.util;

import org.apache.commons.lang3.StringUtils;

public class ThunisUtil {

    /**
     * 获取本单位代码（用于like查询）
     *
     * @param dwdm
     * @return
     */
    public static String getBjdwdm(String dwdm) {
        String resBjdwdm = dwdm;
        if (StringUtils.isNotBlank(dwdm) && dwdm.length() >= 8) {
            if ("00".equals(dwdm.substring(4, 6))) {
                if ("00".equals(dwdm.substring(6, 8))) {
                    resBjdwdm = dwdm.substring(0, 4);
                } else {
                    resBjdwdm = dwdm.substring(0, 4);
                }
            } else if (Integer.parseInt(dwdm.substring(6, 8)) > 50) {
                resBjdwdm = dwdm.substring(0, 8);
            } else {
                resBjdwdm = dwdm.substring(0, 6);
            }
        }
        return resBjdwdm;
    }

    // 获取查询条件中的单位代码（用于like查询）
    public static String getCxdwdm(String dwdm) {
        if (StringUtils.isNotBlank(dwdm) && dwdm.length() >= 6) {
            if ("01".equals(dwdm.substring(0, 2))) {//部
                return "";
            } else if ("0000".equals(dwdm.substring(2, 6))) {//省
                return dwdm.substring(0, 2);
            } else if (!"0000".equals(dwdm.substring(2, 6)) && "00".equals(dwdm.substring(4, 6))) {//市
                return dwdm.substring(0, 4);
            } else {//分局
                return dwdm.substring(0, 6);
            }
        }
        return dwdm;
    }

    /**
     * 获取审批单位
     *
     * @param dwdm
     * @return
     */
    public static String getSpsjdwdm(String dwdm, String roleName) {
        String resBjdwdm = (dwdm == null ? "" : dwdm);
        if (org.apache.commons.lang.StringUtils.isNotBlank(dwdm) && dwdm.length() >= 8) {
            if ("pcsfzy".equalsIgnoreCase(roleName)) {
                if (Integer.parseInt(dwdm.substring(6, 8)) > 50) {
                    resBjdwdm = dwdm.substring(0, 8); // 派出所法制员
                } else {
                    if (dwdm.length() >= 10) {
                        resBjdwdm = dwdm.substring(0, 10);
                    }
                }
            } else if ("ksdld".equalsIgnoreCase(roleName)) {
                if (Integer.parseInt(dwdm.substring(6, 8)) > 50) {
                    resBjdwdm = dwdm.substring(0, 8); // 科所队领导
                } else {
                    if (dwdm.length() >= 10) {
                        resBjdwdm = dwdm.substring(0, 10);
                    }
                }
            } else if ("fjfz".equalsIgnoreCase(roleName)) {
                if (Integer.parseInt(dwdm.substring(6, 8)) > 50) {
                    resBjdwdm = dwdm.substring(0, 6);// 分局法制，截取6位
                } else {
                    if (dwdm.substring(4, 6).equals("00")) {
                        resBjdwdm = dwdm.substring(0, 8);
                    } else {
                        resBjdwdm = dwdm.substring(0, 6);
                    }
                }

                // resBjdwdm = dwdm.substring(0, 6); //全部都由分局法制审核
            } else if ("fjld".equalsIgnoreCase(roleName)) {
                if (Integer.parseInt(dwdm.substring(6, 8)) > 50) {
                    resBjdwdm = dwdm.substring(0, 6);// 分局领导，截取6位
                } else {
                    // resBjdwdm = dwdm.substring(0, 8);
                    if (dwdm.substring(4, 6).equals("00")) {
                        resBjdwdm = dwdm.substring(0, 8);
                    } else {
                        resBjdwdm = dwdm.substring(0, 6);
                    }
                }

                // resBjdwdm = dwdm.substring(0, 6); //全部都由分局领导审核
            } else if ("fjztsp".equalsIgnoreCase(roleName)) {
                if (Integer.parseInt(dwdm.substring(6, 8)) > 50) {
                    resBjdwdm = dwdm.substring(0, 6);// 分局领导，截取6位
                } else {
                    resBjdwdm = dwdm.substring(0, 8);
                }
            } else if ("ywcld".equalsIgnoreCase(roleName)) {
                resBjdwdm = dwdm.substring(0, 8); // 业务处领导
            } else if ("sjfz".equalsIgnoreCase(roleName)) {
                resBjdwdm = dwdm.substring(0, 4); // 市局法制
            } else if ("sjld".equalsIgnoreCase(roleName)) {
                resBjdwdm = dwdm.substring(0, 4); // 市局领导
            }
        }
        return resBjdwdm;
    }
}
