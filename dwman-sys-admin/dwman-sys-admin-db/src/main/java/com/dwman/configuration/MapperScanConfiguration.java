package com.dwman.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.dwman.dao")
public class MapperScanConfiguration {

}
