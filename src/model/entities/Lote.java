package model.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Lote implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long idLote;
	private LocalDate dataFabricacao;
	private LocalDate dataValidade;
	private LocalDate dataEntrada;
	
	public Lote() {
	}

	public Lote(Long idLote, LocalDate dataFabricacao, LocalDate dataValidade, LocalDate dataEntrada) {
		this.idLote = idLote;
		this.dataFabricacao = dataFabricacao;
		this.dataValidade = dataValidade;
		this.dataEntrada = dataEntrada;
	}

	public Long getIdLote() {
		return idLote;
	}

	public void setIdLote(Long idLote) {
		this.idLote = idLote;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataEntrada, idLote);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lote other = (Lote) obj;
		return Objects.equals(dataEntrada, other.dataEntrada) && Objects.equals(idLote, other.idLote);
	}

	@Override
	public String toString() {
		return "Lote [idLote=" + idLote + ", dataFabricacao=" + dataFabricacao + ", dataValidade=" + dataValidade
				+ ", dataEntrada=" + dataEntrada + "]";
	}
	
	
}
