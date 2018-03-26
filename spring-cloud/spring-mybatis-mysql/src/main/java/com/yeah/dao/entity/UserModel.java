package com.yeah.dao.entity;

import javax.persistence.*;

/**
 * @描述： 用户实体类
 * @作者： 杨珩
 * @日期： 2018年3月8日 上午11:36:29
 */
@Entity
public class UserModel {
	private Long id;//主键
	private String name;//姓名
	private String age;//年龄
	private String gender;//性别
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
