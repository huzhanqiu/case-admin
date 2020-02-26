package com.hzq.nacos.caseadmindocase.entity.ajjbxx;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * @Author: huzq
 * @Date: 2020/1/17/2:54 下午
 * @Description: case-admin
 */
@ApiModel(value = "TbStAjjbxx")
@Data
@TableName(value = "TB_ST_AJJBXX")
public class TbStAjjbxx {
    /**
     * 案件编号
     */
    @TableId(value = "AJBH")
    @ApiModelProperty(value = "案件编号")
    private String ajbh;

    /**
     * 记录编号
     */
    @TableField(value = "JLBH")
    @ApiModelProperty(value = "记录编号")
    private String jlbh;

    /**
     * 现勘编号
     */
    @TableField(value = "XKBH")
    @ApiModelProperty(value = "现勘编号")
    private String xkbh;

    /**
     * 案件密级（代码）
     */
    @TableField(value = "AJMJ")
    @ApiModelProperty(value = "案件密级（代码）")
    private String ajmj;

    /**
     * 案件类别（代码）
     */
    @TableField(value = "AJLB")
    @ApiModelProperty(value = "案件类别（代码）")
    private String ajlb;

    /**
     * 案件类别_类案(代码)
     */
    @TableField(value = "AJLB_LA")
    @ApiModelProperty(value = "案件类别_类案(代码)")
    private String ajlbLa;

    /**
     * 案件名称
     */
    @TableField(value = "AJMC")
    @ApiModelProperty(value = "案件名称")
    private String ajmc;

    /**
     * 案件主题词
     */
    @TableField(value = "AJZTC")
    @ApiModelProperty(value = "案件主题词")
    private String ajztc;

    /**
     * 案件状态（代码）
     */
    @TableField(value = "AJZT")
    @ApiModelProperty(value = "案件状态（代码）")
    private String ajzt;

    /**
     * 案件来源（代码）
     */
    @TableField(value = "AJLY")
    @ApiModelProperty(value = "案件来源（代码）")
    private String ajly;

    /**
     * 案件督办级别(代码)
     */
    @TableField(value = "AJDBJB")
    @ApiModelProperty(value = "案件督办级别(代码)")
    private String ajdbjb;

    /**
     * 督办编号
     */
    @TableField(value = "AJDBBH")
    @ApiModelProperty(value = "督办编号")
    private String ajdbbh;

    /**
     * 报案人姓名
     */
    @TableField(value = "BARXM")
    @ApiModelProperty(value = "报案人姓名")
    private String barxm;

    /**
     * 报案人性别(代码)
     */
    @TableField(value = "BARXB")
    @ApiModelProperty(value = "报案人性别(代码)")
    private String barxb;

    /**
     * 出生日期
     */
    @TableField(value = "BARCSRQ")
    @ApiModelProperty(value = "出生日期")
    private LocalDateTime barcsrq;

    /**
     * 报案人单位
     */
    @TableField(value = "BARDW")
    @ApiModelProperty(value = "报案人单位")
    private String bardw;

    /**
     * 报案人联系方式
     */
    @TableField(value = "BARLXFS")
    @ApiModelProperty(value = "报案人联系方式")
    private String barlxfs;

    /**
     * 报案人住址
     */
    @TableField(value = "BARZZ")
    @ApiModelProperty(value = "报案人住址")
    private String barzz;

    /**
     * 报案人证件种类(代码)
     */
    @TableField(value = "BARZJZL")
    @ApiModelProperty(value = "报案人证件种类(代码)")
    private String barzjzl;

    /**
     * 报案人证件号码
     */
    @TableField(value = "BARZJHM")
    @ApiModelProperty(value = "报案人证件号码")
    private String barzjhm;

    /**
     * 报案人保密级别
     */
    @TableField(value = "BARBMJB")
    @ApiModelProperty(value = "报案人保密级别")
    private String barbmjb;

    /**
     * 报案单位名称
     */
    @TableField(value = "BADWMC")
    @ApiModelProperty(value = "报案单位名称")
    private String badwmc;

