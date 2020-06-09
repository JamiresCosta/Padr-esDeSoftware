package br.dominio.ciaAerea;
import java.util.ArrayList;
import java.util.List;

public class CompanhiaAerea {
	private String nomeCompanhiaAerea;
	private List<Voo> voos = new ArrayList<>();
	
	public String getNomeCompanhiaAerea() {
		return nomeCompanhiaAerea;
	}
	public void setNomeCompanhiaAerea(String nomeCompanhiaAerea) {
		this.nomeCompanhiaAerea = nomeCompanhiaAerea;
	}
	public List<Voo> getVoos() {
		return voos;
	}
	public void setVoos(Voo voos) {
		this.voos.add(voos);
	}
	
	
	
}
