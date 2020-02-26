package com.hzq.nacos.caseadminauth.entity.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述:
 *
 * @author caohanye
 * @Date: 2019/7/9 13:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnData<T> {

    private int code;

    private String mass;

    private String czsj;

    private T data;

}