    /**
     * 报案单位地址
     */
    @TableField(value = "BADWDZ")
    @ApiModelProperty(value = "报案单位地址")
    private String badwdz;

    /**
     * 报案单位联系人
     */
    @TableField(value = "BADWLXR")
    @ApiModelProperty(value = "报案单位联系人")
    private String badwlxr;

    /**
     * 报案单位联系方式
     */
    @TableField(value = "BADWLXFS")
    @ApiModelProperty(value = "报案单位联系方式")
    private String badwlxfs;

    /**
     * 报案时间
     */
    @TableField(value = "BASJ")
    @ApiModelProperty(value = "报案时间")
    private LocalDateTime basj;

    /**
     * 发现时间
     */
    @TableField(value = "FXSJ")
    @ApiModelProperty(value = "发现时间")
    private LocalDateTime fxsj;

    /**
     * 发案时间上限
     */
    @TableField(value = "FASJSX")
    @ApiModelProperty(value = "发案时间上限")
    private LocalDateTime fasjsx;

    /**
     * 发案时间下限
     */
    @TableField(value = "FASJXX")
    @ApiModelProperty(value = "发案时间下限")
    private LocalDateTime fasjxx;

    /**
     * 案件省市区县(行政区划)
     */
    @TableField(value = "AJSSQX")
    @ApiModelProperty(value = "案件省市区县(行政区划)")
    private String ajssqx;

    /**
     * 案件发案地责任区(机构代码)
     */
    @TableField(value = "AJFADZRQ")
    @ApiModelProperty(value = "案件发案地责任区(机构代码)")
    private String ajfadzrq;

    /**
     * 街路巷(代码)
     */
    @TableField(value = "AJJLX")
    @ApiModelProperty(value = "街路巷(代码)")
    private String ajjlx;

    /**
     * 门楼牌号
     */
    @TableField(value = "AJMLPH")
    @ApiModelProperty(value = "门楼牌号")
    private String ajmlph;

    /**
     * 门牌后缀(代码)
     */
    @TableField(value = "AJMPHZ")
    @ApiModelProperty(value = "门牌后缀(代码)")
    private String ajmphz;

    /**
     * 门楼详址
     */
    @TableField(value = "AJMLXZ")
    @ApiModelProperty(value = "门楼详址")
    private String ajmlxz;

    /**
     * 发案详细地址
     */
    @TableField(value = "AJDZ")
    @ApiModelProperty(value = "发案详细地址")
    private String ajdz;

    /**
     * 所属责任区(机构代码)
     */
    @TableField(value = "AJSSZRQ")
    @ApiModelProperty(value = "所属责任区(机构代码)")
    private String ajsszrq;

    /**
     * 所属责任区名称
     */
    @TableField(value = "AJSSZRQMC")
    @ApiModelProperty(value = "所属责任区名称")
    private String ajsszrqmc;

    /**
     * 案件受理字号
     */
    @TableField(value = "SLZH")
    @ApiModelProperty(value = "案件受理字号")
    private String slzh;

    /**
     * 案件受理时间
     */
    @TableField(value = "SLSJ")
    @ApiModelProperty(value = "案件受理时间")
    private LocalDateTime slsj;

    /**
     * 案件受理人
     */
    @TableField(value = "SLR")
    @ApiModelProperty(value = "案件受理人")
    private String slr;

    /**
     * 案件受理人姓名
     */
    @TableField(value = "SLRXM")
    @ApiModelProperty(value = "案件受理人姓名")
    private String slrxm;

    /**
     * 案件受理单位
     */
    @TableField(value = "SLRDW")
    @ApiModelProperty(value = "案件受理单位")
    private String slrdw;

    /**
     * 案件受理单位名称
     */
    @TableField(value = "SLRDWMC")
    @ApiModelProperty(value = "案件受理单位名称")
    private String slrdwmc;

