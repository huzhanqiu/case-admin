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
@ApiModel(value = "com-hzq-nacos-caseadminperson-entity-docase-TbAjAjxyr")
@Data
@TableName(value = "TB_AJ_AJXYR")
public class TbAjAjxyr {
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
     * 身份证号
     */
    @TableField(value = "SFZH")
    @ApiModelProperty(value = "身份证号")
    private String sfzh;

    /**
     * 户籍地区划
     */
    @TableField(value = "HJDQH")
    @ApiModelProperty(value = "户籍地区划")
    private String hjdqh;

    /**
     * 人员类型(代码)
     */
    @TableField(value = "RYLX")
    @ApiModelProperty(value = "人员类型(代码)")
    private String rylx;

    /**
     * 保密级别(代码)
     */
    @TableField(value = "BMJB")
    @ApiModelProperty(value = "保密级别(代码)")
    private String bmjb;

    /**
     * 嫌疑属性（代码）
     */
    @TableField(value = "XYRSX")
    @ApiModelProperty(value = "嫌疑属性（代码）")
    private String xyrsx;

    /**
     * 现实情况（代码）
     */
    @TableField(value = "XSQK")
    @ApiModelProperty(value = "现实情况（代码）")
    private String xsqk;

    /**
     * 可疑依据(代码)
     */
    @TableField(value = "KYYJ")
    @ApiModelProperty(value = "可疑依据(代码)")
    private String kyyj;

    /**
     * 违法事实
     */
    @TableField(value = "WFSS")
    @ApiModelProperty(value = "违法事实")
    private String wfss;

    /**
     * 违法犯罪经历
     */
    @TableField(value = "WFFZJL")
    @ApiModelProperty(value = "违法犯罪经历")
    private String wffzjl;

    /**
     * 健康状况
     */
    @TableField(value = "JKZK")
    @ApiModelProperty(value = "健康状况")
    private String jkzk;

    /**
     * 在逃形式(代码)
     */
    @TableField(value = "ZTXS")
    @ApiModelProperty(value = "在逃形式(代码)")
    private String ztxs;

    /**
     * 在逃日期
     */
    @TableField(value = "ZTRQ")
    @ApiModelProperty(value = "在逃日期")
    private LocalDateTime ztrq;

    /**
     * 在逃编号
     */
    @TableField(value = "ZTBH")
    @ApiModelProperty(value = "在逃编号")
    private String ztbh;

    /**
     * 抓获日期
     */
    @TableField(value = "ZHRQ")
    @ApiModelProperty(value = "抓获日期")
    private LocalDateTime zhrq;

    /**
     * 抓获单位
     */
    @TableField(value = "ZHDW")
    @ApiModelProperty(value = "抓获单位")
    private String zhdw;

    /**
     * 抓获方式(代码)
     */
    @TableField(value = "ZHFS")
    @ApiModelProperty(value = "抓获方式(代码)")
    private String zhfs;

    /**
     * 抓获地区(行政区划)
     */
    @TableField(value = "ZHDQ")
    @ApiModelProperty(value = "抓获地区(行政区划)")
    private String zhdq;

    /**
     * 抓获地域(代码)
     */
    @TableField(value = "ZHDY")
    @ApiModelProperty(value = "抓获地域(代码)")
    private String zhdy;

    /**
     * 抓获地点
     */
    @TableField(value = "ZHDD")
    @ApiModelProperty(value = "抓获地点")
    private String zhdd;

    /**
     * 抓获人
     */
    @TableField(value = "ZHR")
    @ApiModelProperty(value = "抓获人")
    private String zhr;

    /**
     * 作案原因(代码)
     */
    @TableField(value = "ZZYY")
    @ApiModelProperty(value = "作案原因(代码)")
    private String zzyy;

    /**
     * 案件类别
     */
    @TableField(value = "AJLB")
    @ApiModelProperty(value = "案件类别")
    private String ajlb;

    /**
     * 立案时间
     */
    @TableField(value = "LASJ")
    @ApiModelProperty(value = "立案时间")
    private LocalDateTime lasj;

    /**
     * 破案时间
     */
    @TableField(value = "PASJ")
    @ApiModelProperty(value = "破案时间")
    private LocalDateTime pasj;

