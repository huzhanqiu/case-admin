package com.hzq.nacos.caseadminauth.entity.xtrz;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 登录日志表
 * </p>
 *
 * @author huzq@zgjzd.cn
 * @since 2019-03-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("TB_XT_RZ_DL")
@ApiModel(value = "TbXtRzDl对象", description = "登录日志表")
public class TbXtRzDl implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "登陆日志ID")
    @TableId("DLRZID")
    private String dlrzid;

    @ApiModelProperty(value = "身份证号")
    @TableField("SFZH")
    private String sfzh;

    @ApiModelProperty(value = "用户标识")
    @TableField("YHBS")
    private String yhbs;

    @ApiModelProperty(value = "姓名")
    @TableField("XM")
    private String xm;

    @ApiModelProperty(value = "单位代码")
    @TableField("DWDM")
    private String dwdm;

    @ApiModelProperty(value = "单位名称")
    @TableField("DWMC")
    private String dwmc;

    @ApiModelProperty(value = "成功标识")
    @TableField("CGBS")
    private String cgbs;

    @ApiModelProperty(value = "登录时间")
    @TableField("DLSJ")
    private String dlsj;

    @ApiModelProperty(value = "登录IP")
    @TableField("IP")
    private String ip;

    @ApiModelProperty(value = "有效性")
    @TableField("YXX")
    @TableLogic
    private String yxx;

    @ApiModelProperty(value = "错误信息")
    @TableField("ERROR")
    private String error;

    @ApiModelProperty(value = "警号")
    @TableField("JH")
    private String jh;

}
