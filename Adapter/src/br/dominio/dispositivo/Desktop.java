package br.dominio.dispositivo;

public class Desktop implements Dispositivo{

	@Override
	public void ligar() {
		System.out.println("Desktop inicializando...");
		
	}

	@Override
	public void desligar() {
		System.out.println("Desktop desligando...");
		
	}

	@Override
	public void reiniciar() {
		System.out.println("Desktop reiniciando...");
		this.desligar();
		this.ligar();
		
	}

}
