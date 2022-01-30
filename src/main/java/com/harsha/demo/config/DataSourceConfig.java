package com.harsha.demo.config;
// you can also do this!
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
//public class DataSourceConfig {
//
//    @Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.username("postgres");
//        dataSourceBuilder.password("password"); // ideally this should be read from env varibles or some secret store like aws secrets manager etc
//        return dataSourceBuilder.build();
//    }
//}