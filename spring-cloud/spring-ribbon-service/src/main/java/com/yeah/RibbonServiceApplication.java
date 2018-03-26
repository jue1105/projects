package com.yeah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @描述： 负载均衡消费者启动类
 * ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。
 * Feign默认集成了ribbon。
 * @作者： 杨珩
 * @日期： 2018年3月22日 上午12:05:16
 */
@SpringBootApplication
@EnableHystrix //@EnableHystrix  开启断路器
@EnableDiscoveryClient  // @EnableDiscoveryClient向服务中心注册
@EnableCircuitBreaker
@EnableHystrixDashboard
public class RibbonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonServiceApplication.class, args);
		System.out.println("======>服务消费者ribbon+Hystrix启动成功<======");
	}
	@Bean
    @LoadBalanced // @LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
