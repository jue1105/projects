package com.yeah.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeah.dao.entity.UserModel;
import com.yeah.dao.interf.IUserDao;
import com.yeah.service.interf.IUserService;

/**
 * @描述： 用户信息接口实现类
 * @作者： 杨珩
 * @日期： 2018年3月8日 下午5:43:33
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;
	/**
	 * @描述： 根据ID获取用户信息
	 * @作者： 杨珩
	 * @日期： 2018年3月8日 上午11:34:25
	 * @param id
	 * @return
	 * UserModel
	 */
	@Override
	public UserModel getModelByid(Long id) {
		return userDao.getModelByid(id);
	}
	/**
	 * @描述： 根据ID获取用户信息
	 * @作者： 杨珩
	 * @日期： 2018年3月8日 上午11:34:23
	 * @param model
	 * @return
	 * UserModel
	 */
	@Override
	public UserModel getModel(UserModel model) {
		return userDao.getModel(model);
	}
	/**
	 * @描述： 新增用户信息
	 * @作者： 杨珩
	 * @日期： 2018年3月8日 上午11:34:14
	 * @param model
	 * @return
	 * int
	 */
	@Override
	public int insertUser(UserModel model) {
		return userDao.insertUser(model);
	}
	/**
	 * @描述： 更新用户信息 
	 * @作者： 杨珩
	 * @日期： 2018年3月8日 上午11:34:01
	 * @param model
	 * @return
	 * int
	 */
	@Override
	public int updateUser(UserModel model) {
		return userDao.updateUser(model);
	}
	/**
	 * @描述： 根据ID删除用户
	 * @作者： 杨珩
	 * @日期： 2018年3月8日 上午11:33:44
	 * @param id
	 * @return
	 * int
	 */
	@Override
	public int deleteUserByid(Long id) {
		return userDao.deleteUserByid(id);
	}
}
