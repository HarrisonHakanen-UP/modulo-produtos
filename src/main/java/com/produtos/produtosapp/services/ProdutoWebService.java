package com.produtos.produtosapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.produtosapp.model.Produto;
import com.produtos.produtosapp.repository.ProdutoRepository;

import io.swagger.annotations.ApiOperation;

@Service
@RestController
@RequestMapping("/produto")
public class ProdutoWebService {

	@Autowired
	ProdutoRepository pr;

	@GetMapping
	@ApiOperation(value = "Retorna uma lista de Produtos")
	@RequestMapping("/listar")
	public @ResponseBody Iterable<Produto> listaProdutos() {
		Iterable<Produto> listaProdutos = pr.findAll();
		return listaProdutos;
	}

	@PostMapping
	@RequestMapping(value = "/cadastrarProduto", method = RequestMethod.POST)
	public void persistirProduto(@RequestBody Produto produto) {
		pr.save(produto);
		System.out.println("Produto cadastrado com sucesso!");
	}

	/*
	 * @RequestMapping("/cadastrar") public void cadastraProduto(@RequestBody
	 * Produto produto) { pr.save(produto);
	 * System.out.println("Produto cadastrado com sucesso!"); }
	 */

	@GetMapping
	@RequestMapping(value = "/{nome}", method = RequestMethod.GET)
	public List<Produto> listaProduto(@PathVariable("nome") String nome, Model model) {
		List<Produto> listaProdutos = pr.findByNome(nome);
		if (listaProdutos != null) {
			model.addAttribute("produtos", listaProdutos);
		}
		return listaProdutos;
	}

	/*
	 * @PutMapping
	 * 
	 * @RequestMapping("/alterar/{id}") public void updateProd(@PathVariable("id")
	 * long id, @RequestBody Produto produto) { if(produto != null) { Produto
	 * produtoBanco = pr.findOne(id); //produtoBanco.setNome(produto.getNome());
	 * pr.save(produto); }
	 * 
	 * }
	 */

	@PutMapping("/alterar/{id}")
	public ResponseEntity<Object> updateStudent(@RequestBody Produto produto, @PathVariable long id) {

		Produto produtoOptional = pr.getByProdutoId(id);

		if (produtoOptional == null) {
			return ResponseEntity.notFound().build();
		} else {
			produto.setProdutoId(id);
		}
		pr.save(produto);

		return ResponseEntity.noContent().build();
	}

	@DeleteMapping
	@RequestMapping("/deletar/{id}")
	public boolean deleteProduto(@PathVariable("id") long id) {
		pr.delete(id);
		System.out.println("Produto deletado!");
		return true;
	}
}
