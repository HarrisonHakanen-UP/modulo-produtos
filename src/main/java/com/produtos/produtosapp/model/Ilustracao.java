package com.produtos.produtosapp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ilustracao")
public class Ilustracao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long ilustracaoId;
	
	private String diagrama;
	@NotNull
	private Date dataModificacao;
	
	public long getIlustracaoId() {
		return ilustracaoId;
	}

	public void setIlustracaoId(long ilustracaoId) {
		this.ilustracaoId = ilustracaoId;
	}

	public String getDiagrama() {
		return diagrama;
	}

	public void setDiagrama(String diagrama) {
		this.diagrama = diagrama;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataModificacao == null) ? 0 : dataModificacao.hashCode());
		result = prime * result + ((diagrama == null) ? 0 : diagrama.hashCode());
		result = prime * result + (int) (ilustracaoId ^ (ilustracaoId >>> 32));
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
		Ilustracao other = (Ilustracao) obj;
		if (dataModificacao == null) {
			if (other.dataModificacao != null)
				return false;
		} else if (!dataModificacao.equals(other.dataModificacao))
			return false;
		if (diagrama == null) {
			if (other.diagrama != null)
				return false;
		} else if (!diagrama.equals(other.diagrama))
			return false;
		if (ilustracaoId != other.ilustracaoId)
			return false;
		return true;
	}

	public Ilustracao(long ilustracaoId, String diagrama, Date dataModificacao) {
		super();
		this.ilustracaoId = ilustracaoId;
		this.diagrama = diagrama;
		this.dataModificacao = dataModificacao;
	}

	@Override
	public String toString() {
		return "Ilustracao [ilustracaoId=" + ilustracaoId + ", diagrama=" + diagrama + ", dataModificacao="
				+ dataModificacao + "]";
	}


	
	
}
