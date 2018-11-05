package com.produtos.produtosapp.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cultura")
public class Cultura implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long culturaId;

	private String nome;

	private Date dataCadastro;

	public Cultura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCulturaId() {
		return culturaId;
	}

	public void setCulturaId(long culturaId) {
		this.culturaId = culturaId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		result = prime * result + (int) (culturaId ^ (culturaId >>> 32));
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Cultura other = (Cultura) obj;
		if (culturaId != other.culturaId)
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public Cultura(long culturaId, String nome, Date dataCadastro) {
		super();
		this.culturaId = culturaId;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Cultura [culturaId=" + culturaId + ", nome=" + nome + ", dataCadastro=" + dataCadastro + "]";
	}

}
