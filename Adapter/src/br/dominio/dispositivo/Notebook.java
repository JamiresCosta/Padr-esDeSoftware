package br.dominio.dispositivo;

public class Notebook implements Dispositivo {

	@Override
	public void ligar() {
		System.out.println("Notebook inicializando...");

	}

	@Override
	public void desligar() {
		System.out.println("Notebook desligando...");
	}

	@Override
	public void reiniciar() {
		System.out.println("Reiniciando notebook...");
		this.desligar();
		this.ligar();

	}

}
