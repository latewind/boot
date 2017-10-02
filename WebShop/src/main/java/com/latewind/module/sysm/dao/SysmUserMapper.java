package com.latewind.module.sysm.dao;

import com.latewind.module.sysm.entity.SysmUser;

public interface SysmUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(SysmUser record);

    int insertSelective(SysmUser record);

    SysmUser selectByPrimaryKey(Integer userId);
    
    SysmUser  selectByLoginName(String loginName);

    int updateByPrimaryKeySelective(SysmUser record);

    int updateByPrimaryKey(SysmUser record);
}