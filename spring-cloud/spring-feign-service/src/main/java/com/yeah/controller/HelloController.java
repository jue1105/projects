/**
 * @作者：杨珩
 * @日期：2018年3月22日 上午12:22:05
 */
package com.yeah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yeah.service.interf.IHelloService;

/**
 * @描述： 测试controller
 * @作者： 杨珩
 * @日期： 2018年3月22日 上午12:22:05
 */
@RestController
public class HelloController {
	@Autowired
    private IHelloService helloService;
	/**
	 * @描述： 测试负载均衡调用服务提供者
	 * @作者： 杨珩
	 * @日期： 2018年3月22日 上午12:25:01
	 * @param name
	 * @return
	 * String
	 */
	@GetMapping("/hi")
	public String hello(@RequestParam String name) {
		return helloService.testHello(name);
	}
}
