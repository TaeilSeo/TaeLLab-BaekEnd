package com.sti.taelab.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.sti.taelab.mapper")
public class DatabaseConfig {

}
