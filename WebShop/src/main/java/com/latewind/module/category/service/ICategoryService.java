package com.latewind.module.category.service;

import java.util.List;

import com.latewind.module.category.entity.Category;

public interface ICategoryService {
	public List<Category> getAllCategory();
	
	public Category getCategoryById(Integer id);
}
