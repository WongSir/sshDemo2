package com.wongsir.sshDemo.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wongsir.sshDemo.dao.IUserDao;
import com.wongsir.sshDemo.entity.User;

/** 
* @Description: TODO 
* @author hjd
* @date 2017年2月24日 上午10:23:35 
*  
*/
@Repository
public class UserDaoImpl implements IUserDao {
//	@Autowired
//	private SessionFactory sessionFactory;
//	
//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}
	
	@Autowired
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

	@Override
	public User getUser(String hql) {
		return (User) sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
	}

	@Override
	public List<User> getAllUser(String hql) {
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		return q.list();
	}

	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public boolean delUser(String hql) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
