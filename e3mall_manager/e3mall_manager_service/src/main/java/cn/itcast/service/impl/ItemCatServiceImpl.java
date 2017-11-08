package cn.itcast.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.domain.TbItemCat;
import cn.itcast.mapper.TbItemCatMapper;
import cn.itcast.service.ItemCatService;
import cn.itcast.utils.TreeNode;

@Service("itemCatService")
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	private TbItemCatMapper itemCatMapper;
	@Override
	public List<TreeNode> findByParentId(Long parentId) {
		List<TreeNode> list = new ArrayList<TreeNode>();
		
		List<TbItemCat> cats = itemCatMapper.findByParentId(parentId);
		
		for (TbItemCat cat : cats) {
			TreeNode node = new TreeNode();
			
			node.setId(cat.getId());
			node.setText(cat.getName());
			node.setState(cat.getIsParent()?"closed":"open");
			
			list.add(node);
		}
		
		
		return list;
	}

}
