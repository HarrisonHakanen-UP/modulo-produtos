package com.produtos.produtosapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private OrderQueueSender sender;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Enviando mensagem ao RabbitMQ...");
		sender.send("Mensagem de conexão: Módulo PRODUTOS");
	}

}
