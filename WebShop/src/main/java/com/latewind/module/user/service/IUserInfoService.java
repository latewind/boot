package com.latewind.module.user.service;

import com.latewind.module.user.entity.LoginInfo;
import com.latewind.module.user.entity.LoginMessage;
import com.latewind.module.user.entity.UserInfo;

public interface IUserInfoService {
	
	public LoginInfo verifyUserName(String userName,String password);
	
	public Integer addUser(String userName,String oncePassword);
		
	public UserInfo getUserInfo(Integer userId);


}
