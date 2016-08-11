package com.jinzhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jinzhu.bean.User;
import com.jinzhu.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/userlist")
	public String queryUserList(Model model){
		List<User> userList = userService.queryAllUserList();
		model.addAttribute("userList", userList);
		return "user_list";
	} 
	
	@RequestMapping("/delete")
	public String deleteUser(Long id){
		userService.deleteUserById(id);
		return "redirect:/user/userlist";
	} 
	
	@RequestMapping("/toAdd")
	public String toAddUser(){
		return "user_add";
	} 
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String addUser(User user){
		userService.addUser(user);
		return "redirect:/user/userlist";
	} 
	
	@RequestMapping("/toEdit")
	public String toEditUser(Long id, Model model){
		User user = userService.queryUserById(id);
		model.addAttribute("user", user);
		return "user_edit";
	} 
	
	@RequestMapping(value = "/edit",method = RequestMethod.POST)
	public String editUser(User user){
		userService.updateUser(user);
		return "redirect:/user/userlist";
	} 
}
