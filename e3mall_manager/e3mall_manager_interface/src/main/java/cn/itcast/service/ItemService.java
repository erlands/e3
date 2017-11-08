package cn.itcast.service;

import cn.itcast.domain.TbItem;
import cn.itcast.utils.PageBean;

public interface ItemService {
	/**
	 * 通过id查询item
	 * @param itemId
	 * @return
	 */
	public TbItem findItemById(Long itemId);
	
	public PageBean<TbItem> list(Integer page,Integer rows);
	
}
