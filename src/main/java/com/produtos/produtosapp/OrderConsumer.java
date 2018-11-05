package com.produtos.produtosapp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import com.produtos.produtosapp.model.Produto;
import com.produtos.produtosapp.repository.ProdutoRepository;

@Component
public class OrderConsumer {

	@RabbitListener(queues = { "${queue.order.name}" })
	public void receive(@Payload String fileBody) {
		System.out.println("Mensagem recebida: " + fileBody);
	}

}
