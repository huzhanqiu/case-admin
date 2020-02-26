package com.hzq.nacos.caseadminauth.config.mongo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.convert.CustomConversions;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;

/**
 * create by huzq on 2018/3/31 for tran
 */
@Configuration

public class MongoConfig {
    @Value("${bucket}")
    private String bucket;

    @Bean
    public GridFsTemplate gridFsTemplate(MongoDbFactory factory, MongoMappingContext context, BeanFactory beanFactory) throws Exception {
        return new GridFsTemplate(factory, mappingMongoConverter(factory, context, beanFactory), bucket);
    }

    @Bean
    public MappingMongoConverter mappingMongoConverter(MongoDbFactory factory, MongoMappingContext context, BeanFactory beanFactory) {
        DbRefResolver dbRefResolver = new DefaultDbRefResolver(factory);
        MappingMongoConverter mappingConverter = new MappingMongoConverter(dbRefResolver, context);
        try {
            mappingConverter.setCustomConversions(beanFactory.getBean(CustomConversions.class));
        } catch (NoSuchBeanDefinitionException ignore) {
        }

        // Don't save _class to mongo
        mappingConverter.setTypeMapper(new DefaultMongoTypeMapper(null));
        return mappingConverter;
    }


}
