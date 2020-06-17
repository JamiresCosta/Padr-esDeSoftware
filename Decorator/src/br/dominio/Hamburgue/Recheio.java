package br.dominio.Hamburgue;

public abstract class Recheio extends Hamburguer{
	private Hamburguer hamburguer;
	
	public Recheio(Hamburguer ham) {
		this.hamburguer = ham;
		this.setNome(ham.getNome());
	}
	public Hamburguer getHamburguer() {
		return this.hamburguer;
	}
}
