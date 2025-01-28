package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long idProduto;
	private String nomeProduto;
	private String marcaProduto;
	private Long loteProduto;
	
	public Produto() {
	}

	public Produto(Long idProduto, String nomeProduto, String marcaProduto, Long loteProduto) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.marcaProduto = marcaProduto;
		this.loteProduto = loteProduto;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}

	public Long getLoteProduto() {
		return loteProduto;
	}

	public void setLoteProduto(Long loteProduto) {
		this.loteProduto = loteProduto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProduto, loteProduto);
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
		return Objects.equals(idProduto, other.idProduto) && Objects.equals(loteProduto, other.loteProduto);
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", marcaProduto=" + marcaProduto
				+ ", loteProduto=" + loteProduto + "]";
	}
}
