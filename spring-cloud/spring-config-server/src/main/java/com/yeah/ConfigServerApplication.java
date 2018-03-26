package com.yeah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @描述： 分布式配置中心服务器
 * Spring Cloud Config为分布式系统中的外部配置提供服务器和客户端支持。
 * 使用Config Server，您可以在所有环境中管理应用程序的外部属性。
 * 客户端和服务器上的概念映射与Spring Environment和PropertySource抽象相同，
 * 因此它们与Spring应用程序非常契合，但可以与任何以任何语言运行的应用程序一起使用。
 * 随着应用程序通过从开发人员到测试和生产的部署流程，您可以管理这些环境之间的配置，
 * 并确定应用程序具有迁移时需要运行的一切。
 * 服务器存储后端的默认实现使用git，因此它轻松支持标签版本的配置环境，以及可以访问用于管理内容的各种工具。
 * 很容易添加替代实现，并使用Spring配置将其插入。
 * @作者： 杨珩
 * @日期： 2018年3月23日 下午11:01:45
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
        System.out.println("======>分布式配置中心服务器启动成功<======");
    }
}