    /**
     * 案件受理方式(代码)
     */
    @TableField(value = "SLFS")
    @ApiModelProperty(value = "案件受理方式(代码)")
    private String slfs;

    /**
     * 案件受理单位联系电话
     */
    @TableField(value = "SLDWDH")
    @ApiModelProperty(value = "案件受理单位联系电话")
    private String sldwdh;

    /**
     * 接报民警
     */
    @TableField(value = "SLJBMJ")
    @ApiModelProperty(value = "接报民警")
    private String sljbmj;

    /**
     * 接报时间
     */
    @TableField(value = "SLJBSJ")
    @ApiModelProperty(value = "接报时间")
    private LocalDateTime sljbsj;

    /**
     * 案件受理接报地点
     */
    @TableField(value = "SLJBDD")
    @ApiModelProperty(value = "案件受理接报地点")
    private String sljbdd;

    /**
     * 受案意见，代码
     */
    @TableField(value = "SLSAYJ")
    @ApiModelProperty(value = "受案意见，代码")
    private String slsayj;

    /**
     * 受案意见移送其它单位
     */
    @TableField(value = "SLYJYS")
    @ApiModelProperty(value = "受案意见移送其它单位")
    private String slyjys;

    /**
     * 受案意见其它
     */
    @TableField(value = "SLYJQT")
    @ApiModelProperty(value = "受案意见其它")
    private String slyjqt;

    /**
     * 受案审批结果，代码
     */
    @TableField(value = "SASPJG")
    @ApiModelProperty(value = "受案审批结果，代码")
    private String saspjg;

    /**
     * 受理审批意见
     */
    @TableField(value = "SLSPYJ")
    @ApiModelProperty(value = "受理审批意见")
    private String slspyj;

    /**
     * 受案审批人
     */
    @TableField(value = "SASPR")
    @ApiModelProperty(value = "受案审批人")
    private String saspr;

    /**
     * 受案审批人姓名
     */
    @TableField(value = "SASPRXM")
    @ApiModelProperty(value = "受案审批人姓名")
    private String sasprxm;

    /**
     * 受案审批时间
     */
    @TableField(value = "SASPSJ")
    @ApiModelProperty(value = "受案审批时间")
    private LocalDateTime saspsj;

    /**
     * 案件简要案情
     */
    @TableField(value = "JYAQ")
    @ApiModelProperty(value = "案件简要案情")
    private String jyaq;

    /**
     * 案件主办单位
     */
    @TableField(value = "ZBDW")
    @ApiModelProperty(value = "案件主办单位")
    private String zbdw;

    /**
     * 案件主办单位名称
     */
    @TableField(value = "ZBDWMC")
    @ApiModelProperty(value = "案件主办单位名称")
    private String zbdwmc;

    /**
     * 案件协办单位
     */
    @TableField(value = "XBDW")
    @ApiModelProperty(value = "案件协办单位")
    private String xbdw;

    /**
     * 案件直属办案单位
     */
    @TableField(value = "ZSBADW")
    @ApiModelProperty(value = "案件直属办案单位")
    private String zsbadw;

    /**
     * 案件直属办案单位名称
     */
    @TableField(value = "ZSBADWMC")
    @ApiModelProperty(value = "案件直属办案单位名称")
    private String zsbadwmc;

    /**
     * 案件主办人
     */
    @TableField(value = "ZBR")
    @ApiModelProperty(value = "案件主办人")
    private String zbr;

    /**
     * 案件主办人姓名
     */
    @TableField(value = "ZBRXM")
    @ApiModelProperty(value = "案件主办人姓名")
    private String zbrxm;

    /**
     * 案件主办人联系电话
     */
    @TableField(value = "ZBRDH")
    @ApiModelProperty(value = "案件主办人联系电话")
    private String zbrdh;

    /**
     * 案件协办人
     */
    @TableField(value = "XBR")
    @ApiModelProperty(value = "案件协办人")
    private String xbr;

    /**
     * 案件协办人姓名
     */
    @TableField(value = "XBRXM")
    @ApiModelProperty(value = "案件协办人姓名")
    private String xbrxm;

