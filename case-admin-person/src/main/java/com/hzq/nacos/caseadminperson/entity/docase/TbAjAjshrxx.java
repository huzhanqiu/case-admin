package com.hzq.nacos.caseadminperson.entity.docase;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * @Author: huzq
 * @Date: 2020/1/18/2:51 下午
 * @Description: case-admin
 */
@ApiModel(value = "com-hzq-nacos-caseadminperson-entity-docase-TbAjAjshrxx")
@Data
@TableName(value = "TB_AJ_AJSHRXX")
public class TbAjAjshrxx {
    /**
     * 关联ID,12位机构代码+8位年月日+10位顺序号
     */
    @TableId(value = "GLID", type = IdType.INPUT)
    @ApiModelProperty(value = "关联ID,12位机构代码+8位年月日+10位顺序号")
    private String glid;

    /**
     * 案件编号
     */
    @TableField(value = "AJBH")
    @ApiModelProperty(value = "案件编号")
    private String ajbh;

    /**
     * 人员编号
     */
    @TableField(value = "RYBH")
    @ApiModelProperty(value = "人员编号")
    private String rybh;

    /**
     * 保密级别
     */
    @TableField(value = "BMJB")
    @ApiModelProperty(value = "保密级别")
    private String bmjb;

    /**
     * 受害程度
     */
    @TableField(value = "SHCD")
    @ApiModelProperty(value = "受害程度")
    private String shcd;

    /**
     * 是否被拐卖(代码)
     */
    @TableField(value = "SFBGM")
    @ApiModelProperty(value = "是否被拐卖(代码)")
    private String sfbgm;

    /**
     * 是否聋哑（代码）
     */
    @TableField(value = "SFLY")
    @ApiModelProperty(value = "是否聋哑（代码）")
    private String sfly;

    /**
     * 受害时间
     */
    @TableField(value = "SHSJ")
    @ApiModelProperty(value = "受害时间")
    private LocalDateTime shsj;

    /**
     * 受害地点
     */
    @TableField(value = "SHDD")
    @ApiModelProperty(value = "受害地点")
    private String shdd;

    /**
     * 受害形式(代码)
     */
    @TableField(value = "SHXS")
    @ApiModelProperty(value = "受害形式(代码)")
    private String shxs;

    /**
     * 致死原因
     */
    @TableField(value = "ZSYY")
    @ApiModelProperty(value = "致死原因")
    private String zsyy;

    /**
     * 致死工具(物品类型代码)
     */
    @TableField(value = "ZSGJ")
    @ApiModelProperty(value = "致死工具(物品类型代码)")
    private String zsgj;

    /**
     * 受害经过
     */
    @TableField(value = "XHJG")
    @ApiModelProperty(value = "受害经过")
    private String xhjg;

    /**
     * 备注
     */
    @TableField(value = "BZXX")
    @ApiModelProperty(value = "备注")
    private String bzxx;

    /**
     * 受害人标示
     */
    @TableField(value = "SHRBS")
    @ApiModelProperty(value = "受害人标示")
    private String shrbs;

    /**
     * 有效性（1-有效，0-无效）
     */
    @TableField(value = "YXX")
    @ApiModelProperty(value = "有效性（1-有效，0-无效）")
    private String yxx;

    /**
     * 登记时间
     */
    @TableField(value = "DJSJ")
    @ApiModelProperty(value = "登记时间")
    private LocalDateTime djsj;

    /**
     * 登记单位
     */
    @TableField(value = "DJDW")
    @ApiModelProperty(value = "登记单位")
    private String djdw;

    /**
     * 登记人
     */
    @TableField(value = "DJR")
    @ApiModelProperty(value = "登记人")
    private String djr;

    /**
     * 登记人姓名
     */
    @TableField(value = "DJRXM")
    @ApiModelProperty(value = "登记人姓名")
    private String djrxm;

    /**
     * 修改时间
     */
    @TableField(value = "XGSJ")
    @ApiModelProperty(value = "修改时间")
    private LocalDateTime xgsj;

    /**
     * 修改单位
     */
    @TableField(value = "XGDW")
    @ApiModelProperty(value = "修改单位")
    private String xgdw;

    /**
     * 修改人
     */
    @TableField(value = "XGR")
    @ApiModelProperty(value = "修改人")
    private String xgr;

    /**
     * 修改人姓名
     */
    @TableField(value = "XGRXM")
    @ApiModelProperty(value = "修改人姓名")
    private String xgrxm;

    /**
     * 案件密级
     */
    @TableField(value = "AJMJ")
    @ApiModelProperty(value = "案件密级")
    private String ajmj;

    /**
     * 姓名
     */
    @TableField(value = "XM")
    @ApiModelProperty(value = "姓名")
    private String xm;

    /**
     * 性别
     */
    @TableField(value = "XB")
    @ApiModelProperty(value = "性别")
    private String xb;

    /**
     * 身份证
     */
    @TableField(value = "SFZH")
    @ApiModelProperty(value = "身份证")
    private String sfzh;

    /**
     * 出生日期
     */
    @TableField(value = "CSRQ")
    @ApiModelProperty(value = "出生日期")
    private LocalDateTime csrq;

    /**
     * 户籍地区划
     */
    @TableField(value = "HJDQH")
    @ApiModelProperty(value = "户籍地区划")
    private String hjdqh;
}