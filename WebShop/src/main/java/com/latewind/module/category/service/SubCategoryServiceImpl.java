package com.latewind.module.category.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.latewind.module.category.dao.SubCategoryMapper;
import com.latewind.module.category.entity.Category;
import com.latewind.module.category.entity.SubCategory;
@Service("subCategoryService")
public class SubCategoryServiceImpl implements ISubCategoryService {
@Resource
private SubCategoryMapper subCategoryDAO;

@Override
public SubCategory getSubCategoryById(Integer id) {
		return subCategoryDAO.selectByPrimaryKey(id);
}

@Override
public List<SubCategory> getAllSub() {
		return subCategoryDAO.selectAllSub();
}



}
