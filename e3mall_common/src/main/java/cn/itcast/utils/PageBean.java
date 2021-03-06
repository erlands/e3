package cn.itcast.utils;

import java.io.Serializable;
import java.util.List;

public class PageBean<T> implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long total;
	private List<T> rows;
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
}
