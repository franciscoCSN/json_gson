package json_gson;

import java.io.Serializable;

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public String login;
	public String senha;
	public String cpf;
	
	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
		@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + ", cpf=" + cpf + "]";
	}

}
