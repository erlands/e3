package cn.itcast.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.container.page.Page;

import cn.itcast.domain.TbItem;
import cn.itcast.service.ItemService;
import cn.itcast.utils.PageBean;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		System.err.println("-------------------->"+this);
		return "sb";
	}
	
	@Resource(name="itemService")
	private ItemService itemService;
	
	@RequestMapping("/findById/{itemId}")
	@ResponseBody
	public TbItem findById(@PathVariable("itemId") Long itemId){
		return itemService.findItemById(itemId);
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public PageBean<TbItem> list(Integer page,Integer rows){
		if(page == null || page < 1){
			page = 1;
		}
		if(rows ==  null || rows < 1){
			rows = 30;
		}
		PageBean<TbItem> pageBean = itemService.list(page, rows);
		
		return pageBean;
	}
	
}
