package org.server.akka.entity;

import java.io.Serializable;

/**
 *类的相关描述.
 *@author Administrator
 */

public class MessageEntityOne implements Serializable {
	
	
	private static final long serialVersionUID = -6354546820498745580L;
	private String mes;
	
	public MessageEntityOne(String mes){
		this.mes=mes;
	}
	/**
	 *获取.
	 *方法添加日期:2014-12-17 <br>
	 *创建者:刘源
	 */
	
	public String getMes() {
		return mes;
	}
	/**
	 *设置.
	 *方法添加日期:2014-12-17 <br>
	 *创建者:刘源
	 */
	
	public void setMes(String mes) {
		this.mes = mes;
	}
	

}
