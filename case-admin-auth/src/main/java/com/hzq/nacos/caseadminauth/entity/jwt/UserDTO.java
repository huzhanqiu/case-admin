package com.hzq.nacos.caseadminauth.entity.jwt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value = "系统登陆对象", description = "DTO")
public class UserDTO {
    @ApiModelProperty(name = "username", value = "用户名", required = true)
    private String username;
    @ApiModelProperty(name = "password", value = "密码", required = true)
    private String password;
    @ApiModelProperty(name = "dwdm", value = "单位代码", required = true)
    private String dwdm;
    @ApiModelProperty(name = "remeberMe", value = "记住我")
    private Boolean remeberMe;

}
