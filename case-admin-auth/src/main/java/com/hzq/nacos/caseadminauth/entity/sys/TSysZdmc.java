package com.hzq.nacos.caseadminauth.entity.sys;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author huzq
 * @title: TSysZdmc
 * @projectName case-admin
 * @description: TODO
 * @date 2020/2/79:36 下午
 */
@ApiModel(value = "com-hzq-nacos-caseadminauth-entity-sys-TSysZdmc")
@Data
@AllArgsConstructor
@TableName(value = "T_SYS_ZDMC")
public class TSysZdmc implements Serializable {
    /**
     * 字典代码
     */
    @TableId(value = "C_ZDDM", type = IdType.INPUT)
    @ApiModelProperty(value = "字典代码")
    private String cZddm;

    /**
     * 字典名称
     */
    @TableField(value = "C_ZDMC")
    @ApiModelProperty(value = "字典名称")
    private String cZdmc;

    /**
     * 备注
     */
    @TableField(value = "C_BZ")
    @ApiModelProperty(value = "备注")
    private String cBz;

    /**
     * 分类标识
     */
    @TableField(value = "C_FJBS")
    @ApiModelProperty(value = "分类标识")
    private String cFjbs;

    private static final long serialVersionUID = 1L;
}