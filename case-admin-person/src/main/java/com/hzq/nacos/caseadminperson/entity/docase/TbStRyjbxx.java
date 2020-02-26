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
 * @Date: 2020/1/18/2:55 下午
 * @Description: case-admin
 */
@ApiModel(value = "com-hzq-nacos-caseadminperson-entity-docase-TbStRyjbxx")
@Data
@TableName(value = "TB_ST_RYJBXX")
public class TbStRyjbxx {
    /**
     * 人员编号
     */
    @TableId(value = "RYBH", type = IdType.INPUT)
    @ApiModelProperty(value = "人员编号")
    private String rybh;

    /**
     * 身份证号
     */
    @TableField(value = "SFZH")
    @ApiModelProperty(value = "身份证号")
    private String sfzh;

    /**
     * 姓名
     */
    @TableField(value = "XM")
    @ApiModelProperty(value = "姓名")
    private String xm;

    /**
     * 姓名拼音
     */
    @TableField(value = "XMPY")
    @ApiModelProperty(value = "姓名拼音")
    private String xmpy;

    /**
     * 曾用名
     */
    @TableField(value = "CYM")
    @ApiModelProperty(value = "曾用名")
    private String cym;

    /**
     * 曾用名拼音
     */
    @TableField(value = "CYMPY")
    @ApiModelProperty(value = "曾用名拼音")
    private String cympy;

    /**
     * 英文姓
     */
    @TableField(value = "YWX")
    @ApiModelProperty(value = "英文姓")
    private String ywx;

    /**
     * 英文名
     */
    @TableField(value = "YWM")
    @ApiModelProperty(value = "英文名")
    private String ywm;

    /**
     * 别名绰号
     */
    @TableField(value = "BMCH")
    @ApiModelProperty(value = "别名绰号")
    private String bmch;

    /**
     * 别名绰号拼音
     */
    @TableField(value = "BMCHPY")
    @ApiModelProperty(value = "别名绰号拼音")
    private String bmchpy;

    /**
     * 证件种类(代码)
     */
    @TableField(value = "ZJZL")
    @ApiModelProperty(value = "证件种类(代码)")
    private String zjzl;

    /**
     * 证件号码
     */
    @TableField(value = "ZJHM")
    @ApiModelProperty(value = "证件号码")
    private String zjhm;

    /**
     * 性别
     */
    @TableField(value = "XB")
    @ApiModelProperty(value = "性别")
    private String xb;

    /**
     * 民族
     */
    @TableField(value = "MZ")
    @ApiModelProperty(value = "民族")
    private String mz;

    /**
     * 出生日期
     */
    @TableField(value = "CSRQ")
    @ApiModelProperty(value = "出生日期")
    private LocalDateTime csrq;

    /**
     * 出生国家地区
     */
    @TableField(value = "CSDQ")
    @ApiModelProperty(value = "出生国家地区")
    private String csdq;

    /**
     * 出生区县
     */
    @TableField(value = "CSQX")
    @ApiModelProperty(value = "出生区县")
    private String csqx;

    /**
     * 出生详址
     */
    @TableField(value = "CSXZ")
    @ApiModelProperty(value = "出生详址")
    private String csxz;

    /**
     * 籍贯区县
     */
    @TableField(value = "JGQX")
    @ApiModelProperty(value = "籍贯区县")
    private String jgqx;

    /**
     * 籍贯详址
     */
    @TableField(value = "JGXZ")
    @ApiModelProperty(value = "籍贯详址")
    private String jgxz;

    /**
     * 户口类型
     */
    @TableField(value = "HKLX")
    @ApiModelProperty(value = "户口类型")
    private String hklx;

    /**
     * 户籍区划
     */
    @TableField(value = "HJDQH")
    @ApiModelProperty(value = "户籍区划")
    private String hjdqh;

    /**
     * 户籍地详址
     */
    @TableField(value = "HJDXZ")
    @ApiModelProperty(value = "户籍地详址")
    private String hjdxz;

    /**
     * 现住地区划
     */
    @TableField(value = "XZDQH")
    @ApiModelProperty(value = "现住地区划")
    private String xzdqh;

    /**
     * 现住地详址
     */
    @TableField(value = "XZDXZ")
    @ApiModelProperty(value = "现住地详址")
    private String xzdxz;

