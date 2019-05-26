package com.elcusejungle.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * mybaits配置类
 */
@Configuration
@MapperScan("com.ljz.mybaitspulsdemo.dao")
public class mybaitsConfig {

}
