package com.latewind.module.category.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.latewind.module.category.dao.ThirdCategoryMapper;
import com.latewind.module.category.entity.ThirdCategory;


@Service("thirdCategoryService")
public class ThirdCategoryServiceImpl implements IThirdCategoryService {

	@Resource
	private ThirdCategoryMapper thirdCategoryDAO;
	@Override
	public ThirdCategory geThirdCategoryById(Integer id) {
				return thirdCategoryDAO.selectByPrimaryKey(id);
	}
	@Override
	public List<ThirdCategory> getAllThird() {
				return thirdCategoryDAO.selectAllThird();
	}

}
