package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class ContatoFornecedor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idContato;
	private String nomeContato;
	private String telefoneFornecedor;
	private String emailFornecedor;
	private String tipoContato;
	
	public ContatoFornecedor() {
	}

	public ContatoFornecedor(Integer idContato, String nomeContato, String telefoneFornecedor, String emailFornecedor,
			String tipoContato) {
		this.idContato = idContato;
		this.nomeContato = nomeContato;
		this.telefoneFornecedor = telefoneFornecedor;
		this.emailFornecedor = emailFornecedor;
		this.tipoContato = tipoContato;
	}

	public Integer getIdContato() {
		return idContato;
	}

	public void setIdContato(Integer idContato) {
		this.idContato = idContato;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getTelefoneFornecedor() {
		return telefoneFornecedor;
	}

	public void setTelefoneFornecedor(String telefoneFornecedor) {
		this.telefoneFornecedor = telefoneFornecedor;
	}

	public String getEmailFornecedor() {
		return emailFornecedor;
	}

	public void setEmailFornecedor(String emailFornecedor) {
		this.emailFornecedor = emailFornecedor;
	}

	public String getTipoContato() {
		return tipoContato;
	}

	public void setTipoContato(String tipoContato) {
		this.tipoContato = tipoContato;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idContato);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContatoFornecedor other = (ContatoFornecedor) obj;
		return Objects.equals(idContato, other.idContato);
	}

	@Override
	public String toString() {
		return "ContatoFornecedor [idContato=" + idContato + ", nomeContato=" + nomeContato + ", telefoneFornecedor="
				+ telefoneFornecedor + ", emailFornecedor=" + emailFornecedor + ", tipoContato=" + tipoContato + "]";
	}
}
