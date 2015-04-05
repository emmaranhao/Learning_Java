package br.ucb.modelo;

import java.io.Serializable;

public class Mercadoria implements Serializable {
	private static final long serialVersionUID = 1L;
	private float valor;
	private String descricao; // Not using this stuff 
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float calcularNovoPreco(){
		return (float) (this.valor + (this.valor * .30));
	}
	
	
	

}
