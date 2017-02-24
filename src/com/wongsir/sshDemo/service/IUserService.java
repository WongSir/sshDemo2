package com.wongsir.sshDemo.service;

import com.wongsir.sshDemo.entity.User;

/** 
* @Description: TODO 
* @author hjd
* @date 2017年2月24日 上午11:12:53 
*  
*/
public interface IUserService {
	public void add(User user);
	public User get(String id);
}
