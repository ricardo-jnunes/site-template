package com.site.login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="login")
@RequestScoped
public class LoginController {

	String nome;
	String senha;
	
	public String realizarLogin(){
		if(this.nome.equals("admin") && this.senha.equals("admin")){
			return "home";
		}
		
		return "login";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
