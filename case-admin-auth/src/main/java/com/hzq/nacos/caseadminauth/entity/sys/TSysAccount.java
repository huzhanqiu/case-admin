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
@TableName(value = "T_SYS_ACCOUNT")
public class TSysAccount implements Serializable {
    /**
     * 主键UUID
     */
    @TableId(value = "PK", type = IdType.INPUT)
    private String pk;

    /**
     * 用户名
     */
    @TableField(value = "USERNAME")
    private String username;

    /**
     * 身份号
     */
    @TableField(value = "IDNO")
    private String idno;

    /**
     * 密码
     */
    @TableField(value = "PASSWORD")
    private String password;

    /**
     * 加密盐
     */
    @TableField(value = "SALT")
    private String salt;

    /**
     * 系统超级管理员root
     */
    @TableField(value = "ISADMIN")
    private String isadmin;

    /**
     * 部门编号
     */
    @TableField(value = "DEPTID")
    private String deptid;

    /**
     * 姓名
     */
    @TableField(value = "XM")
    private String xm;

    /**
     * 警号
     */
    @TableField(value = "JH")
    private String jh;

    /**
     * 联系方式
     */
    @TableField(value = "LXFS")
    private String lxfs;

    /**
     * 机构代码
     */
    @TableField(value = "JGDM")
    private String jgdm;

    /**
     * 机构名称
     */
    @TableField(value = "JGMC")
    private String jgmc;

    /**
     * 警种
     */
    @TableField(value = "JZ")
    private String jz;

    /**
     * 职务级别
     */
    @TableField(value = "ZWJB")
    private String zwjb;

    /**
     * 用户证书代码
     */
    @TableField(value = "YHZSDM")
    private String yhzsdm;

    /**
     * 状态(1有效0无效)

     */
    @TableField(value = "ZT")
    private String zt;

    /**
     * 用户ID（警综平台）
     */
    @TableField(value = "YHID")
    private String yhid;

    @TableField(value = "ZPID")
    private String zpid;

    @TableField(value = "BCRPASSWORD")
    private String bcrpassword;

    /**
     * 用户是否初始化密码
     */
    @TableField(value = "INITPWD")
    private String initpwd;
}