package com.latewind.module.product.dao;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.latewind.module.product.entity.KeyWord;

public interface KeyWordMapper {
	Set<Integer> selectByKeyWord(@Param("keywordSet")Set<String> keywordSet);
	
    int insert(KeyWord record);

    int insertSelective(KeyWord record);
}