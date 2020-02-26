package com.hzq.nacos.caseadmindocase.config.mp;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.extension.incrementer.OracleKeyGenerator;
import com.baomidou.mybatisplus.extension.parsers.BlockAttackSqlParser;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import net.sf.jsqlparser.statement.delete.Delete;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: huzq
 * @Date: 2019-02-26/21:11
 * @Description: zhjd
 */
@EnableTransactionManagement
@Configuration
@MapperScan(basePackages = {"com.hzq.nacos.caseadminauth.mapper"})
public class MybatisPlusConfig {
    //    @Bean
    public IdentifierGenerator idGenerator() {
        return new CustomIdGenerator();
    }

    @Bean
    public OracleKeyGenerator oracleKeyGenerator() {
        return new OracleKeyGenerator();
    }

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        List<ISqlParser> sqlParserList = new ArrayList<>();
        // 攻击 SQL 阻断解析器、加入解析链
        sqlParserList.add(new BlockAttackSqlParser() {
            @Override
            public void processDelete(Delete delete) {
                // 如果你想自定义做点什么，可以重写父类方法像这样子
                if ("user".equals(delete.getTable().getName())) {
                    // 自定义跳过某个表，其他关联表可以调用 delete.getTables() 判断
                    return;
                }
                super.processDelete(delete);
            }
        });
        paginationInterceptor.setSqlParserList(sqlParserList);
        return paginationInterceptor;
    }
}

