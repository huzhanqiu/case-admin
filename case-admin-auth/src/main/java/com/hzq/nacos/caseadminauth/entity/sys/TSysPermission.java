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
@TableName(value = "T_SYS_PERMISSION")
public class TSysPermission implements Serializable {
    /**
     * 主键UUID
     */
    @TableId(value = "PK", type = IdType.INPUT)
    private String pk;

    /**
     * 权限代码
     */
    @TableField(value = "CODE")
    private String code;

    /**
     * 权限名称
     */
    @TableField(value = "NAME")
    private String name;

    /**
     * 权限描述
     */
    @TableField(value = "COMMENTS")
    private String comments;
}