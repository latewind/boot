package com.latewind.boot.module.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latewind.boot.module.user.dao.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	public long getCount(){
		return userDao.count();
	}
}
