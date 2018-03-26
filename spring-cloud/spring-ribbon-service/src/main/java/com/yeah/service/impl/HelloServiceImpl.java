/**
 * @作者：杨珩
 * @日期：2018年3月22日 上午12:15:24
 */
package com.yeah.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yeah.service.interf.IHelloService;

/**
 * @描述： 测试接口实现累
 * @作者： 杨珩
 * @日期： 2018年3月22日 上午12:15:24
 */
@Service
public class HelloServiceImpl implements IHelloService {
	@Autowired
    private RestTemplate restTemplate;
    /**
     * @描述： 负载调用服务提供者
     * @作者： 杨珩
     * @日期： 2018年3月22日 上午12:20:54
     * @param name
     * @return
     * String
     */
	@HystrixCommand(fallbackMethod = "hiError")
    public String testHello(String name) {
    	return restTemplate.getForObject("http://SERVICE-HI/hello?name="+name, String.class);
    }
    
	/**
	 * @描述： 这里我们增加了@HystrixCommand注解，
	 * 该注解对该方法创建了熔断器的功能，并制定了fallbackMethod熔断方法。
	 * 这里直接返回了一个字符串。
	 * @作者： 杨珩
	 * @日期： 2018年3月22日 上午1:17:16
	 * @param name
	 * @return
	 * String
	 */
	public String hiError(String name) {
		return "hi "+name+" ,sorry,error!";
	}
}
