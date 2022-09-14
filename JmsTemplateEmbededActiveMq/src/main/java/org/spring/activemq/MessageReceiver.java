package org.spring.activemq;

import org.springframework.jms.annotation.JmsListener;

public class MessageReceiver {

	@JmsListener(destination = "jms.message.mg")
	private void receivemessage(Message message) {
		// TODO Auto-generated method stub
		System.out.println("Message" + message);
	}
	
}
