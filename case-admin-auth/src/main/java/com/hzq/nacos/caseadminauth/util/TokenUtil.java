package com.hzq.nacos.caseadminauth.util;

import com.alibaba.fastjson.JSONObject;
import com.hzq.nacos.caseadminauth.entity.jwt.JwtModel;
import com.hzq.nacos.caseadminauth.entity.jwt.JwtUtil;
import com.hzq.nacos.caseadminauth.entity.jwt.UserDTO;
import io.jsonwebtoken.Claims;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @Author: huzq
 * @Date: 2019-07-22/16:27
 * @Description: jqxxh
 */
public class TokenUtil {
    public static String getUsernameByToken(String token) throws Exception {
        if (StringUtils.isNotEmpty(token) && token.startsWith("Bearer ")) {
            token = token.replace("Bearer ", "");
            Claims claims = JwtUtil.parseJWT(token);
            String subject = claims.getSubject();
            JwtModel jwtModel = JSONObject.parseObject(subject, JwtModel.class);
            if (jwtModel != null) {
                return jwtModel.getUsername();
            } else {
                return "";
            }
        } else {
            return "";
        }
    }

    public static UserDTO getUserDtoByToken(String token) throws Exception {
        UserDTO userDTO = new UserDTO();
        if (StringUtils.isNotEmpty(token) && token.startsWith("Bearer ")) {
            token = token.replace("Bearer ", "");
            Claims claims = JwtUtil.parseJWT(token);
            String subject = claims.getSubject();
            JwtModel jwtModel = JSONObject.parseObject(subject, JwtModel.class);
            userDTO.setDwdm(jwtModel.getJgdm());
            userDTO.setUsername(jwtModel.getUsername());
            return userDTO;
        } else {
            return userDTO;
        }
    }

    public static List<String> getRolesByToken(String token) throws Exception {
        if (token.startsWith("Bearer ")) {
            token = token.replace("Bearer ", "");
            Claims claims = JwtUtil.parseJWT(token);
            String subject = claims.getSubject();
            JwtModel jwtModel = JSONObject.parseObject(subject, JwtModel.class);
            if (jwtModel != null) {
                return jwtModel.getRoleIdList();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
