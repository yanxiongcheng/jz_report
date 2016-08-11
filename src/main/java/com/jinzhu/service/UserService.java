package com.jinzhu.service;

import java.util.List;

import com.jinzhu.bean.User;

public interface UserService {
	
	User queryUserById(Long id);
	
	void deleteUserById(Long id);
	
	void updateUser(User user);
	
	void addUser(User user);
	
	List<User> queryAllUserList();
}
