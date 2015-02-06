package org.server.akka.handler;

import akka.japi.Creator;

/**
 *类的相关描述.
 *@author Administrator
 */

public class Ass implements Creator<AkkaHandlerTwo> {
	
	private static final long serialVersionUID = -104955272601806388L;

	/**
	*方法相关描述.
	* @return
	* @throws Exception
	*方法添加日期 :2014-12-22<br> 
	*创建者:刘源
	*/
	
	@Override
	public AkkaHandlerTwo create() throws Exception {
		
		return new AkkaHandlerTwo();
	}

}
