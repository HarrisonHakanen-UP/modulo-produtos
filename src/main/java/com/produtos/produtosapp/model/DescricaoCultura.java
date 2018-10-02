package com.produtos.produtosapp.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class DescricaoCultura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long DescricaoCulturaProdutoId;
	
	private Date dataCadastro;
	
	@OneToMany
	private List<Cultura> cultura;
	
	@OneToMany
	private List<Descricao> descricaoproduto;
	

	public long getDescricaoCulturaProdutoId() {
		return DescricaoCulturaProdutoId;
	}

	public void setDescricaoCulturaProdutoId(long descricaoCulturaProdutoId) {
		DescricaoCulturaProdutoId = descricaoCulturaProdutoId;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public List<Cultura> getCultura() {
		return cultura;
	}

	public void setCultura(List<Cultura> cultura) {
		this.cultura = cultura;
	}

	public List<Descricao> getDescricaoproduto() {
		return descricaoproduto;
	}

	public void setDescricaoproduto(List<Descricao> descricaoproduto) {
		this.descricaoproduto = descricaoproduto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (DescricaoCulturaProdutoId ^ (DescricaoCulturaProdutoId >>> 32));
		result = prime * result + ((cultura == null) ? 0 : cultura.hashCode());
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((descricaoproduto == null) ? 0 : descricaoproduto.hashCode());
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
		DescricaoCultura other = (DescricaoCultura) obj;
		if (DescricaoCulturaProdutoId != other.DescricaoCulturaProdutoId)
			return false;
		if (cultura == null) {
			if (other.cultura != null)
				return false;
		} else if (!cultura.equals(other.cultura))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (descricaoproduto == null) {
			if (other.descricaoproduto != null)
				return false;
		} else if (!descricaoproduto.equals(other.descricaoproduto))
			return false;
		return true;
	}
		

	public DescricaoCultura(long descricaoCulturaProdutoId, Date dataCadastro, List<Cultura> cultura,
			List<Descricao> descricaoproduto) {
		super();
		DescricaoCulturaProdutoId = descricaoCulturaProdutoId;
		this.dataCadastro = dataCadastro;
		this.cultura = cultura;
		this.descricaoproduto = descricaoproduto;
	}

	@Override
	public String toString() {
		return "DescricaoCultura [DescricaoCulturaProdutoId=" + DescricaoCulturaProdutoId + ", dataCadastro="
				+ dataCadastro + ", cultura=" + cultura + ", descricaoproduto=" + descricaoproduto + "]";
	}
	

	
}
