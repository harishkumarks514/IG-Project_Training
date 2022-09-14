package org.spring.activemq;

import java.util.Date;

import javax.jms.ConnectionFactory;

import org.apache.activemq.command.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;
import org.springframework.util.ErrorHandler;

import com.sun.istack.internal.Nullable;

@SpringBootApplication
public class JmsTemplateEmbededActiveMqApplication {

	public static void main(String[] args) {
		 
		//        launch the application      
	ConfigurableApplicationContext context = SpringApplication.run(JmsTemplateEmbededActiveMqApplication.class,args);

		//        Get JMS template bean reference       
			JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);

		//        SEND SMS        
			System.out.println("Sending A message...");

jmsTemplate.convertAndSend("jms.message.mq",new org.spring.activemq.Message(1001L, "test sample active mq message - Hello World ", new Date()));

		System.out.println("message sent.");
		     }

	@Bean
		 public JmsListenerContainerFactory<?> myFactory(ConnectionFactory connecFactory,
				 DefaultJmsListenerContainerFactoryConfigurer configurer){
			 DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		 

	//         anonymous class
factory.setErrorHandler(new ErrorHandler() 
{

@Override
	public void handleError(Throwable t) {
	// TODO Auto-generated method stub                
	System.err.println("An error has occured in the transaction");   
	         }        
	});
}

	//         This provides all boot's default to this factory, including the
	// message converter         configure.configure(factory,
	// connecFactory);        return factory;    }

	@Bean
		 public MessageConverter jacksonJmsMessageConverter() 
		 {
			 MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
			 converter.setTargetType(MessageType.TEXT);
			 converter.setTypeIdPropertyName("_type");
			 return null;    
			 }

}
