package com.hzq.nacos.caseadminauth.entity.jwt;

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
    private String jgdm;

    private List<String> roleIdList;

}
