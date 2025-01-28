package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Fornecedor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long idFornecedor;
	private String nome;
	
	public Fornecedor() {
	}
	
	public Fornecedor(Long idFornecedor, String nome) {
		this.idFornecedor = idFornecedor;
		this.nome = nome;
	}

	public Long getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFornecedor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(idFornecedor, other.idFornecedor);
	}

	@Override
	public String toString() {
		return "Fornecedor [idFornecedor=" + idFornecedor + ", nome=" + nome + "]";
	}
	
	
}
