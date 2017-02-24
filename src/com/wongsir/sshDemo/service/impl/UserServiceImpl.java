package com.wongsir.sshDemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wongsir.sshDemo.dao.IUserDao;
import com.wongsir.sshDemo.entity.User;
import com.wongsir.sshDemo.service.IUserService;

/** 
* @Description: TODO 
* @author hjd
* @date 2017年2月24日 上午11:15:22 
*  
*/
@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public void add(User user) {
		userDao.addUser(user);
	}

	@Override
	public User get(String id) {
		StringBuilder hql = new StringBuilder("from User as u where 1=1");
		hql.append(" and u.id="+id);
		return userDao.getUser(hql.toString());
	}

}
