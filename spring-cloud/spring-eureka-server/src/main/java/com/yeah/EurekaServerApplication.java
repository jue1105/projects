package com.yeah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @描述： 服务发现组件启动类
 * @作者： 杨珩
 * @日期： 2018年3月19日 下午9:52:02
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
		System.out.println("======>服务发现组件启动成功<======");
	}
}
