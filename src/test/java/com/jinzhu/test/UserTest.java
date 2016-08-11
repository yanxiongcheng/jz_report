package com.jinzhu.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jinzhu.bean.User;
import com.jinzhu.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class UserTest {
	@Autowired 
	private UserService userService;
	
	@Test
	public void testQueryAllUserList(){
		System.out.println(userService.queryAllUserList());
	}
	
	@Test
	public void testQueryUserById(){
		Long id = 1L;
		System.out.println(userService.queryUserById(id));
	}
	
	@Test
	public void testAddUser(){
		
		userService.addUser(null);
	}
	
	@Test
	public void testDeleteUser(){
		Long id = 1L;
		userService.deleteUserById(id);
	}
	
	@Test
	public void updateUser(){
		User user = userService.queryUserById(3L);
		user.setAge(80);
		user.setMobile("800");
		user.setPassword("888");
		user.setSex("3");
		user.setUserName("8888");
		userService.updateUser(user);
	}
	
}
