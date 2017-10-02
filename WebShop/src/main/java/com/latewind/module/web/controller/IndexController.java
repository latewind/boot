package com.latewind.module.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.latewind.module.category.entity.Category;
import com.latewind.module.category.service.ICategoryService;
import com.latewind.module.category.service.ITopCategoryService;
import com.latewind.module.notice.entity.Announcement;
import com.latewind.module.notice.entity.Headline;
import com.latewind.module.notice.service.INoticeService;
import com.latewind.module.product.entity.ProductInfo;
import com.latewind.module.product.service.IProductService;

@Controller
public class IndexController {
	@Resource
	private ICategoryService categoryService=null;
	@Resource 
	private ITopCategoryService topCategoryService=null;
	@Resource
	private IProductService productService=null;
	
	@Resource
	private INoticeService noticeService=null;
	
	@RequestMapping("/")
	public String IndexPage(){
		
		return "redirect:/index";
		
	}
	/*
	 * 
	 * window95   window98
	 * 
	 * 
	 */
	@ResponseBody
	@RequestMapping("/serverSend")
	public String serverSend(HttpServletResponse response){
	       //content type must be set to text/event-stream
        response.setContentType("text/event-stream");  
 
        //encoding must be set to UTF-8
        response.setCharacterEncoding("UTF-8");
 
        PrintWriter writer = null;
		try {
			writer = response.getWriter();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 
        for(int i=0; i<10; i++) {
 
            writer.write("data: "+ System.currentTimeMillis() +"\n\n");
            writer.flush();
 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        writer.close(); 
		
		
		return null;
	}
	@RequestMapping("/index")
	public String getIndexPage(HttpServletRequest request,Model model){
		//获取当前的头条 
		Headline headline =noticeService.getHeadLine();
		model.addAttribute("headline", headline);
		
		//左侧导航栏添加 分类信息
		List<Category> categoryList=categoryService.getAllCategory();
		model.addAttribute("categoryList", categoryList);
		
		LinkedHashMap<Integer, List> topMap=topCategoryService.getAllTopMap();
		model.addAttribute("topMap", topMap);
		
		List<Announcement> anno=noticeService.getAnnouncement();
		model.addAttribute("anList", anno);
		//下方添加商品信息
		
		//随机商品 
		List<ProductInfo> randomProducts=productService.randomListProduct(null);	
		LinkedHashMap<String,List<ProductInfo>> map=new LinkedHashMap<String,List<ProductInfo>>();
		map.put("随便看看",randomProducts);
		// 销量Top 10
		List<ProductInfo> sellTopList=productService.getTopTenBySell();
		// 点击Top 10
		List<ProductInfo> clickTopList=productService.getTopTenByClick();
		model.addAttribute("map", map);
		ProductInfo pi=productService.getProductInfoById(1);
		model.addAttribute("productInfo", pi);
		
		//第一部分 今日精品
		LinkedHashMap<String, List> part=new LinkedHashMap<>();
			LinkedHashMap<String, List> leftPart=new LinkedHashMap<>();
			leftPart.put("推荐", productService.randomListProduct(null));
			LinkedHashMap<String, List> rightPart=new LinkedHashMap<>();
			rightPart.put("热销", sellTopList);
		List<Map<String, List>> list=new ArrayList<Map<String, List>>();	
			list.add(leftPart);
			list.add(rightPart);	
		part.put("今日精品", list);
	
		//第二部分 精彩推荐		
			LinkedHashMap<String, List> leftPart2=new LinkedHashMap<>();
			leftPart2.put("推荐", productService.randomListProduct(null));
			LinkedHashMap<String, List> rightPart2=new LinkedHashMap<>();
			rightPart2.put("人气", clickTopList);
			List<Map<String, List>> list2=new ArrayList<Map<String, List>>();	
			list2.add(leftPart2);
			list2.add(rightPart2);	
			System.out.println("test...............................................hot deploy");
			part.put("精彩推荐", list2);
			
		
		model.addAttribute("part",part);
		
		//webapp/static/productImgs/1/1.jpg	
		return "front/index/Index";
	}
}
