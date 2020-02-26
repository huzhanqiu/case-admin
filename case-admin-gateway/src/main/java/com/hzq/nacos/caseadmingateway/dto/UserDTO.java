package com.hzq.nacos.caseadmingateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述: 用户DTO
 *
 * @author caohanye
 * @Date: 2019/7/9 13:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String username;

    private String password;

    private Boolean remeberMe;

}
