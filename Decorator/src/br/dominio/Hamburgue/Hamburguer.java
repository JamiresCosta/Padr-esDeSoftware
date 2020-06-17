package br.dominio.Hamburgue;

public abstract class Hamburguer {
	private String nome;
	
	public abstract String getAdicionais();
	public abstract double getValor();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
