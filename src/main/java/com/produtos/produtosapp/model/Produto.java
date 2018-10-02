package com.produtos.produtosapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue
	private long produtoId;

	
	@NotNull
	private String nome;
	
	@NotNull
	private String numeroProduto;
	
/*	private boolean bandeira;
	
	private boolean bandeiraAcabado;*/
	
	private String Cor;

	private int nivelEstoque;

	private int pontoReordenar;

	private double custoPadrao;
	

	private double precoVenda;
	
	private String tamanhoProduto;
	
	private String unidadeMedidaTamanho;
	
	private String unidadeMedidaPeso;
	
	private double pesoProduto;
	
		
	private int diasParaFabricarProduto;
	
	private String linhaDoProduto;
	
	private String classe;
	
	private String estilo;
	

	private Date dataDisponivelVenda;
	
	private Date dataNaoDisponivelVenda;
	
	private Date dataProdutoDescontinuado;
	
	
	private Date dataModificacao;

	@OneToMany
	private List<Fotos> fotos = new ArrayList<>();

	@OneToMany
	private List<Revisao> revisaos = new ArrayList<>();

	@OneToMany
	private List<ProdutoSubCategoria> produtoSubCategorias = new ArrayList<>();

	@OneToMany
	private List<Documento> documentos = new ArrayList<>();
	
	@OneToMany
	private List<Modelo> modelos = new ArrayList<>();
	
	@OneToOne
	private UnidadeMedida unidadeMedida;

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public long getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(long produtoId) {
		this.produtoId = produtoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroProduto() {
		return numeroProduto;
	}

	public void setNumeroProduto(String numeroProduto) {
		this.numeroProduto = numeroProduto;
	}
	/*public boolean isBandeira() {
		return bandeira;
	}

	public void setBandeira(boolean bandeira) {
		this.bandeira = bandeira;
	}

	public boolean isBandeiraAcabado() {
		return bandeiraAcabado;
	}
	public void setBandeiraAcabado(boolean bandeiraAcabado) {
		this.bandeiraAcabado = bandeiraAcabado;
	}
*/
	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public int getNivelEstoque() {
		return nivelEstoque;
	}

	public void setNivelEstoque(int nivelEstoque) {
		this.nivelEstoque = nivelEstoque;
	}

	public int getPontoReordenar() {
		return pontoReordenar;
	}

	public void setPontoReordenar(int pontoReordenar) {
		this.pontoReordenar = pontoReordenar;
	}

	public double getCustoPadrao() {
		return custoPadrao;
	}

	public void setCustoPadrao(double custoPadrao) {
		this.custoPadrao = custoPadrao;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getTamanhoProduto() {
		return tamanhoProduto;
	}

	public void setTamanhoProduto(String tamanhoProduto) {
		this.tamanhoProduto = tamanhoProduto;
	}

	public String getUnidadeMedidaTamanho() {
		return unidadeMedidaTamanho;
	}
	public void setUnidadeMedidaTamanho(String unidadeMedidaTamanho) {
		this.unidadeMedidaTamanho = unidadeMedidaTamanho;
	}

	public String getUnidadeMedidaPeso() {
		return unidadeMedidaPeso;
	}

	public void setUnidadeMedidaPeso(String unidadeMedidaPeso) {
		this.unidadeMedidaPeso = unidadeMedidaPeso;
	}

	public double getPesoProduto() {
		return pesoProduto;
	}

	public void setPesoProduto(double pesoProduto) {
		this.pesoProduto = pesoProduto;
	}

	public int getDiasParaFabricarProduto() {
		return diasParaFabricarProduto;
	}
	public void setDiasParaFabricarProduto(int diasParaFabricarProduto) {
		this.diasParaFabricarProduto = diasParaFabricarProduto;
	}

	public String getLinhaDoProduto() {
		return linhaDoProduto;
	}

	public void setLinhaDoProduto(String linhaDoProduto) {
		this.linhaDoProduto = linhaDoProduto;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public Date getDataDisponivelVenda() {
		return dataDisponivelVenda;
	}

	public void setDataDisponivelVenda(Date dataDisponivelVenda) {
		this.dataDisponivelVenda = dataDisponivelVenda;
	}

	public Date getDataNaoDisponivelVenda() {
		return dataNaoDisponivelVenda;
	}

	public void setDataNaoDisponivelVenda(Date dataNaoDisponivelVenda) {
		this.dataNaoDisponivelVenda = dataNaoDisponivelVenda;
	}

	public Date getDataProdutoDescontinuado() {
		return dataProdutoDescontinuado;
	}

	public void setDataProdutoDescontinuado(Date dataProdutoDescontinuado) {
		this.dataProdutoDescontinuado = dataProdutoDescontinuado;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public List<Fotos> getFotos() {
		return fotos;
	}

	public void setFotos(List<Fotos> fotos) {
		this.fotos = fotos;
	}

	public List<Revisao> getRevisaos() {
		return revisaos;
	}

	public void setRevisaos(List<Revisao> revisaos) {
		this.revisaos = revisaos;
	}

	public List<ProdutoSubCategoria> getProdutoSubCategorias() {
		return produtoSubCategorias;
	}

	public void setProdutoSubCategorias(List<ProdutoSubCategoria> produtoSubCategorias) {
		this.produtoSubCategorias = produtoSubCategorias;
	}
	public List<Documento> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}
	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public Produto(long produtoId, String nome, String numeroProduto, String cor, int nivelEstoque, int pontoReordenar,
			double custoPadrao, double precoVenda, String tamanhoProduto, String unidadeMedidaTamanho,
			String unidadeMedidaPeso, double pesoProduto, int diasParaFabricarProduto, String linhaDoProduto,
			String classe, String estilo, Date dataDisponivelVenda, Date dataNaoDisponivelVenda,
			Date dataProdutoDescontinuado, Date dataModificacao, List<Fotos> fotos, List<Revisao> revisaos,
			List<ProdutoSubCategoria> produtoSubCategorias, List<Documento> documentos, List<Modelo> modelos,
			UnidadeMedida unidadeMedida) {
		super();
		this.produtoId = produtoId;
		this.nome = nome;
		this.numeroProduto = numeroProduto;
		Cor = cor;
		this.nivelEstoque = nivelEstoque;
		this.pontoReordenar = pontoReordenar;
		this.custoPadrao = custoPadrao;
		this.precoVenda = precoVenda;
		this.tamanhoProduto = tamanhoProduto;
		this.unidadeMedidaTamanho = unidadeMedidaTamanho;
		this.unidadeMedidaPeso = unidadeMedidaPeso;
		this.pesoProduto = pesoProduto;
		this.diasParaFabricarProduto = diasParaFabricarProduto;
		this.linhaDoProduto = linhaDoProduto;
		this.classe = classe;
		this.estilo = estilo;
		this.dataDisponivelVenda = dataDisponivelVenda;
		this.dataNaoDisponivelVenda = dataNaoDisponivelVenda;
		this.dataProdutoDescontinuado = dataProdutoDescontinuado;
		this.dataModificacao = dataModificacao;
		this.fotos = fotos;
		this.revisaos = revisaos;
		this.produtoSubCategorias = produtoSubCategorias;
		this.documentos = documentos;
		this.modelos = modelos;
		this.unidadeMedida = unidadeMedida;
	}



	@Override
	public String toString() {
		return "Produto [produtoId=" + produtoId + ", nome=" + nome + ", numeroProduto=" + numeroProduto + ", Cor="
				+ Cor + ", nivelEstoque=" + nivelEstoque + ", pontoReordenar=" + pontoReordenar + ", custoPadrao="
				+ custoPadrao + ", precoVenda=" + precoVenda + ", tamanhoProduto=" + tamanhoProduto
				+ ", unidadeMedidaTamanho=" + unidadeMedidaTamanho + ", unidadeMedidaPeso=" + unidadeMedidaPeso
				+ ", pesoProduto=" + pesoProduto + ", diasParaFabricarProduto=" + diasParaFabricarProduto
				+ ", linhaDoProduto=" + linhaDoProduto + ", classe=" + classe + ", estilo=" + estilo
				+ ", dataDisponivelVenda=" + dataDisponivelVenda + ", dataNaoDisponivelVenda=" + dataNaoDisponivelVenda
				+ ", dataProdutoDescontinuado=" + dataProdutoDescontinuado + ", dataModificacao=" + dataModificacao
				+ ", fotos=" + fotos + ", revisaos=" + revisaos + ", produtoSubCategorias=" + produtoSubCategorias
				+ ", documentos=" + documentos + ", modelos=" + modelos + ", unidadeMedida=" + unidadeMedida + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cor == null) ? 0 : Cor.hashCode());
		result = prime * result + ((classe == null) ? 0 : classe.hashCode());
		long temp;
		temp = Double.doubleToLongBits(custoPadrao);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dataDisponivelVenda == null) ? 0 : dataDisponivelVenda.hashCode());
		result = prime * result + ((dataModificacao == null) ? 0 : dataModificacao.hashCode());
		result = prime * result + ((dataNaoDisponivelVenda == null) ? 0 : dataNaoDisponivelVenda.hashCode());
		result = prime * result + ((dataProdutoDescontinuado == null) ? 0 : dataProdutoDescontinuado.hashCode());
		result = prime * result + diasParaFabricarProduto;
		result = prime * result + ((documentos == null) ? 0 : documentos.hashCode());
		result = prime * result + ((estilo == null) ? 0 : estilo.hashCode());
		result = prime * result + ((fotos == null) ? 0 : fotos.hashCode());
		result = prime * result + ((linhaDoProduto == null) ? 0 : linhaDoProduto.hashCode());
		result = prime * result + ((modelos == null) ? 0 : modelos.hashCode());
		result = prime * result + nivelEstoque;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroProduto == null) ? 0 : numeroProduto.hashCode());
		temp = Double.doubleToLongBits(pesoProduto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + pontoReordenar;
		temp = Double.doubleToLongBits(precoVenda);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (produtoId ^ (produtoId >>> 32));
		result = prime * result + ((produtoSubCategorias == null) ? 0 : produtoSubCategorias.hashCode());
		result = prime * result + ((revisaos == null) ? 0 : revisaos.hashCode());
		result = prime * result + ((tamanhoProduto == null) ? 0 : tamanhoProduto.hashCode());
		result = prime * result + ((unidadeMedida == null) ? 0 : unidadeMedida.hashCode());
		result = prime * result + ((unidadeMedidaPeso == null) ? 0 : unidadeMedidaPeso.hashCode());
		result = prime * result + ((unidadeMedidaTamanho == null) ? 0 : unidadeMedidaTamanho.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (Cor == null) {
			if (other.Cor != null)
				return false;
		} else if (!Cor.equals(other.Cor))
			return false;
		if (classe == null) {
			if (other.classe != null)
				return false;
		} else if (!classe.equals(other.classe))
			return false;
		if (Double.doubleToLongBits(custoPadrao) != Double.doubleToLongBits(other.custoPadrao))
			return false;
		if (dataDisponivelVenda == null) {
			if (other.dataDisponivelVenda != null)
				return false;
		} else if (!dataDisponivelVenda.equals(other.dataDisponivelVenda))
			return false;
		if (dataModificacao == null) {
			if (other.dataModificacao != null)
				return false;
		} else if (!dataModificacao.equals(other.dataModificacao))
			return false;
		if (dataNaoDisponivelVenda == null) {
			if (other.dataNaoDisponivelVenda != null)
				return false;
		} else if (!dataNaoDisponivelVenda.equals(other.dataNaoDisponivelVenda))
			return false;
		if (dataProdutoDescontinuado == null) {
			if (other.dataProdutoDescontinuado != null)
				return false;
		} else if (!dataProdutoDescontinuado.equals(other.dataProdutoDescontinuado))
			return false;
		if (diasParaFabricarProduto != other.diasParaFabricarProduto)
			return false;
		if (documentos == null) {
			if (other.documentos != null)
				return false;
		} else if (!documentos.equals(other.documentos))
			return false;
		if (estilo == null) {
			if (other.estilo != null)
				return false;
		} else if (!estilo.equals(other.estilo))
			return false;
		if (fotos == null) {
			if (other.fotos != null)
				return false;
		} else if (!fotos.equals(other.fotos))
			return false;
		if (linhaDoProduto == null) {
			if (other.linhaDoProduto != null)
				return false;
		} else if (!linhaDoProduto.equals(other.linhaDoProduto))
			return false;
		if (modelos == null) {
			if (other.modelos != null)
				return false;
		} else if (!modelos.equals(other.modelos))
			return false;
		if (nivelEstoque != other.nivelEstoque)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroProduto == null) {
			if (other.numeroProduto != null)
				return false;
		} else if (!numeroProduto.equals(other.numeroProduto))
			return false;
		if (Double.doubleToLongBits(pesoProduto) != Double.doubleToLongBits(other.pesoProduto))
			return false;
		if (pontoReordenar != other.pontoReordenar)
			return false;
		if (Double.doubleToLongBits(precoVenda) != Double.doubleToLongBits(other.precoVenda))
			return false;
		if (produtoId != other.produtoId)
			return false;
		if (produtoSubCategorias == null) {
			if (other.produtoSubCategorias != null)
				return false;
		} else if (!produtoSubCategorias.equals(other.produtoSubCategorias))
			return false;
		if (revisaos == null) {
			if (other.revisaos != null)
				return false;
		} else if (!revisaos.equals(other.revisaos))
			return false;
		if (tamanhoProduto == null) {
			if (other.tamanhoProduto != null)
				return false;
		} else if (!tamanhoProduto.equals(other.tamanhoProduto))
			return false;
		if (unidadeMedida == null) {
			if (other.unidadeMedida != null)
				return false;
		} else if (!unidadeMedida.equals(other.unidadeMedida))
			return false;
		if (unidadeMedidaPeso == null) {
			if (other.unidadeMedidaPeso != null)
				return false;
		} else if (!unidadeMedidaPeso.equals(other.unidadeMedidaPeso))
			return false;
		if (unidadeMedidaTamanho == null) {
			if (other.unidadeMedidaTamanho != null)
				return false;
		} else if (!unidadeMedidaTamanho.equals(other.unidadeMedidaTamanho))
			return false;
		return true;
	}
	

}
