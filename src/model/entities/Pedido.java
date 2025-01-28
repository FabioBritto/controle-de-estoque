package model.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import model.entities.enums.ClassificacaoPedido;

public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long idPedido;
	private LocalDateTime dataPedido;
	private Integer idUsuario;
	private ClassificacaoPedido tipoPedido;
	
	public Pedido() {
	}

	public Pedido(Long idPedido, LocalDateTime dataPedido, Integer idUsuario, ClassificacaoPedido tipoPedido) {
		this.idPedido = idPedido;
		this.dataPedido = dataPedido;
		this.idUsuario = idUsuario;
		this.tipoPedido = tipoPedido;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public LocalDateTime getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDateTime dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public ClassificacaoPedido getTipoPedido() {
		return tipoPedido;
	}

	public void setTipoPedido(ClassificacaoPedido tipoPedido) {
		this.tipoPedido = tipoPedido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(idPedido, other.idPedido);
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", dataPedido=" + dataPedido + ", idUsuario=" + idUsuario
				+ ", tipoPedido=" + tipoPedido + "]";
	}
}
