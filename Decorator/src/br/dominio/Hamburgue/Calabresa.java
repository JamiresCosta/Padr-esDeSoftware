package br.dominio.Hamburgue;

public class Calabresa extends Recheio{

	public Calabresa(Hamburguer ham) {
		super(ham);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAdicionais() {
		// TODO Auto-generated method stub
		return "Adicionando Calabresa + " + this.getHamburguer().getAdicionais();
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return 1.50 + this.getHamburguer().getValor();
	}

}
