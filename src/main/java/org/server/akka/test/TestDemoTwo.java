package org.server.akka.test;

import org.server.akka.handler.Ass;

import akka.actor.ActorRef;
import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import akka.actor.Kill;
import akka.actor.Props;

/**
 * 类的相关描述.
 * 
 * @author Administrator
 */

public class TestDemoTwo {

	public static void main(String[] args) throws InterruptedException {
		ActorSystem system = ActorSystem.create("MySystem");
		system.actorOf(Props.create(new Ass()), "akkaHandler");
		ActorSelection ref = system.actorSelection("akka://MySystem/user/akkaHandler");
		ref.tell("asdasda", ActorRef.noSender());
		Thread.sleep(1000);
		ref.tell(Kill.getInstance(), ActorRef.noSender());
		system.shutdown();

	}

}
