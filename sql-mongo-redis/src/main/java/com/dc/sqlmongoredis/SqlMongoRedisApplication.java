package com.dc.sqlmongoredis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = {"com.dc.sqlmongoredis.mapper"})
public class SqlMongoRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlMongoRedisApplication.class, args);
    }

}
