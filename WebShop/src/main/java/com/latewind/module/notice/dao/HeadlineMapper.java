package com.latewind.module.notice.dao;

import com.latewind.module.notice.entity.Headline;

public interface HeadlineMapper {
    int deleteByPrimaryKey(Integer headlineId);

    int insert(Headline record);

    int insertSelective(Headline record);

    Headline selectByPrimaryKey(Integer headlineId);

    int updateByPrimaryKeySelective(Headline record);

    int updateByPrimaryKey(Headline record);
    
    Headline selectCurrentHeadline();
}