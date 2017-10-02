package com.latewind.module.order.dao;

import com.latewind.module.order.entity.ShoppingCart;

public interface ShoppingCartMapper {
    int deleteByPrimaryKey(Integer cartId);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Integer cartId);

    ShoppingCart selectByUserName(Integer userId);
    
    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);
        
    ShoppingCart selectByUserNameBase(Integer userId);
     
    
    
}