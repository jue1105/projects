package com.yeah.service.interf;

import org.springframework.stereotype.Service;

import com.yeah.dao.entity.UserModel;
/**
 * @描述： 用户信息接口
 * @作者： 杨珩
 * @日期： 2018年3月8日 下午5:43:27
 */
@Service
public interface IUserService {
	/**
	 * @描述： 根据ID获取用户信息
	 * @作者： 杨珩
	 * @日期： 2018年3月8日 上午11:34:25
	 * @param id
	 * @return
	 * UserModel
	 */
	public UserModel getModelByid(Long id);
	/**
	 * @描述： 根据ID获取用户信息
	 * @作者： 杨珩
	 * @日期： 2018年3月8日 上午11:34:23
	 * @param model
	 * @return
	 * UserModel
	 */
	public UserModel getModel(UserModel model);
	/**
	 * @描述： 新增用户信息
	 * @作者： 杨珩
	 * @日期： 2018年3月8日 上午11:34:14
	 * @param model
	 * @return
	 * int
	 */
	public int insertUser(UserModel model);
	/**
	 * @描述： 更新用户信息 
	 * @作者： 杨珩
	 * @日期： 2018年3月8日 上午11:34:01
	 * @param model
	 * @return
	 * int
	 */
	public int updateUser(UserModel model);
	/**
	 * @描述： 根据ID删除用户
	 * @作者： 杨珩
	 * @日期： 2018年3月8日 上午11:33:44
	 * @param id
	 * @return
	 * int
	 */
	public int deleteUserByid(Long id);
}
