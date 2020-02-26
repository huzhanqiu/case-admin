package com.hzq.nacos.caseadminauth.entity.sys;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: huzq
 * @Date: 2020/1/14/11:04 下午
 * @Description: case-admin
 */
@Data
@TableName(value = "T_SYS_ACCOUNT_ROLE")
public class TSysAccountRole implements Serializable {
    @TableField(value = "USERID")
    private String userid;

    @TableField(value = "ROLEID")
    private String roleid;
}