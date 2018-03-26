package com.yeah;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述： 服务提供者启动类
 * @作者： 杨珩
 * @日期： 2018年3月21日 下午11:43:56
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ProviderUserApplication {
    public static void main( String[] args ){
    		SpringApplication.run(ProviderUserApplication.class, args);
    		System.out.println("======>服务提供者启动成功<======");
    }
    
    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
