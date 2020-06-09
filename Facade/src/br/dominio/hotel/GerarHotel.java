package br.dominio.hotel;

import br.dominio.ciaAerea.Poltrona;
import br.dominio.ciaAerea.Voo;

public class GerarHotel {
	public static Hotel criarHotel(String nome) {
		Hotel h = new Hotel();
		h.setHotel(nome);
		
		for (int i = 1; i < 15; i++) {
			Quarto q = new Quarto();
			q.setNumero(i);
			q.setReservado(false);
			h.setQuartos(q);
			
		}
		return h;
	}
}
