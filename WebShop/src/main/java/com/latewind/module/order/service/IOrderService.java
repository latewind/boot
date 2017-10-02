package com.latewind.module.order.service;

import java.util.List;

import com.latewind.module.order.entity.OrderInfo;
import com.latewind.module.order.entity.OrderPageInfo;
import com.latewind.module.order.entity.ProductPack;
import com.latewind.module.order.entity.ShoppingCart;

public interface IOrderService {
	
	public ShoppingCart getCartByUserId(Integer userId);
	
	public OrderInfo getOrderInfoByOrderId(Integer orderId);
	
	public Boolean appendProductPack(Integer userId,Integer prtId,Integer count);
	
	public Boolean deleteProductPack(Integer prtPackId);
	
//	public List<ProductPack> test(Integer orderId);
	public ProductPack getProductPackById(Integer id);
	
	
	public List<OrderInfo> getOrdersByUserIdBase(Integer userId);
	

	Integer addOrder(OrderPageInfo json,Integer userId);
	

	Integer updateOrderStatus(Integer orderId, String osderStatus);
	
	//更新产品包
	Integer updateProductPack(ProductPack pack);
	
	Boolean updateProductWhenPayfor(Integer orderId);
	
	
}
