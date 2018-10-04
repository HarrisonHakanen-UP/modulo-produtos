package com.produtos.produtosapp;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.produtos.produtosapp.model.Produto;
import com.produtos.produtosapp.repository.ProdutoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdutosappApplicationTests {

	@Autowired
	private ProdutoRepository ProdutoRepositorio;

	@Test
	public void ProdutoCreate() {

		Date data = new Date(System.currentTimeMillis());
		Produto produto = new Produto();

		ProdutoRepositorio.save(new Produto(1, "teste", "1", "azul", 20, 3, 800, 1000, "3566", "teste", "teste", 50, 15,
				"teste", "teste", "teste", null, null, null, null, null, null, null, null, null, null));

		/*
		 * // criar produto.setProdutoId(1); produto.setNome("Teste");
		 * produto.setNumeroProduto("8"); produto.setCor("verde");
		 * produto.setNivelEstoque(6); produto.setPontoReordenar(2);
		 * produto.setCustoPadrao(5); produto.setPrecoVenda(5);
		 * produto.setTamanhoProduto("2"); produto.setUnidadeMedidaTamanho("m");
		 * produto.setUnidadeMedidaPeso("kg"); produto.setPesoProduto(2);
		 * produto.setDiasParaFabricarProduto(1); produto.setLinhaDoProduto("M");
		 * produto.setClasse("H"); produto.setEstilo("U");
		 * produto.setDataDisponivelVenda(data);
		 * produto.setDataNaoDisponivelVenda(data);
		 * produto.setDataProdutoDescontinuado(data); produto.setDataModificacao(data);
		 * 
		 * ProdutoRepositorio.save(produto);
		 */
		System.out.println("===================");
		System.out.println("Produto cadastrado!");
		System.out.println("===================");

		// listar

		for (Produto objeto : ProdutoRepositorio.findAll()) {
			System.out.println("\n" + "Produto ID: " + objeto.getProdutoId() + "\n" + "Nome: " + objeto.getNome() + "\n"
					+ "Numero do Produto  :" + objeto.getNumeroProduto() + "\n" + "Cor Produto : " + objeto.getCor()
					+ "\n" + "Nivel Estoque : " + objeto.getNivelEstoque() + "\n" + "Nivel de Estoque Minimo : "
					+ objeto.getPontoReordenar() + "\n" + "Custo Padrao : " + objeto.getCustoPadrao() + "\n"
					+ "Preco Venda : " + objeto.getPrecoVenda() + "\n" + "Tamanho Produto : "
					+ objeto.getTamanhoProduto() + "\n" + "Unidade Medida : " + objeto.getUnidadeMedidaTamanho() + "\n"
					+ "Unidade Medida Peso : " + objeto.getUnidadeMedidaPeso() + "\n" + "Peso Produto : "
					+ objeto.getPesoProduto() + "\n" + "Dias Para Fabricar Produto : "
					+ objeto.getDiasParaFabricarProduto() + "\n" + "Linha de Seguimento : " + objeto.getLinhaDoProduto()
					+ "\n" + "Classe do Produto : " + objeto.getClasse() + "\n" + "Estilo Produto : "
					+ objeto.getEstilo() + "\n" + "Data Disponivel Venda : " + objeto.getDataDisponivelVenda() + "\n"
					+ "Data nao disponivel : " + objeto.getDataNaoDisponivelVenda() + "\n"
					+ "Data descontinuado Produto : " + objeto.getDataProdutoDescontinuado() + "\n"
					+ "Data Modificação : " + objeto.getDataModificacao() + "\n");
		}

		// alterar
		produto = ProdutoRepositorio.getByProdutoId(1);
		produto.setCor("azul marinho");
		ProdutoRepositorio.save(produto);
		System.out.println("=================");
		System.out.println("Produto Alterado!");
		System.out.println("=================");

		// deletar
		produto = ProdutoRepositorio.getByProdutoId(1);
		ProdutoRepositorio.delete(produto);
		System.out.println("=================");
		System.out.println("Produto Deletado!");
		System.out.println("=================");

	}
}