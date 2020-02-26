package com.hzq.nacos.caseadmindocase.mapper.ajjbxx;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hzq.nacos.caseadmindocase.entity.ajjbxx.TbStAjjbxx;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: huzq
 * @Date: 2020/1/17/2:54 下午
 * @Description: case-admin
 */
public interface TbStAjjbxxMapper extends BaseMapper<TbStAjjbxx> {
    /**
     * @param ajbh
     * @return
     */
    boolean updateDjsj(@Param("ajbh") String ajbh);
}