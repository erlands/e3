package cn.itcast.service;

import java.util.List;

import cn.itcast.utils.TreeNode;

public interface ItemCatService {

	/**
	 * 通过父id查询类别列表 并封装到TreeNode中
	 */
	
	public List<TreeNode> findByParentId(Long parentId);
	
}
