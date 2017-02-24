package com.wongsir.sshDemo.dao;

import java.util.List;

import com.wongsir.sshDemo.entity.User;


/** 
* @Description: TODO 
* @author hjd
* @date 2017年2月24日 上午10:21:17 
*  
*/
public interface IUserDao {
	
	/**
	 * 根据id获取
	 * @param hql
	 * @return
	 */
	public User getUser(String hql);
	
	public List<User> getAllUser(String hql);
	
	public void addUser(User user);
	
	/**
	 * 根据id删除
	 * @param hql
	 * @return
	 */
	public boolean delUser(String hql);
	
	/**
	 * 更新
	 * @param user
	 * @return
	 */
	public boolean updateUser(User user);
}
