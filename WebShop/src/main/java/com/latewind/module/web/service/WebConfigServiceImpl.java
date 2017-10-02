package com.latewind.module.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.latewind.module.web.dao.NavTabsMapper;
import com.latewind.module.web.entity.NavTabs;
@Service("webConfigService")
public class WebConfigServiceImpl  implements IWebConfigService{
	@Resource NavTabsMapper navTabsDAO;
	@Override
	public List<NavTabs> listNavTabs() {
				return navTabsDAO.selectAllNavtabs();
	}
	

}
