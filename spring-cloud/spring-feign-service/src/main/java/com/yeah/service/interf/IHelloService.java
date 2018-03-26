/**
 * @作者：杨珩
 * @日期：2018年3月22日 上午12:14:18
 */
package com.yeah.service.interf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yeah.service.impl.HelloServiceHiHystric;

/**
 * @描述： 测试接口
 * @作者： 杨珩
 * @日期： 2018年3月22日 上午12:14:18
 */
@FeignClient(value = "service-hi",fallback = HelloServiceHiHystric.class)
public interface IHelloService {
	/**
     * @描述： 负载调用服务提供者
     * 这里的/hello 是你注册的Eureka中的生命接口
     * @作者： 杨珩
     * @日期： 2018年3月22日 上午12:20:54
     * @param name
     * @return
     * String
     */
	@GetMapping("/hello")
    public String testHello(@RequestParam(value = "name")String name);
}
