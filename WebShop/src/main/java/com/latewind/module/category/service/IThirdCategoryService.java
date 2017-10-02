package com.latewind.module.category.service;

import java.util.List;

import com.latewind.module.category.entity.ThirdCategory;

public interface IThirdCategoryService {
	public ThirdCategory geThirdCategoryById(Integer id);
	
	public List<ThirdCategory> getAllThird();

}
