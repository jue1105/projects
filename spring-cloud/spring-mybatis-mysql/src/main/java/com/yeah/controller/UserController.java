package com.yeah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yeah.dao.entity.UserModel;
import com.yeah.service.interf.IUserService;

/**
 * @描述： 用户信息controller
 * @作者： 杨珩
 * @日期： 2018年3月8日 下午5:43:16
 */
@RestController
public class UserController {
	@Autowired
	private IUserService userService;
	/**
	 * @描述： 获取用户信息
	 * @作者： 杨珩
	 * @日期： 2018年3月8日 下午8:37:44
	 * @param id
	 * @return
	 * Object
	 */
	@RequestMapping("/getUserModel")
	public String getUserModel(@RequestParam String id) {
		Long userId=Long.parseLong(id);
		UserModel model=userService.getModelByid(userId);
		StringBuilder str=new StringBuilder();
		str.append("name:");
		str.append(model.getName());
		str.append("age:");
		str.append(model.getAge());
		str.append("gender:");
		str.append(model.getGender());
		return str.toString();
	}
}