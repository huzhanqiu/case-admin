package com.hzq.nacos.caseadmingateway.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 描述:jwt 模型
 *
 * @Auther: lzx
 * @Date: 2019/7/9 13:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtModel {

    private String username;

    private List<String> roleIdList;

}
