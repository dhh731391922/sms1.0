package com.bruip.app02.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.bruip.app02.dao")
public class MybatisConfig {

}
