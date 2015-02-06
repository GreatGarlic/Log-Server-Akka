package org.server.akka.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import akka.actor.UntypedActor;

/**
 * 类的相关描述.
 * 
 * @author Administrator
 */

public class AkkaHandlerThree extends UntypedActor {
	private static final Logger LOGGER = LoggerFactory.getLogger(AkkaHandlerThree.class);
	

	/**
	 * 方法相关描述.
	 * 
	 * @param message
	 * @throws Exception
	 *             方法添加日期 :2014-12-22<br>
	 *             创建者:刘源
	 */

	@Override
	public void onReceive(Object message) throws Exception {
		LOGGER.debug((String)message);
		getSender().tell("回复的消息哈哈哈", self());
	}

}
