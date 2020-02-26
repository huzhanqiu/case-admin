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
@ApiModel(value = "com-hzq-nacos-caseadminperson-entity-docase-TbAjAjgxr")
@Data
@TableName(value = "TB_AJ_AJGXR")
public class TbAjAjgxr {
    /**
     * 关联ID,12位机构代码+8位年月日+10位顺序号
     */
    @TableId(value = "GLID", type = IdType.INPUT)
    @ApiModelProperty(value = "关联ID,12位机构代码+8位年月日+10位顺序号")
    private String glid;

    /**
     * 人员编号
     */
    @TableField(value = "RYBH")
    @ApiModelProperty(value = "人员编号")
    private String rybh;

    /**
     * 案件编号
     */
    @TableField(value = "AJBH")
    @ApiModelProperty(value = "案件编号")
    private String ajbh;

    /**
     * 关系人姓名
     */
    @TableField(value = "GXRXM")
    @ApiModelProperty(value = "关系人姓名")
    private String gxrxm;

    /**
     * 关系人性别
     */
    @TableField(value = "GXRXB")
    @ApiModelProperty(value = "关系人性别")
    private String gxrxb;

    /**
     * 关系人出生日期
     */
    @TableField(value = "GXRCSRQ")
    @ApiModelProperty(value = "关系人出生日期")
    private LocalDateTime gxrcsrq;

    /**
     * 关系人身份证号码
     */
    @TableField(value = "GXRSFZH")
    @ApiModelProperty(value = "关系人身份证号码")
    private String gxrsfzh;

    /**
     * 关系人绰号
     */
    @TableField(value = "GXRCH")
    @ApiModelProperty(value = "关系人绰号")
    private String gxrch;

    /**
     * 关系人户籍地区划
     */
    @TableField(value = "GXRHJDQH")
    @ApiModelProperty(value = "关系人户籍地区划")
    private String gxrhjdqh;

    /**
     * 关系人职业
     */
    @TableField(value = "GXRZY")
    @ApiModelProperty(value = "关系人职业")
    private String gxrzy;

    /**
     * 关系人联系方式
     */
    @TableField(value = "GXRLXFS")
    @ApiModelProperty(value = "关系人联系方式")
    private String gxrlxfs;

    /**
     * 有效性（1-有效，0-无效）
     */
    @TableField(value = "YXX")
    @ApiModelProperty(value = "有效性（1-有效，0-无效）")
    private String yxx;

    /**
     * 关系人类别（代码）GXRYLB
     */
    @TableField(value = "GXRLB")
    @ApiModelProperty(value = "关系人类别（代码）GXRYLB")
    private String gxrlb;

    /**
     * 登记人
     */
    @TableField(value = "DJR")
    @ApiModelProperty(value = "登记人")
    private String djr;

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
     * 登记单位名称
     */
    @TableField(value = "DJDWMC")
    @ApiModelProperty(value = "登记单位名称")
    private String djdwmc;

    /**
     * 登记人姓名
     */
    @TableField(value = "DJRXM")
    @ApiModelProperty(value = "登记人姓名")
    private String djrxm;

    /**
     * 修改人
     */
    @TableField(value = "XGR")
    @ApiModelProperty(value = "修改人")
    private String xgr;

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
     * 修改单位名称
     */
    @TableField(value = "XGDWMC")
    @ApiModelProperty(value = "修改单位名称")
    private String xgdwmc;

    /**
     * 修改人姓名
     */
    @TableField(value = "XGRXM")
    @ApiModelProperty(value = "修改人姓名")
    private String xgrxm;

    /**
     * 健康状况
     */
    @TableField(value = "JKZK")
    @ApiModelProperty(value = "健康状况")
    private String jkzk;

    /**
     * 是否聋哑（代码）
     */
    @TableField(value = "SFLY")
    @ApiModelProperty(value = "是否聋哑（代码）")
    private String sfly;

    /**
     * 备注
     */
    @TableField(value = "BZXX")
    @ApiModelProperty(value = "备注")
    private String bzxx;

    /**
     * 保密级别（代码）
     */
    @TableField(value = "BMJB")
    @ApiModelProperty(value = "保密级别（代码）")
    private String bmjb;

    /**
     * 人员属性（字典XYR_RYSX）
     */
    @TableField(value = "RYSX")
    @ApiModelProperty(value = "人员属性（字典XYR_RYSX）")
    private String rysx;
}