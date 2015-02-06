package org.server.akka.test;

import java.util.concurrent.TimeUnit;

import org.server.akka.entity.MessageEntityOne;
import org.server.akka.entity.MessageEntityTwo;
import org.server.akka.handler.AkkaHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import scala.concurrent.duration.Duration;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Inbox;
import akka.actor.Props;

/**
 * 类的相关描述.
 * 
 * @author Administrator
 */

public class TestDemoOne {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestDemoOne.class);

	public static void main(String[] args) throws InterruptedException {

		ActorSystem system = ActorSystem.create("MySystem");
		ActorRef actorEntity = system.actorOf(Props.create(AkkaHandler.class),"akkaHandler");
		Inbox inbox = Inbox.create(system);
		inbox.send(actorEntity, new MessageEntityOne("哈哈"));
		MessageEntityTwo entity = (MessageEntityTwo) inbox.receive(Duration.create(5, TimeUnit.SECONDS));
		LOGGER.debug(entity.getMsg());
		
		
		
//		ActorRef heihei = system.actorSelection("/akkaHandler").anchor();
		//不设置恢复对象 (ActorRef.noSender())使用noSender与null一样 不设置回复对象
//		heihei.tell(new MessageEntityTwo("你是猪"), ActorRef.noSender());
	}
	
	
	
}
