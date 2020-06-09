package br.dominio.hotel;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private String hotel;
	
	private List<Quarto> quartos = new ArrayList<Quarto>();
	private double valorDiaria;
	
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public List<Quarto> getQuartos() {
		return quartos;
	}

	public void setQuartos(Quarto quarto) {
		this.quartos.add(quarto);
	}
	
	
	
}
