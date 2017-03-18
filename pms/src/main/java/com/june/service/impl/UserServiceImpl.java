package com.june.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.june.bean.User;
import com.june.dao.UserMapper;
import com.june.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	public User findUserByName(String name) {
		return userMapper.findUserByName(name);
	}

}
