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
@TableName(value = "T_SYS_ROLE")
public class TSysRole implements Serializable {
    /**
     * 主键UUID
     */
    @TableId(value = "PK", type = IdType.INPUT)
    private String pk;

    /**
     * 角色代码
     */
    @TableField(value = "CODE")
    private String code;

    /**
     * 角色名称
     */
    @TableField(value = "NAME")
    private String name;

    /**
     * 角色描述
     */
    @TableField(value = "COMMENTS")
    private String comments;

    /**
     * 角色分类(10ciis角色,11反电诈角色)
     */
    @TableField(value = "ROLETYPE")
    private String roletype;

    @TableField(value = "JB")
    private String jb;
}