    /**
     * 案件审查到期时间
     */
    @TableField(value = "SCDQSJ")
    @ApiModelProperty(value = "案件审查到期时间")
    private LocalDateTime scdqsj;

    /**
     * 案件审查时间
     */
    @TableField(value = "SCSJ")
    @ApiModelProperty(value = "案件审查时间")
    private LocalDateTime scsj;

    /**
     * 案件审核结果(代码)
     */
    @TableField(value = "SHJG")
    @ApiModelProperty(value = "案件审核结果(代码)")
    private String shjg;

    /**
     * 案件审批结果(代码)
     */
    @TableField(value = "SPJG")
    @ApiModelProperty(value = "案件审批结果(代码)")
    private String spjg;

    /**
     * 案件承办单位审核结果(代码)
     */
    @TableField(value = "CBDWSHJG")
    @ApiModelProperty(value = "案件承办单位审核结果(代码)")
    private String cbdwshjg;

    /**
     * 案件立案时间
     */
    @TableField(value = "LASJ")
    @ApiModelProperty(value = "案件立案时间")
    private LocalDateTime lasj;

    /**
     * 案件立案单位
     */
    @TableField(value = "LADW")
    @ApiModelProperty(value = "案件立案单位")
    private String ladw;

    /**
     * 案件立案单位名称
     */
    @TableField(value = "LADWMC")
    @ApiModelProperty(value = "案件立案单位名称")
    private String ladwmc;

    /**
     * 案件立案批准人
     */
    @TableField(value = "LAPZR")
    @ApiModelProperty(value = "案件立案批准人")
    private String lapzr;

    /**
     * 案件立案批准人姓名
     */
    @TableField(value = "LAPZRXM")
    @ApiModelProperty(value = "案件立案批准人姓名")
    private String lapzrxm;

    /**
     * 案件补立原因(代码)
     */
    @TableField(value = "BLYY")
    @ApiModelProperty(value = "案件补立原因(代码)")
    private String blyy;

    /**
     * 案件撤销日期
     */
    @TableField(value = "CXRQ")
    @ApiModelProperty(value = "案件撤销日期")
    private LocalDateTime cxrq;

    /**
     * 案件撤销单位
     */
    @TableField(value = "CXDW")
    @ApiModelProperty(value = "案件撤销单位")
    private String cxdw;

    /**
     * 案件撤销单位名称
     */
    @TableField(value = "CXDWMC")
    @ApiModelProperty(value = "案件撤销单位名称")
    private String cxdwmc;

    /**
     * 案件撤销批准人
     */
    @TableField(value = "CXPZR")
    @ApiModelProperty(value = "案件撤销批准人")
    private String cxpzr;

    /**
     * 案件撤销批准人姓名
     */
    @TableField(value = "CXPZRXM")
    @ApiModelProperty(value = "案件撤销批准人姓名")
    private String cxpzrxm;

    /**
     * 案件撤销原因(代码)
     */
    @TableField(value = "CXYY")
    @ApiModelProperty(value = "案件撤销原因(代码)")
    private String cxyy;

    /**
     * 案件移送单位
     */
    @TableField(value = "YSDW")
    @ApiModelProperty(value = "案件移送单位")
    private String ysdw;

    /**
     * 案件移送单位名称
     */
    @TableField(value = "YSDWMC")
    @ApiModelProperty(value = "案件移送单位名称")
    private String ysdwmc;

    /**
     * 案件移送人
     */
    @TableField(value = "YSR")
    @ApiModelProperty(value = "案件移送人")
    private String ysr;

    /**
     * 案件移送人姓名
     */
    @TableField(value = "YSRXM")
    @ApiModelProperty(value = "案件移送人姓名")
    private String ysrxm;

    /**
     * 案件移送单位联系电话
     */
    @TableField(value = "YSDWLXDH")
    @ApiModelProperty(value = "案件移送单位联系电话")
    private String ysdwlxdh;

