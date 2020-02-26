package com.hzq.nacos.caseadmincommon.entity.feign.person;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: huzq
 * @Date: 2020/1/17/4:06 下午
 * @Description: case-admin
 */
@Data
public class TbAjAjxyr {
    /**
     * 关联ID,12位机构代码+8位年月日+10位顺序号
     */


    private String glid;

    /**
     * 人员编号
     */


    private String rybh;

    /**
     * 案件编号
     */


    private String ajbh;

    /**
     * 姓名
     */


    private String xm;

    /**
     * 姓名拼音
     */


    private String xmpy;

    /**
     * 身份证号
     */


    private String sfzh;

    /**
     * 户籍地区划
     */


    private String hjdqh;

    /**
     * 人员类型(代码)
     */


    private String rylx;

    /**
     * 保密级别(代码)
     */


    private String bmjb;

    /**
     * 嫌疑属性（代码）
     */


    private String xyrsx;

    /**
     * 现实情况（代码）
     */


    private String xsqk;

    /**
     * 可疑依据(代码)
     */


    private String kyyj;

    /**
     * 违法事实
     */


    private String wfss;

    /**
     * 违法犯罪经历
     */


    private String wffzjl;

    /**
     * 健康状况
     */


    private String jkzk;

    /**
     * 在逃形式(代码)
     */


    private String ztxs;

    /**
     * 在逃日期
     */


    private LocalDateTime ztrq;

    /**
     * 在逃编号
     */


    private String ztbh;

    /**
     * 抓获日期
     */


    private LocalDateTime zhrq;

    /**
     * 抓获单位
     */


    private String zhdw;

    /**
     * 抓获方式(代码)
     */


    private String zhfs;

    /**
     * 抓获地区(行政区划)
     */


    private String zhdq;

    /**
     * 抓获地域(代码)
     */


    private String zhdy;

    /**
     * 抓获地点
     */


    private String zhdd;

    /**
     * 抓获人
     */


    private String zhr;

    /**
     * 作案原因(代码)
     */


    private String zzyy;

    /**
     * 案件类别
     */


    private String ajlb;

    /**
     * 立案时间
     */


    private LocalDateTime lasj;

    /**
     * 破案时间
     */


    private LocalDateTime pasj;

    /**
     * 办案单位
     */


    private String badw;

    /**
     * 督捕级别（代码）
     */


    private String dbjb;

    /**
     * 有效性（1-有效，0-无效）
     */


    private String yxx;

    /**
     * 登记时间
     */


    private LocalDateTime djsj;

    /**
     * 登记单位
     */


    private String djdw;

    /**
     * 登记人
     */


    private String djr;

    /**
     * 登记人姓名
     */


    private String djrxm;

    /**
     * 修改时间
     */


    private LocalDateTime xgsj;

    /**
     * 修改单位
     */


    private String xgdw;

    /**
     * 修改人
     */


    private String xgr;

    /**
     * 修改人姓名
     */


    private String xgrxm;

    /**
     * 合并标识 0-非破案合并 1-破案合并
     */


    private String hbbs;

    /**
     * 关联时间
     */


    private LocalDateTime glsj;

    /**
     * 关联人
     */


    private String glr;

    /**
     * 关联人身份证号
     */


    private String glrsfzh;

    /**
     * 关联人姓名
     */


    private String glrxm;

    /**
     * 关联人单位代码
     */


    private String glrdwdm;

    /**
     * 关联人单位名称
     */


    private String glrdwmc;

    /**
     * 人员密级
     */


    private String ajmj;

    /**
     * 人员类别
     */


    private String wddRylb;

    /**
     * 案件类别
     */


    private String wddAjlb;

    /**
     * 人员角色
     */


    private String wddRyjs;

    /**
     * 通讯方式
     */


    private String wddTxfs;

    /**
     * 银行卡附件
     */


    private String wddYhkfj;

    /**
     * 手机号附件
     */


    private String wddSjhfj;

    /**
     * 刑专对接专用编号
     */


    private String xzbh;

    /**
     * 刑专对接GLID
     */


    private String xzGlid;

    /**
     * 人员背景（涉枪案件，字典SQRY_RYBJ）
     */


    private String rybj;

    /**
     * 部里反电诈对接
     */


    private String whid;

    /**
     * 吸毒人员序号
     */


    private String xdryxh;

    /**
     * 人员属性（字典XYR_RYSX）
     */


    private String rysx;

    /**
     * 性别
     */


    private String xb;

    /**
     * 出生日期
     */


    private LocalDateTime csrq;


    private String rydj;
}