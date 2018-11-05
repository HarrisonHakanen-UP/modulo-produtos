package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class FotoBit {

	@Id
	@GeneratedValue
	private long FotoId;

	@NotNull
	private boolean primaria;

	@NotNull
	private Date dataModificacao;

	public FotoBit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FotoBit(long fotoId, boolean primaria, Date dataModificacao) {
		super();
		FotoId = fotoId;
		this.primaria = primaria;
		this.dataModificacao = dataModificacao;
	}

	public long getFotoId() {
		return FotoId;
	}

	public void setFotoId(long fotoId) {
		FotoId = fotoId;
	}

	public boolean isPrimaria() {
		return primaria;
	}

	public void setPrimaria(boolean primaria) {
		this.primaria = primaria;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (FotoId ^ (FotoId >>> 32));
		result = prime * result + ((dataModificacao == null) ? 0 : dataModificacao.hashCode());
		result = prime * result + (primaria ? 1231 : 1237);
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
		FotoBit other = (FotoBit) obj;
		if (FotoId != other.FotoId)
			return false;
		if (dataModificacao == null) {
			if (other.dataModificacao != null)
				return false;
		} else if (!dataModificacao.equals(other.dataModificacao))
			return false;
		if (primaria != other.primaria)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FotoBit [FotoId=" + FotoId + ", primaria=" + primaria + ", dataModificacao=" + dataModificacao + "]";
	}

}
