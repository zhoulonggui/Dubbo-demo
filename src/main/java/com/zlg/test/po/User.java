package com.zlg.test.po;

import java.io.Serializable;

/**
 * @Title: User.java
 * @Package: com.zlg.test.po
 * @Description: TODO
 * @author: zhoulonggui
 * @date: 2017年6月17日 下午8:24:03
 * @version: V1.0
 */
public class User implements Serializable{
	
	/**
	 * Fields User.java
	 */
	private static final long serialVersionUID = -2680605921068309009L;

	private int id;
	
	private String name;

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
