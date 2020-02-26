package com.hzq.nacos.caseadminauth.entity.sys;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author huzq
 * @title: TSysZdnr
 * @projectName case-admin
 * @description: TODO
 * @date 2020/2/79:36 下午
 */
@ApiModel(value = "com-hzq-nacos-caseadminauth-entity-sys-TSysZdnr")
@Data
@AllArgsConstructor
@TableName(value = "T_SYS_ZDNR")
public class TSysZdnr implements Serializable {
    /**
     * 字典代码：和字典名称表关联
     */
    @TableField(value = "C_ZDDM")
    @ApiModelProperty(value = "字典代码：和字典名称表关联")
    private String cZddm;

    /**
     * 代码
     */
    @TableField(value = "C_DM")
    @ApiModelProperty(value = "代码")
    private String cDm;

    /**
     * 代码名称
     */
    @TableField(value = "C_MC")
    @ApiModelProperty(value = "代码名称")
    private String cMc;

    /**
     * 有效性：1有效；0无效
     */
    @TableLogic
    @TableField(value = "N_YXX")
    @ApiModelProperty(value = "有效性：1有效；0无效")
    private BigDecimal nYxx;

    /**
     * 用户码
     */
    @TableField(value = "C_YHM")
    @ApiModelProperty(value = "用户码")
    private String cYhm;

    /**
     * 内部代码
     */
    @TableField(value = "C_NBDM")
    @ApiModelProperty(value = "内部代码")
    private String cNbdm;

    /**
     * 备注
     */
    @TableField(value = "C_BZ")
    @ApiModelProperty(value = "备注")
    private String cBz;

    /**
     * 上级代码
     */
    @TableField(value = "C_SJDM")
    @ApiModelProperty(value = "上级代码")
    private String cSjdm;

    /**
     * 本级代码
     */
    @TableField(value = "C_BJDM")
    @ApiModelProperty(value = "本级代码")
    private String cBjdm;

    @TableField(value = "N_PX")
    @ApiModelProperty(value = "")
    private String nPx;

    private static final long serialVersionUID = 1L;
}