    /**
     * 案件移送原因
     */
    @TableField(value = "YSYY")
    @ApiModelProperty(value = "案件移送原因")
    private String ysyy;

    /**
     * 案件移送时间
     */
    @TableField(value = "YSSJ")
    @ApiModelProperty(value = "案件移送时间")
    private LocalDateTime yssj;

    /**
     * 案件移送接收单位
     */
    @TableField(value = "JSDW")
    @ApiModelProperty(value = "案件移送接收单位")
    private String jsdw;

    /**
     * 案件移送接收单位名称
     */
    @TableField(value = "JSDWMC")
    @ApiModelProperty(value = "案件移送接收单位名称")
    private String jsdwmc;

    /**
     * 案件移送外部接收单位
     */
    @TableField(value = "WBJSDWMC")
    @ApiModelProperty(value = "案件移送外部接收单位")
    private String wbjsdwmc;

    /**
     * 案件移送接收人
     */
    @TableField(value = "JSR")
    @ApiModelProperty(value = "案件移送接收人")
    private String jsr;

    /**
     * 案件移送接收人姓名
     */
    @TableField(value = "JSRXM")
    @ApiModelProperty(value = "案件移送接收人姓名")
    private String jsrxm;

    /**
     * 案件移送外部接收人
     */
    @TableField(value = "WBJSRXM")
    @ApiModelProperty(value = "案件移送外部接收人")
    private String wbjsrxm;

    /**
     * 案件移送接收单位联系电话
     */
    @TableField(value = "YSJSDWLXDH")
    @ApiModelProperty(value = "案件移送接收单位联系电话")
    private String ysjsdwlxdh;

    /**
     * 案件移送接收时间
     */
    @TableField(value = "JSSJ")
    @ApiModelProperty(value = "案件移送接收时间")
    private LocalDateTime jssj;

    /**
     * 案件破案方式(代码)
     */
    @TableField(value = "PAFS")
    @ApiModelProperty(value = "案件破案方式(代码)")
    private String pafs;

    /**
     * 案件破案类型(代码)
     */
    @TableField(value = "PALX")
    @ApiModelProperty(value = "案件破案类型(代码)")
    private String palx;

    /**
     * 案件破案单位
     */
    @TableField(value = "PADW")
    @ApiModelProperty(value = "案件破案单位")
    private String padw;

    /**
     * 案件破案单位名称
     */
    @TableField(value = "PADWMC")
    @ApiModelProperty(value = "案件破案单位名称")
    private String padwmc;

    /**
     * 案件协破单位
     */
    @TableField(value = "XPDW")
    @ApiModelProperty(value = "案件协破单位")
    private String xpdw;

    /**
     * 案件破案简况
     */
    @TableField(value = "PAJK")
    @ApiModelProperty(value = "案件破案简况")
    private String pajk;

    /**
     * 案件破案日期
     */
    @TableField(value = "PARQ")
    @ApiModelProperty(value = "案件破案日期")
    private LocalDateTime parq;

    /**
     * 案件破案批准时间
     */
    @TableField(value = "PAPZSJ")
    @ApiModelProperty(value = "案件破案批准时间")
    private LocalDateTime papzsj;

    /**
     * 案件破案批准单位
     */
    @TableField(value = "PAPZDW")
    @ApiModelProperty(value = "案件破案批准单位")
    private String papzdw;

    /**
     * 案件破案批准人
     */
    @TableField(value = "PAPZR")
    @ApiModelProperty(value = "案件破案批准人")
    private String papzr;

    /**
     * 案件结案日期
     */
    @TableField(value = "JARQ")
    @ApiModelProperty(value = "案件结案日期")
    private LocalDateTime jarq;

    /**
     * 案件涉案总价值
     */
    @TableField(value = "SAZJZ")
    @ApiModelProperty(value = "案件涉案总价值")
    private BigDecimal sazjz;

    /**
     * 案件经济损失
     */
    @TableField(value = "JJSS")
    @ApiModelProperty(value = "案件经济损失")
    private BigDecimal jjss;

