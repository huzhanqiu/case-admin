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
@ApiModel(value = "com-hzq-nacos-caseadminperson-entity-docase-TbAjAjthry")
@Data
@TableName(value = "TB_AJ_AJTHRY")
public class TbAjAjthry {
    /**
     * 关联编号
     */
    @TableId(value = "GLBH", type = IdType.INPUT)
    @ApiModelProperty(value = "关联编号")
    private String glbh;

    /**
     * 人员编号
     */
    @TableField(value = "RYBH")
    @ApiModelProperty(value = "人员编号")
    private String rybh;

    /**
     * 团伙编号
     */
    @TableField(value = "THBH")
    @ApiModelProperty(value = "团伙编号")
    private String thbh;

    /**
     * 更新标识
     */
    @TableField(value = "GXBS")
    @ApiModelProperty(value = "更新标识")
    private String gxbs;

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
}