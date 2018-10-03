package com.produtos.produtosapp.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.produtos.produtosapp.model.Produto;


public interface ProdutoRepository extends CrudRepository<Produto, Long>{
	
	
	//Produto findByName(String nome);	
	List<Produto> findByNome(String nome);
	
	Produto findByNome(Produto nome);
	
	@Query("SELECT p.nome FROM Produto p WHERE p.nome = ?1")
    Produto findProdByNome(String nome);
	
}
