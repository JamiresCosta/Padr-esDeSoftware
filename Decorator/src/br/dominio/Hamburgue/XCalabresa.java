package br.dominio.Hamburgue;

public class XCalabresa extends Hamburguer{
	
	public XCalabresa() {
		this.setNome("X-Calabresa");
	}
	@Override
	public String getAdicionais() {
		
		return "Pão + carne";
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return 4.50;
	}

}
