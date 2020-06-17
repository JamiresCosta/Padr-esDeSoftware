package br.dominio.Hamburgue;

public class XBacon extends Hamburguer{
	
	public XBacon() {
		this.setNome("X-Bacon");
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
