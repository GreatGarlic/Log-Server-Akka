package org.server.akka.handler;

import org.server.akka.entity.MessageEntityOne;
import org.server.akka.entity.MessageEntityTwo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import scala.deprecated;
import scala.concurrent.impl.Future;
import scala.io.BytePickle.Def;

import akka.actor.ActorRef;
import akka.actor.UntypedActor;
import akka.dispatch.Futures;

/**
 * 类的相关描述.
 * 
 * @author Administrator
 */

public class AkkaHandler extends UntypedActor {
	private static final Logger LOGGER = LoggerFactory.getLogger(AkkaHandler.class);
	@Override
	public void onReceive(Object message) throws Exception {
		if (message instanceof MessageEntityOne) {
			String msg = ((MessageEntityOne) message).getMes();
			LOGGER.debug(msg);
			getSender().tell(new MessageEntityTwo("刘源"),getSelf());
		}else {
			String msg = ((MessageEntityTwo) message).getMsg();
			LOGGER.debug(msg);
		}
	}

}
