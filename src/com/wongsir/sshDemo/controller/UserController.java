package com.wongsir.sshDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wongsir.sshDemo.entity.User;
import com.wongsir.sshDemo.service.IUserService;

/** 
* @Description: TODO 
* @author hjd
* @date 2017年2月24日 上午11:21:26 
*  
*/
@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="/user",method = RequestMethod.POST,consumes = "application/json")
	public void addUser(@RequestBody User user){
		userService.add(user);
	}
	
	@RequestMapping(value="/user/{id}",method = RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable String id){
		return userService.get(id);
	}
}
