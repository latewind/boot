package com.latewind.module.personal.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.latewind.module.order.dao.OrderInfoMapper;
import com.latewind.module.order.dao.ProductPackMapper;
import com.latewind.module.order.entity.OrderInfo;
import com.latewind.module.order.entity.ProductPack;
import com.latewind.module.product.dao.PrtCommentMapper;
import com.latewind.module.product.entity.PrtComment;
import com.latewind.module.user.dao.UserInfoMapper;
import com.latewind.module.user.entity.UserInfo;

@Service("personalService")
public class PersonalServiceImpl implements IPersonalService{
	@Resource
	private OrderInfoMapper orderInfoDAO;
	
	@Resource
	private UserInfoMapper userInfoDAO;
	
	@Resource
	private ProductPackMapper productPackDAO;
	
	@Resource
	private PrtCommentMapper prtCommentDAO;
	
	@Override
	public List<OrderInfo> getOrderByUserId(Integer userId, Integer startPos, Integer step,String orderStatus) {
				List<Integer> orderIdList=orderInfoDAO.selectOrderIdByUserId(userId, startPos, step,orderStatus);
	
		return 	orderInfoDAO.selectOrdersByOrderIdList(orderIdList);
	}
	@Override
	public Integer getOrderCountByUserId(Integer userId,String orderStatus) {
				return orderInfoDAO.selectOrderCountByUserId(userId,orderStatus);
	}
	@Override
	public Integer updatePersonalInfo(UserInfo u) {
				return userInfoDAO.updateByPrimaryKeySelective(u);
	}
	@Override
	public PrtComment getCommentById(Integer commentId) {
				return prtCommentDAO.selectByPrimaryKey(commentId);
	}
	@Override
	public Integer addPrtComment(PrtComment prtComment,ProductPack pack) {
				prtCommentDAO.insertSelective(prtComment);
		System.out.println(prtComment.getCommentId()+"insert after ");
		pack.setCommentId(prtComment.getCommentId());
		productPackDAO.updateByPrimaryKeySelective(pack);
		return null;
		
		
		
	}
	@Override
	public Integer updatePrtComment(PrtComment prtComment) {
				return prtCommentDAO.updateByPrimaryKeySelective(prtComment);
	}
	
//	@Override
//	public ProductPack getProductPackById(Integer id) {
//		//		return productPackDAO.selectByPrimaryKey(id);
//	}

}
