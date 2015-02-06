package org.server.akka.entity;

import java.io.Serializable;

/**
 * 类的相关描述.
 * 
 * @author Administrator
 */

public class MessageEntityTwo implements Serializable {
	private static final long serialVersionUID = 6358266508976672282L;
	private String msg;

	public MessageEntityTwo(String msg) {
		this.msg = msg;
	}

	/**
	 * 获取. 方法添加日期:2014-12-18 <br>
	 * 创建者:刘源
	 */

	public String getMsg() {
		return msg;
	}

	/**
	 * 设置. 方法添加日期:2014-12-18 <br>
	 * 创建者:刘源
	 */

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