    /**
     * 案件人员受伤数
     */
    @TableField(value = "AJRYSSS")
    @ApiModelProperty(value = "案件人员受伤数")
    private BigDecimal ajrysss;

    /**
     * 案件人员死亡数
     */
    @TableField(value = "AJRYSWS")
    @ApiModelProperty(value = "案件人员死亡数")
    private BigDecimal ajrysws;

    /**
     * 案件是否有现场(代码)
     */
    @TableField(value = "SFYXC")
    @ApiModelProperty(value = "案件是否有现场(代码)")
    private String sfyxc;

    /**
     * 案件是否勘查现场（代码）
     */
    @TableField(value = "SFKCXC")
    @ApiModelProperty(value = "案件是否勘查现场（代码）")
    private String sfkcxc;

    /**
     * 案件是否命案（代码）
     */
    @TableField(value = "SFMA")
    @ApiModelProperty(value = "案件是否命案（代码）")
    private String sfma;

    /**
     * 有效性1-有效，0-无效
     */
    @TableField(value = "YXX")
    @ApiModelProperty(value = "有效性1-有效，0-无效")
    private String yxx;

    /**
     * 案件登记时间
     */
    @TableField(value = "DJSJ")
    @ApiModelProperty(value = "案件登记时间")
    private LocalDateTime djsj;

    /**
     * 案件登记人
     */
    @TableField(value = "DJR")
    @ApiModelProperty(value = "案件登记人")
    private String djr;

    /**
     * 案件登记人姓名
     */
    @TableField(value = "DJRXM")
    @ApiModelProperty(value = "案件登记人姓名")
    private String djrxm;

    /**
     * 案件登记单位
     */
    @TableField(value = "DJDW")
    @ApiModelProperty(value = "案件登记单位")
    private String djdw;

    /**
     * 案件登记单位名称
     */
    @TableField(value = "DJDWMC")
    @ApiModelProperty(value = "案件登记单位名称")
    private String djdwmc;

    /**
     * 案件修改时间
     */
    @TableField(value = "XGSJ")
    @ApiModelProperty(value = "案件修改时间")
    private LocalDateTime xgsj;

    /**
     * 案件修改人
     */
    @TableField(value = "XGR")
    @ApiModelProperty(value = "案件修改人")
    private String xgr;

    /**
     * 案件修改单位
     */
    @TableField(value = "XGDW")
    @ApiModelProperty(value = "案件修改单位")
    private String xgdw;

    /**
     * 案件修改单位名称
     */
    @TableField(value = "XGDWMC")
    @ApiModelProperty(value = "案件修改单位名称")
    private String xgdwmc;

    /**
     * 文书状态：0未生成文书，1已生成文书(主要用来判断是否生成受案登记表)
     */
    @TableField(value = "WSZT")
    @ApiModelProperty(value = "文书状态：0未生成文书，1已生成文书(主要用来判断是否生成受案登记表)")
    private String wszt;

    /**
     * 文书编号（受案登记表对应的文书表JLBH）
     */
    @TableField(value = "WSBH")
    @ApiModelProperty(value = "文书编号（受案登记表对应的文书表JLBH）")
    private String wsbh;

    /**
     * 主办人身份证号
     */
    @TableField(value = "ZBRSFZH")
    @ApiModelProperty(value = "主办人身份证号")
    private String zbrsfzh;

    /**
     * 登记人身份证号
     */
    @TableField(value = "DJRSFZH")
    @ApiModelProperty(value = "登记人身份证号")
    private String djrsfzh;

    /**
     * 是否专案，默认0
     */
    @TableField(value = "SFZA")
    @ApiModelProperty(value = "是否专案，默认0")
    private String sfza;

    /**
     * 专案设置人身份证号
     */
    @TableField(value = "ZASZRSFZH")
    @ApiModelProperty(value = "专案设置人身份证号")
    private String zaszrsfzh;

    /**
     * 专案设置人姓名
     */
    @TableField(value = "ZASZRXM")
    @ApiModelProperty(value = "专案设置人姓名")
    private String zaszrxm;

