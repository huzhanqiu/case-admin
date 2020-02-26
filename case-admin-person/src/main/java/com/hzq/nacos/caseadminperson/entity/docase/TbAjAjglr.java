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
@ApiModel(value = "com-hzq-nacos-caseadminperson-entity-docase-TbAjAjglr")
@Data
@TableName(value = "TB_AJ_AJGLR")
public class TbAjAjglr {
    /**
     * 关联主键
     */
    @TableId(value = "GLID", type = IdType.INPUT)
    @ApiModelProperty(value = "关联主键")
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
     * 姓名
     */
    @TableField(value = "XM")
    @ApiModelProperty(value = "姓名,")
    private String xm;

    /**
     * 身份证号
     */
    @TableField(value = "SFZH")
    @ApiModelProperty(value = "身份证号,")
    private String sfzh;

    /**
     * 住址
     */
    @TableField(value = "ZZ")
    @ApiModelProperty(value = "住址,")
    private String zz;

    /**
     * 所属公司
     */
    @TableField(value = "SSGS")
    @ApiModelProperty(value = "所属公司,")
    private String ssgs;

    /**
     * 职务
     */
    @TableField(value = "ZW")
    @ApiModelProperty(value = "职务,")
    private String zw;

    /**
     * 电话
     */
    @TableField(value = "LXDH")
    @ApiModelProperty(value = "电话,")
    private String lxdh;

    /**
     * 网络ID
     */
    @TableField(value = "WLID")
    @ApiModelProperty(value = "网络ID,")
    private String wlid;

    /**
     * 身份（备注）
     */
    @TableField(value = "BZ")
    @ApiModelProperty(value = "身份（备注）,")
    private String bz;

    /**
     * 录入时间
     */
    @TableField(value = "LRSJ")
    @ApiModelProperty(value = "录入时间")
    private LocalDateTime lrsj;

    /**
     * 录入人
     */
    @TableField(value = "LRR")
    @ApiModelProperty(value = "录入人")
    private String lrr;

    /**
     * 录入人身份证
     */
    @TableField(value = "LRRSFZH")
    @ApiModelProperty(value = "录入人身份证")
    private String lrrsfzh;

    /**
     * 录入单位
     */
    @TableField(value = "LRDW")
    @ApiModelProperty(value = "录入单位")
    private String lrdw;

    /**
     * 录入单位名称
     */
    @TableField(value = "LRDWMC")
    @ApiModelProperty(value = "录入单位名称")
    private String lrdwmc;

    /**
     * 修改人
     */
    @TableField(value = "XGR")
    @ApiModelProperty(value = "修改人")
    private String xgr;

    /**
     * 修改人身份证号
     */
    @TableField(value = "XGRSFZH")
    @ApiModelProperty(value = "修改人身份证号")
    private String xgrsfzh;

    /**
     * 修改单位代码
     */
    @TableField(value = "XGDW")
    @ApiModelProperty(value = "修改单位代码")
    private String xgdw;

    /**
     * 修改单位名称
     */
    @TableField(value = "XGDWMC")
    @ApiModelProperty(value = "修改单位名称")
    private String xgdwmc;

    /**
     * 修改时间
     */
    @TableField(value = "XGSJ")
    @ApiModelProperty(value = "修改时间")
    private LocalDateTime xgsj;

    /**
     * 有效性（0无效，1有效）
     */
    @TableField(value = "YXX")
    @ApiModelProperty(value = "有效性（0无效，1有效）")
    private String yxx;
}