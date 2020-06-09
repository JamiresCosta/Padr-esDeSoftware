package br.dominio.ciaAerea;

public class GerarVoos {
	
	public static Voo criarVoo(String nome, String data) {
		Voo v = new Voo();
		v.setNomeVoo(nome);
		v.setData(data);
		for (int i = 1; i < 15; i++) {
			Poltrona p = new Poltrona();
			p.setNumero(i);
			p.setReservada(false);
			if(i%2==0) {
				p.setTipo("Corredor");
			}else {
				p.setTipo("Janela");
			}
		v.setPoltrona(p);
		}
		return v;
	}
}
