package com.yeah;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @描述： 分布式配置中心客户端
 * @作者： 杨珩
 * @日期： 2018年3月24日 上午1:50:19
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
		System.out.println("======>分布式配置中心客户端启动成功<======");
    }
	
	@Value("${test}")
    String test;//git仓库配置文件属性
    /**
     * @描述： 调用接口
     * @作者： 杨珩
     * @日期： 2018年3月25日 下午9:17:09
     * @return
     * String
     */
    @GetMapping(value = "/hi")
    public String hi(){
        return test;
    }
}