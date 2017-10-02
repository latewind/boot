package com.latewind.module.category.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.latewind.module.category.dao.CategoryMapper;
import com.latewind.module.category.entity.Category;

@Service("categoryService")
public class CategoryServiceImpl implements ICategoryService {

	@Resource
	private CategoryMapper categoryDAO;
	
	@Override
	public List<Category> getAllCategory() {
				return categoryDAO.getAll();
	}

	@Override
	public Category getCategoryById(Integer id) {
				return categoryDAO.selectByPrimaryKey(id);
	}

}
