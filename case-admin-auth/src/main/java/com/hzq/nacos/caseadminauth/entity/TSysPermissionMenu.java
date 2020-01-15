package com.hzq.nacos.caseadminauth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/** * 
@Author: huzq 
* @Date: 2020/1/14/11:04 下午 
* @Description: case-admin
* */    
@Data
@TableName(value = "T_SYS_PERMISSION_MENU")
public class TSysPermissionMenu {
    /**
     * 菜单编号(主键)
     */
    @TableField(value = "MENUID")
    private String menuid;

    /**
     * 权限编号(主键或代码)
     */
    @TableField(value = "PERMITID")
    private String permitid;
}