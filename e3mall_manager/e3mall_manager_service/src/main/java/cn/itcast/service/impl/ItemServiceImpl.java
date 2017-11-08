package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.itcast.domain.TbItem;
import cn.itcast.domain.TbItemExample;
import cn.itcast.mapper.TbItemMapper;
import cn.itcast.service.ItemService;
import cn.itcast.utils.PageBean;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;
	@Override
	public TbItem findItemById(Long itemId) {
		return tbItemMapper.selectByPrimaryKey(itemId);
	}
	@Override
	public PageBean<TbItem> list(Integer page, Integer rows) {
		PageBean<TbItem> pageBean = new PageBean<TbItem>();
		
		PageHelper.startPage(page, rows);
		
		TbItemExample example = new TbItemExample();
		List<TbItem> list = tbItemMapper.selectByExample(example);
		
		PageInfo<TbItem> p = new PageInfo<TbItem>(list);
		
		pageBean.setTotal(p.getTotal());
		pageBean.setRows(list);
		
		
		return pageBean;
	}

}
