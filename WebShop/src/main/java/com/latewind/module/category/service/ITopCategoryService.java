package com.latewind.module.category.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.latewind.module.category.entity.TopCategory;

public interface ITopCategoryService {
	public TopCategory geTopCategoryById(Integer id);
	
	public List<TopCategory> getAllTop();
	
	public LinkedHashMap getAllTopMap();
}
