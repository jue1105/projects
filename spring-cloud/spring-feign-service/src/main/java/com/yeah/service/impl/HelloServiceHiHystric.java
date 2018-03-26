/**
 * @作者：杨珩
 * @日期：2018年3月22日 上午1:30:59
 */
package com.yeah.service.impl;

import org.springframework.stereotype.Component;

import com.yeah.service.interf.IHelloService;

/**
 * @描述： fallback 指定了断路器启用后的指定类 
 * @作者： 杨珩
 * @日期： 2018年3月22日 上午1:30:59
 */
@Component
public class HelloServiceHiHystric implements IHelloService {

	@Override
	public String testHello(String name) {
		return "FeiginHystrix:sorry "+name;
	}

}
