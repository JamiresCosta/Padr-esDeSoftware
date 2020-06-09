package br.dominio.ciaAerea;
import java.util.ArrayList;
import java.util.List;

public class Voo {
	private String nomeVoo;
	private List<Poltrona> Poltrona = new ArrayList<>();
	private String data;
	
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getNomeVoo() {
		return nomeVoo;
	}
	public void setNomeVoo(String nomeVoo) {
		this.nomeVoo = nomeVoo;
	}
	public List<Poltrona> getPoltrona() {
		return Poltrona;
	}
	public void setPoltrona(Poltrona poltrona) {
		this.Poltrona.add(poltrona);
	}
	
	
}
