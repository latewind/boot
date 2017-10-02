package com.latewind.module.web.dao;

import java.util.List;

import com.latewind.module.web.entity.NavTabs;

public interface NavTabsMapper {
    int deleteByPrimaryKey(Integer navId);

    int insert(NavTabs record);

    int insertSelective(NavTabs record);

    NavTabs selectByPrimaryKey(Integer navId);

    int updateByPrimaryKeySelective(NavTabs record);

    int updateByPrimaryKey(NavTabs record);
    
    List<NavTabs> selectAllNavtabs();
}