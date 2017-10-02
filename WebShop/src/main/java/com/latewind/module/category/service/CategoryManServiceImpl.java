package com.latewind.module.category.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.latewind.common.constants.CommonConstants;
import com.latewind.module.category.dao.TopCategoryMapper;
import com.latewind.module.category.entity.SubCategory;
import com.latewind.module.category.entity.ThirdCategory;
import com.latewind.module.category.entity.TopCategory;
import com.latewind.module.product.entity.ProductInfo;
import com.latewind.module.product.service.IProductService;
@Service("categoryManService")
public class CategoryManServiceImpl implements ICategoryManService {

	@Resource 
	private IProductService productService=null;
	
	@Resource
	private IThirdCategoryService thirdCategoryService=null;
	
	@Resource
	private ISubCategoryService subCategoryService=null;
	
	@Resource
	private TopCategoryMapper topCategoryDAO;
	@Override
	public Map getProduct123Category(Integer prtId) {
				//获取商品
		ProductInfo productInfo =productService.getProductAllInfoById(prtId);
		//获取三级分类
		ThirdCategory thirdCategory=thirdCategoryService.geThirdCategoryById(productInfo.getThirdId());
		//获取二级分类
		SubCategory subCategory=subCategoryService.getSubCategoryById(thirdCategory.getSubId());
		//获取一级分类
		TopCategory topCategory=subCategory.getTopCategory();
		
//		
		LinkedHashMap<String, String> categoryMap=new LinkedHashMap<String,String>();
		categoryMap.put(topCategory.getName(), CommonConstants.TOP_WEB_PATH+topCategory.getId());
		
		categoryMap.put(subCategory.getName(), CommonConstants.SUB_WEB_PATH+subCategory.getId());
		
//		LinkedHashMap<String, Integer> mapthird=new LinkedHashMap<String,Integer>();
		categoryMap.put(thirdCategory.getName(), CommonConstants.THIRD_WEB_PATH+thirdCategory.getId());
			
		
		
		return categoryMap;
	}
	
	public List<ThirdCategory> getThirdByTop( Integer topId)
	{
	
		TopCategory topCategory=topCategoryDAO.selectThirdByTopId(topId);
		List l=new LinkedList<>();
		for(SubCategory s:topCategory.getSubCategories()){
			l.addAll(s.getThirdCategories());
			
		}
		return l;
	}

}