    /**
     * 专案设置人单位
     */
    @TableField(value = "ZASZRDW")
    @ApiModelProperty(value = "专案设置人单位")
    private String zaszrdw;

    /**
     * 专案设置时间
     */
    @TableField(value = "ZASZSJ")
    @ApiModelProperty(value = "专案设置时间")
    private LocalDateTime zaszsj;

    /**
     * 受理人身份证号
     */
    @TableField(value = "SLRSFZH")
    @ApiModelProperty(value = "受理人身份证号")
    private String slrsfzh;

    /**
     * 协办人身份证号
     */
    @TableField(value = "XBRSFZH")
    @ApiModelProperty(value = "协办人身份证号")
    private String xbrsfzh;

    /**
     * 受案登记表文书编号
     */
    @TableField(value = "DJB_WSBH")
    @ApiModelProperty(value = "受案登记表文书编号")
    private String djbWsbh;

    /**
     * 受案登记表文书文号
     */
    @TableField(value = "DJB_WSWH")
    @ApiModelProperty(value = "受案登记表文书文号")
    private String djbWswh;

    /**
     * 受案登记表文书状态
     */
    @TableField(value = "DJB_WSZT")
    @ApiModelProperty(value = "受案登记表文书状态")
    private String djbWszt;

    /**
     * 受案回执文书编号
     */
    @TableField(value = "SAHZ_WSBH")
    @ApiModelProperty(value = "受案回执文书编号")
    private String sahzWsbh;

    /**
     * 受案回执文书状态
     */
    @TableField(value = "SAHZ_WSZT")
    @ApiModelProperty(value = "受案回执文书状态")
    private String sahzWszt;

    /**
     * 警综案件副类别
     */
    @TableField(value = "JZAJFAB")
    @ApiModelProperty(value = "警综案件副类别")
    private String jzajfab;

    /**
     * 警综案件类别
     */
    @TableField(value = "JZAJLB")
    @ApiModelProperty(value = "警综案件类别")
    private String jzajlb;

    /**
     * 案件类别小类代码
     */
    @TableField(value = "AJLBXLDM")
    @ApiModelProperty(value = "案件类别小类代码")
    private String ajlbxldm;

    /**
     * 特殊手段类别代码
     */
    @TableField(value = "TSSDLBDM")
    @ApiModelProperty(value = "特殊手段类别代码")
    private String tssdlbdm;

    /**
     * 案件来源标识(1:JZPT/2:CIIS)
     */
    @TableField(value = "AJLYBS")
    @ApiModelProperty(value = "案件来源标识(1:JZPT/2:CIIS)")
    private String ajlybs;

    /**
     * 受案回执单号
     */
    @TableField(value = "SAHZDH")
    @ApiModelProperty(value = "受案回执单号")
    private String sahzdh;

    /**
     * 是否合格，0：不合格 1：合格 -1：未审核
     */
    @TableField(value = "SFHG")
    @ApiModelProperty(value = "是否合格，0：不合格 1：合格 -1：未审核")
    private String sfhg;

    /**
     * 案件质审理由
     */
    @TableField(value = "AJZSLY")
    @ApiModelProperty(value = "案件质审理由")
    private String ajzsly;

    /**
     * 手机摸排结果
     */
    @TableField(value = "SJMPJG")
    @ApiModelProperty(value = "手机摸排结果")
    private String sjmpjg;

    /**
     * 刑专对接编号
     */
    @TableField(value = "XZBH")
    @ApiModelProperty(value = "刑专对接编号")
    private String xzbh;

    /**
     * 用于对部里案件传输标志案件类别
     */
    @TableField(value = "CASE_TYPE")
    @ApiModelProperty(value = "用于对部里案件传输标志案件类别")
    private String caseType;

    /**
     * 武汉id用于对部里案件传输
     */
    @TableField(value = "WHID")
    @ApiModelProperty(value = "武汉id用于对部里案件传输")
    private String whid;

