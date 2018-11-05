package com.produtos.produtosapp.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "descricao")
public class Descricao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long DescricaoProdutoId;

	private String Descricao;

	private Date dataCadastro;

	public Descricao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getDescricaoProdutoId() {
		return DescricaoProdutoId;
	}

	public void setDescricaoProdutoId(long descricaoProdutoId) {
		DescricaoProdutoId = descricaoProdutoId;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Descricao == null) ? 0 : Descricao.hashCode());
		result = prime * result + (int) (DescricaoProdutoId ^ (DescricaoProdutoId >>> 32));
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
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
		Descricao other = (Descricao) obj;
		if (Descricao == null) {
			if (other.Descricao != null)
				return false;
		} else if (!Descricao.equals(other.Descricao))
			return false;
		if (DescricaoProdutoId != other.DescricaoProdutoId)
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		return true;
	}

	public Descricao(long descricaoProdutoId, String descricao, Date dataCadastro) {
		super();
		DescricaoProdutoId = descricaoProdutoId;
		Descricao = descricao;
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Descricao [DescricaoProdutoId=" + DescricaoProdutoId + ", Descricao=" + Descricao + ", dataCadastro="
				+ dataCadastro + "]";
	}

}
