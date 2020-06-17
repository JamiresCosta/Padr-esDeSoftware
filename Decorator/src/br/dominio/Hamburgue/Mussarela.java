package br.dominio.Hamburgue;

public class Mussarela extends Recheio {

	public Mussarela (Hamburguer ham) {
		super(ham);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAdicionais() {
		// TODO Auto-generated method stub
		return "Adicionando Mussarela + " + this.getHamburguer().getAdicionais();
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return 1.75 + this.getHamburguer().getValor();
	}

}
