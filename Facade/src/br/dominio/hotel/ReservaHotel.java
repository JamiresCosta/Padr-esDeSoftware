package br.dominio.hotel;
import br.dominio.cliente.Cliente;

public class ReservaHotel {
	private Cliente c;
	private String data;
	private Hotel h;
	private Quarto q;
	
	public Cliente getC() {
		return c;
	}
	public void setC(Cliente c) {
		this.c = c;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Hotel getH() {
		return h;
	}
	public void setH(Hotel h) {
		this.h = h;
	}
	public Quarto getQ() {
		return q;
	}
	public void setQ(Quarto q) {
		this.q = q;
	}
	
	
}
