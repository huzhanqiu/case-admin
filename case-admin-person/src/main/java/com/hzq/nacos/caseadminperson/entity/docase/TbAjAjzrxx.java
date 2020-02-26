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
@ApiModel(value = "com-hzq-nacos-caseadminperson-entity-docase-TbAjAjzrxx")
@Data
@TableName(value = "TB_AJ_AJZRXX")
public class TbAjAjzrxx {
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
     * 证人种类(代码)
     */
    @TableField(value = "ZRZL")
    @ApiModelProperty(value = "证人种类(代码)")
    private String zrzl;

    /**
     * 作证时间
     */
    @TableField(value = "ZZSJ")
    @ApiModelProperty(value = "作证时间")
    private LocalDateTime zzsj;

    /**
     * 作证地点
     */
    @TableField(value = "ZZDD")
    @ApiModelProperty(value = "作证地点")
    private String zzdd;

    /**
     * 作证经过
     */
    @TableField(value = "ZZJG")
    @ApiModelProperty(value = "作证经过")
    private String zzjg;

    /**
     * 备注
     */
    @TableField(value = "BZ")
    @ApiModelProperty(value = "备注")
    private String bz;

    /**
     * 证人标识
     */
    @TableField(value = "ZRBS")
    @ApiModelProperty(value = "证人标识")
    private String zrbs;

    /**
     * 报案人单位(机构代码)
     */
    @TableField(value = "BARDW")
    @ApiModelProperty(value = "报案人单位(机构代码)")
    private String bardw;

    /**
     * 有效性（0无效，1有效）
     */
    @TableField(value = "YXX")
    @ApiModelProperty(value = "有效性（0无效，1有效）")
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