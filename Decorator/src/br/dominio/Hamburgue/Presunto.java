package br.dominio.Hamburgue;

public class Presunto extends Recheio{
	public Presunto (Hamburguer ham) {
		super(ham);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAdicionais() {
		// TODO Auto-generated method stub
		return "Adicionando Presunto + " + this.getHamburguer().getAdicionais();
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return 1.25 + this.getHamburguer().getValor();
	}
}
