package br.dominio;

import br.dominio.dispositivo.*;


public class Cliente {

	public static void main(String[] args) {
		Dispositivo d = new Desktop();
		d.ligar();
		d.desligar();
		d.reiniciar();
		d = new AdaptadorCelular();
		d.ligar();
		d.desligar();
		d.reiniciar();
		
	}

}
