package com.latewind.module.category.dao;

import java.util.List;

import com.latewind.module.category.entity.ThirdCategory;

public interface ThirdCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ThirdCategory record);

    int insertSelective(ThirdCategory record);

    ThirdCategory selectByPrimaryKey(Integer id);
    
    ThirdCategory selectByThirdName(String thirdName);

    int updateByPrimaryKeySelective(ThirdCategory record);

    int updateByPrimaryKey(ThirdCategory record);
    
    List<ThirdCategory> selectAllThird();
    
}