package br.dominio.ciaAerea;
import br.dominio.cliente.Cliente;

public class ReservaVoo {
	private Cliente c;
	private String companhiaaerea;
	private String voo;
	private int numPoltrona;
	private String data;
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Cliente getC() {
		return c;
	}
	public void setC(Cliente c) {
		this.c = c;
	}
	public String getCompanhiaaerea() {
		return companhiaaerea;
	}
	public void setCompanhiaaerea(String companhiaaerea) {
		this.companhiaaerea = companhiaaerea;
	}
	public String getVoo() {
		return voo;
	}
	public void setVoo(String voo) {
		this.voo = voo;
	}
	public int getNumPoltrona() {
		return numPoltrona;
	}
	public void setNumPoltrona(int numPoltrona) {
		this.numPoltrona = numPoltrona;
	}
	
	
}
