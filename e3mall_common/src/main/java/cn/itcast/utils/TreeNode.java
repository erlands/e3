package cn.itcast.utils;

import java.io.Serializable;

public class TreeNode implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String text;

	private String state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setState(String state) {
		this.state = state;
	}

}
