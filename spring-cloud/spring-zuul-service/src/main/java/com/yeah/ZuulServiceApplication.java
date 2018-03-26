package com.yeah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @描述： 路由网关：路由在微服务体系结构的一个组成部分。
 * 例如，/可以映射到您的Web应用程序，/api/users映射到用户服务，并将/api/shop映射到商店服务。
 * Zuul是Netflix的基于JVM的路由器和服务器端负载均衡器。Zuul有以下功能：
 * 认证（Authentication），洞察（Insights），压力测试（Stress Testing），金丝雀测试（Canary Testing），
 * 动态路由（Dynamic Routing），服务迁移（Service Migration），负载脱落（Load Shedding），安全（Security），
 * 静态响应处理（Static Response handling），主动/主动流量管理（Active/Active traffic management）
 * @作者： 杨珩
 * @日期： 2018年3月23日 下午10:40:09
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulServiceApplication {
	public static void main(String[] args) {
        SpringApplication.run(ZuulServiceApplication.class, args);
        System.out.println("======>路由网关服务启动成功<======");
    }
}
