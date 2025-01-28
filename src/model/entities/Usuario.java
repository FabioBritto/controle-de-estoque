package model.entities;

import java.io.Serializable;
import java.util.Objects;

import model.entities.enums.NivelAcesso;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idUsuario;
	private String nomeUsuario;
	private String login;
	private String senha;
	private NivelAcesso nivelAcesso;
	
	public Usuario() {
	}
	
	public Usuario(Integer idUsuario, String nomeUsuario, String login, String senha, NivelAcesso nivelAcesso) {
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.login = login;
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public NivelAcesso getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(NivelAcesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idUsuario, login);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(idUsuario, other.idUsuario) && Objects.equals(login, other.login);
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nomeUsuario=" + nomeUsuario + ", login=" + login + ", senha="
				+ senha + ", nivelAcesso=" + nivelAcesso + "]";
	}
	
	
	
}
