package com.hz.user.persistence.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "spring.datasource")
@Data
public class Config {
	private String url;
	private String username;
	private String password;
	private String drivername;

}
