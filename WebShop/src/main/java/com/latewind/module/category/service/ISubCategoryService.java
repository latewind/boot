package com.latewind.module.category.service;

import java.util.List;

import com.latewind.module.category.entity.SubCategory;

public interface ISubCategoryService {
	public SubCategory getSubCategoryById(Integer id);
	public List<SubCategory> getAllSub();
}
