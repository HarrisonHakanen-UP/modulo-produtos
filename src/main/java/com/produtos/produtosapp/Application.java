package com.produtos.produtosapp;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@EnableRabbit
//@EnableEurekaClient
@SpringBootApplication
public class Application {

//	static final String topicExchangeName = "spring-boot-exchange";

	@Value("${queue.order.name}")
    private String queueName;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
 
    @Bean
    public Queue queue() {
        return new Queue(queueName, true);
    }

   /* @Bean
    TopicExchange exchange() {
        return new TopicExchange(topicExchangeName);
    }

    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("foo.bar.#");
    }

    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
            MessageListenerAdapter listenerAdapter) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
//        container.setQueueNames(queueName);
        container.setMessageListener(listenerAdapter);
        return container;
    }

    @Bean
    MessageListenerAdapter listenerAdapter(Receiver receiver) {
        return new MessageListenerAdapter(receiver, "receiveMessage");
    }
*/
 /*   public static void main(String[] args) throws InterruptedException {
    	try {
            SpringApplication.run(Application.class, args);
        	}catch(HibernateException exception){
        	     System.out.println("Problem creating session factory");
        	     exception.printStackTrace();
        	}
    }*/
   
}