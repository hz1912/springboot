package com.hz.user.persistence.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class MybatisConfig {
	@Autowired
	private Config config;

	@Bean
	public DataSource dataSource() {
		DruidDataSource da = new DruidDataSource();
		da.setUrl(config.getUrl());
		da.setPassword(config.getPassword());
		da.setUsername(config.getUsername());
		da.setDriverClassName(config.getDrivername());
		return da;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = null;
		sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean
				.setMapperLocations(resolver.getResources("classpath*:/com/hz/user/persistence/mapper/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}

}
