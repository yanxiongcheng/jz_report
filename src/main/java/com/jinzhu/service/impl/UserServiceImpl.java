package com.jinzhu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinzhu.bean.User;
import com.jinzhu.mapper.UserMapper;
import com.jinzhu.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User queryUserById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public void deleteUserById(Long id) {
		userMapper.deleteByPrimaryKey(id);
	}

	public void updateUser(User user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	public void addUser(User user) {
		userMapper.insertSelective(user);
	}

	public List<User> queryAllUserList() {
		return userMapper.selectAllUserList();
	}

}
