package com.yeah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @描述： Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。
 * 使用Feign，只需要创建一个接口并注解。
 * 它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。
 * Feign支持可插拔的编码器和解码器。
 * Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果
 * @作者： 杨珩
 * @日期： 2018年3月22日 上午12:33:03
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignServiceApplication {
    public static void main( String[] args ){
    		SpringApplication.run(FeignServiceApplication.class, args);
    		System.out.println("======>服务消费者feign启动成功<======");
    }
}