    /**
     * 政治面貌
     */
    @TableField(value = "ZZMM")
    @ApiModelProperty(value = "政治面貌")
    private String zzmm;

    /**
     * 宗教信仰
     */
    @TableField(value = "ZJXY")
    @ApiModelProperty(value = "宗教信仰")
    private String zjxy;

    /**
     * 文化程度
     */
    @TableField(value = "WHCD")
    @ApiModelProperty(value = "文化程度")
    private String whcd;

    /**
     * 婚姻状况
     */
    @TableField(value = "HYZK")
    @ApiModelProperty(value = "婚姻状况")
    private String hyzk;

    /**
     * 兵役状况
     */
    @TableField(value = "BYZK")
    @ApiModelProperty(value = "兵役状况")
    private String byzk;

    /**
     * 身高
     */
    @TableField(value = "SG")
    @ApiModelProperty(value = "身高")
    private String sg;

    /**
     * 血型
     */
    @TableField(value = "XX")
    @ApiModelProperty(value = "血型")
    private String xx;

    /**
     * 身份
     */
    @TableField(value = "SF")
    @ApiModelProperty(value = "身份")
    private String sf;

    /**
     * 专长
     */
    @TableField(value = "ZC")
    @ApiModelProperty(value = "专长")
    private String zc;

    /**
     * 职务
     */
    @TableField(value = "ZW")
    @ApiModelProperty(value = "职务")
    private String zw;

    /**
     * 职业
     */
    @TableField(value = "ZY")
    @ApiModelProperty(value = "职业")
    private String zy;

    /**
     * 职业类别
     */
    @TableField(value = "ZYLB")
    @ApiModelProperty(value = "职业类别")
    private String zylb;

    /**
     * 服务处所
     */
    @TableField(value = "FWCS")
    @ApiModelProperty(value = "服务处所")
    private String fwcs;

    /**
     * 联系电话
     */
    @TableField(value = "LXDH")
    @ApiModelProperty(value = "联系电话")
    private String lxdh;

    /**
     * 国籍
     */
    @TableField(value = "GJ")
    @ApiModelProperty(value = "国籍")
    private String gj;

    /**
     * 指纹编号
     */
    @TableField(value = "ZWBH")
    @ApiModelProperty(value = "指纹编号")
    private String zwbh;

    /**
     * DNA编号
     */
    @TableField(value = "DNABH")
    @ApiModelProperty(value = "DNA编号")
    private String dnabh;

    /**
     * 口音
     */
    @TableField(value = "KY")
    @ApiModelProperty(value = "口音")
    private String ky;

    /**
     * 人员属性(代码)
     */
    @TableField(value = "RYSX")
    @ApiModelProperty(value = "人员属性(代码)")
    private String rysx;

    /**
     * 人员类别(代码)
     */
    @TableField(value = "RYLB")
    @ApiModelProperty(value = "人员类别(代码)")
    private String rylb;

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
     * 登记单位名称
     */
    @TableField(value = "DJDWMC")
    @ApiModelProperty(value = "登记单位名称")
    private String djdwmc;

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
     * QQ号码
     */
    @TableField(value = "QQ")
    @ApiModelProperty(value = "QQ号码")
    private String qq;

    /**
     * 微信号
     */
    @TableField(value = "WX")
    @ApiModelProperty(value = "微信号")
    private String wx;

    /**
     * 邮箱号
     */
    @TableField(value = "EMAIL")
    @ApiModelProperty(value = "邮箱号")
    private String email;

    /**
     * 备注
     */
    @TableField(value = "BZ")
    @ApiModelProperty(value = "备注")
    private String bz;

    /**
     * 人员来源 0 是ciis  1 一体化
     */
    @TableField(value = "RYLY")
    @ApiModelProperty(value = "人员来源 0 是ciis  1 一体化")
    private String ryly;

    /**
     * 其它内容录入（UC浏览器#账号#密码）
     */
    @TableField(value = "QT")
    @ApiModelProperty(value = "其它内容录入（UC浏览器#账号#密码）")
    private String qt;

    /**
     * 国家工作人员 0否 1是
     */
    @TableField(value = "GJGZRY")
    @ApiModelProperty(value = "国家工作人员 0否 1是")
    private String gjgzry;
}