    /**
     * 办案单位
     */
    @TableField(value = "BADW")
    @ApiModelProperty(value = "办案单位")
    private String badw;

    /**
     * 督捕级别（代码）
     */
    @TableField(value = "DBJB")
    @ApiModelProperty(value = "督捕级别（代码）")
    private String dbjb;

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
     * 合并标识 0-非破案合并 1-破案合并
     */
    @TableField(value = "HBBS")
    @ApiModelProperty(value = "合并标识 0-非破案合并 1-破案合并")
    private String hbbs;

    /**
     * 关联时间
     */
    @TableField(value = "GLSJ")
    @ApiModelProperty(value = "关联时间")
    private LocalDateTime glsj;

    /**
     * 关联人
     */
    @TableField(value = "GLR")
    @ApiModelProperty(value = "关联人")
    private String glr;

    /**
     * 关联人身份证号
     */
    @TableField(value = "GLRSFZH")
    @ApiModelProperty(value = "关联人身份证号")
    private String glrsfzh;

    /**
     * 关联人姓名
     */
    @TableField(value = "GLRXM")
    @ApiModelProperty(value = "关联人姓名")
    private String glrxm;

    /**
     * 关联人单位代码
     */
    @TableField(value = "GLRDWDM")
    @ApiModelProperty(value = "关联人单位代码")
    private String glrdwdm;

    /**
     * 关联人单位名称
     */
    @TableField(value = "GLRDWMC")
    @ApiModelProperty(value = "关联人单位名称")
    private String glrdwmc;

    /**
     * 人员密级
     */
    @TableField(value = "AJMJ")
    @ApiModelProperty(value = "人员密级")
    private String ajmj;

    /**
     * 人员类别
     */
    @TableField(value = "WDD_RYLB")
    @ApiModelProperty(value = "人员类别")
    private String wddRylb;

    /**
     * 案件类别
     */
    @TableField(value = "WDD_AJLB")
    @ApiModelProperty(value = "案件类别")
    private String wddAjlb;

    /**
     * 人员角色
     */
    @TableField(value = "WDD_RYJS")
    @ApiModelProperty(value = "人员角色")
    private String wddRyjs;

    /**
     * 通讯方式
     */
    @TableField(value = "WDD_TXFS")
    @ApiModelProperty(value = "通讯方式")
    private String wddTxfs;

    /**
     * 银行卡附件
     */
    @TableField(value = "WDD_YHKFJ")
    @ApiModelProperty(value = "银行卡附件")
    private String wddYhkfj;

    /**
     * 手机号附件
     */
    @TableField(value = "WDD_SJHFJ")
    @ApiModelProperty(value = "手机号附件")
    private String wddSjhfj;

    /**
     * 刑专对接专用编号
     */
    @TableField(value = "XZBH")
    @ApiModelProperty(value = "刑专对接专用编号")
    private String xzbh;

    /**
     * 刑专对接GLID
     */
    @TableField(value = "XZ_GLID")
    @ApiModelProperty(value = "刑专对接GLID")
    private String xzGlid;

    /**
     * 人员背景（涉枪案件，字典SQRY_RYBJ）
     */
    @TableField(value = "RYBJ")
    @ApiModelProperty(value = "人员背景（涉枪案件，字典SQRY_RYBJ）")
    private String rybj;

    /**
     * 部里反电诈对接
     */
    @TableField(value = "WHID")
    @ApiModelProperty(value = "部里反电诈对接")
    private String whid;

    /**
     * 吸毒人员序号
     */
    @TableField(value = "XDRYXH")
    @ApiModelProperty(value = "吸毒人员序号")
    private String xdryxh;

    /**
     * 人员属性（字典XYR_RYSX）
     */
    @TableField(value = "RYSX")
    @ApiModelProperty(value = "人员属性（字典XYR_RYSX）")
    private String rysx;

    /**
     * 性别
     */
    @TableField(value = "XB")
    @ApiModelProperty(value = "性别")
    private String xb;

    /**
     * 出生日期
     */
    @TableField(value = "CSRQ")
    @ApiModelProperty(value = "出生日期")
    private LocalDateTime csrq;

    @TableField(value = "RYDJ")
    @ApiModelProperty(value = "")
    private String rydj;
}