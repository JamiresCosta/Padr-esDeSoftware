package br.dominio.Hamburgue;

public class Bacon extends Recheio{
	public Bacon (Hamburguer ham) {
		super(ham);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAdicionais() {
		// TODO Auto-generated method stub
		return "Adicionando Bacon + " + this.getHamburguer().getAdicionais();
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return 2.25 + this.getHamburguer().getValor();
	}
}