    /**
     * 枪支来源（涉枪案件-枪支来源，字典SQAJ_QZLY）
     */
    @TableField(value = "QZLY")
    @ApiModelProperty(value = "枪支来源（涉枪案件-枪支来源，字典SQAJ_QZLY）")
    private String qzly;

    /**
     * 是否盗窃电动车（0：否  1：是）
     */
    @TableField(value = "SFDQDDC")
    @ApiModelProperty(value = "是否盗窃电动车（0：否  1：是）")
    private String sfdqddc;

    /**
     * RFID编号(电动车)
     */
    @TableField(value = "RFID")
    @ApiModelProperty(value = "RFID编号(电动车)")
    private String rfid;

    /**
     * 贩运方式代码
     */
    @TableField(value = "FYFSDM")
    @ApiModelProperty(value = "贩运方式代码")
    private String fyfsdm;

    /**
     * 备注
     */
    @TableField(value = "BZ")
    @ApiModelProperty(value = "备注")
    private String bz;

    /**
     * 见证人提供情况
     */
    @TableField(value = "JZRTGQK")
    @ApiModelProperty(value = "见证人提供情况")
    private String jzrtgqk;

    /**
     * 承办人姓名
     */
    @TableField(value = "CBRXM")
    @ApiModelProperty(value = "承办人姓名")
    private String cbrxm;

    /**
     * 承办人联系电话
     */
    @TableField(value = "CBR_LXDH")
    @ApiModelProperty(value = "承办人联系电话")
    private String cbrLxdh;

    /**
     * 承办人2姓名
     */
    @TableField(value = "CBRXM2")
    @ApiModelProperty(value = "承办人2姓名")
    private String cbrxm2;

    /**
     * 承办人2联系电话
     */
    @TableField(value = "CBR_LXDH2")
    @ApiModelProperty(value = "承办人2联系电话")
    private String cbrLxdh2;

    /**
     * 藏毒方式代码
     */
    @TableField(value = "CDFSDM")
    @ApiModelProperty(value = "藏毒方式代码")
    private String cdfsdm;

    /**
     * 是否黑社会
     */
    @TableField(value = "SFHSH")
    @ApiModelProperty(value = "是否黑社会")
    private Short sfhsh;

    /**
     * 是否武装贩毒
     */
    @TableField(value = "SFWZFD")
    @ApiModelProperty(value = "是否武装贩毒")
    private Short sfwzfd;

    /**
     * 犯罪团伙/集团名称
     */
    @TableField(value = "FZTHMC")
    @ApiModelProperty(value = "犯罪团伙/集团名称")
    private String fzthmc;

    /**
     * 犯罪团伙/集团类型
     */
    @TableField(value = "FZTHXZDM")
    @ApiModelProperty(value = "犯罪团伙/集团类型")
    private String fzthxzdm;

    /**
     * 互联网案件类型
     */
    @TableField(value = "HLWAJLX")
    @ApiModelProperty(value = "互联网案件类型")
    private String hlwajlx;

    /**
     * 其他说明（互联网）
     */
    @TableField(value = "QTSM")
    @ApiModelProperty(value = "其他说明（互联网）")
    private String qtsm;

    /**
     * 是否互联网案件
     */
    @TableField(value = "SFHLWAJ")
    @ApiModelProperty(value = "是否互联网案件")
    private Short sfhlwaj;

    /**
     * 涉毒洗钱方式
     */
    @TableField(value = "SDXQFS")
    @ApiModelProperty(value = "涉毒洗钱方式")
    private String sdxqfs;

    /**
     * 其他说明（洗钱）
     */
    @TableField(value = "XQQTSM")
    @ApiModelProperty(value = "其他说明（洗钱）")
    private String xqqtsm;

    /**
     * 用于对部里案件传输标志案件类别细类
     */
    @TableField(value = "CASE_TYPEXL")
    @ApiModelProperty(value = "用于对部里案件传输标志案件类别细类")
    private String caseTypexl;
}