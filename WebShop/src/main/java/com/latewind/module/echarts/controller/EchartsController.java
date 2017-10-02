package com.latewind.module.echarts.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EchartsController {

	@RequestMapping("/echart")
	public String getIndexPage(HttpServletRequest request,Model model){

		return "front/echarts/echarts";
	}
	
	
	@RequestMapping("/echartAjax")
	@ResponseBody
	public List<Map<String,Object>> getAjaxChart(){
		
		List<Map<String, Object>> maps =new ArrayList<>();
		Map<String, Object> map1=new LinkedHashMap<>();
		map1.put("value", new BigDecimal(10));
		map1.put("name", "男");
		
		Map<String, Object> map2=new LinkedHashMap<>();
		map2.put("value", new BigDecimal(8));
		map2.put("name", "女");
		
		maps.add(map1);
		maps.add(map2);
		

		return maps;
	}
	
	
}
