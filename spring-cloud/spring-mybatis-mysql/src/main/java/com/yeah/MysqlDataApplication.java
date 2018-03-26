package com.yeah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
@EnableTransactionManagement //如果mybatis中service实现类中加入事务注解，需要此处添加该注解
public class MysqlDataApplication {
    public static void main( String[] args ){
        SpringApplication.run(MysqlDataApplication.class, args);
        System.out.println("======>mysql组件启动成功<======");
    }
}
