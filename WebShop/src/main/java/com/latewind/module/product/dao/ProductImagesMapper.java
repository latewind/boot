package com.latewind.module.product.dao;

import com.latewind.module.product.entity.ProductImages;

public interface ProductImagesMapper {
    int deleteByPrimaryKey(Integer imageId);

    int insert(ProductImages record);

    int insertSelective(ProductImages record);

    ProductImages selectByPrimaryKey(Integer imageId);

    int updateByPrimaryKeySelective(ProductImages record);

    int updateByPrimaryKey(ProductImages record);
}