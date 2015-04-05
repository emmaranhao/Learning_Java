package br.ucb.modelo;

import java.io.Serializable;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1l;
	private String nome, senha;
	private Mercadoria mercadoria;
	
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
	public Mercadoria getMercadoria() {
		return mercadoria;
	}
	public void setMercadoria(Mercadoria mercadoria) {
		this.mercadoria = mercadoria;
	}
	
	

}
