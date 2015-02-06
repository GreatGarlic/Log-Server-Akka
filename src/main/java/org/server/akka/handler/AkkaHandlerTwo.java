package org.server.akka.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;

/**
 * 类的相关描述.
 * 
 * @author Administrator
 */
public class AkkaHandlerTwo extends UntypedActor {
	private static final Logger LOGGER = LoggerFactory.getLogger(AkkaHandlerTwo.class);
	
	
	public AkkaHandlerTwo(){
		LOGGER.debug("=============");
	}

	/**
	 * 方法相关描述.
	 * 
	 * @throws Exception
	 *             方法添加日期 :2014-12-22<br>
	 *             创建者:刘源
	 */

	@Override
	public void preStart() throws Exception {
		ActorRef ref = getContext().actorOf(Props.create(AkkaHandlerThree.class), "threeHandler");
		ref.tell("发送的消息", getContext().self());
	}

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
		LOGGER.debug((String) message);
		
	}

}
