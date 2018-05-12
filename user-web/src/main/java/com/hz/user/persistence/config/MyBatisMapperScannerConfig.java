package com.hz.user.persistence.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.hz.hz.persistence.dao")
@AutoConfigureAfter(MybatisConfig.class)
public class MyBatisMapperScannerConfig {
	  public MapperScannerConfigurer mapperScannerConfigurer(){
	        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
	        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
	        mapperScannerConfigurer.setBasePackage("com.hz.hz.persistence.dao");
	        return mapperScannerConfigurer;
	    }
}
