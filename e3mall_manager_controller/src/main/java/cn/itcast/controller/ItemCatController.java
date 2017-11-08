package cn.itcast.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.service.ItemCatService;
import cn.itcast.utils.TreeNode;

@Controller
@RequestMapping("/item")
public class ItemCatController {

	@Resource(name="itemCatService")
	private ItemCatService itemCatService;
	/**
	 * /cat/list
	 */
	@RequestMapping("/cat/list")
	@ResponseBody
	public List<TreeNode> list(@RequestParam(defaultValue="0") Long id){
		
		return itemCatService.findByParentId(id);
	}
}
