package br.dominio.dispositivo;

public class AdaptadorCelular extends Celular implements Dispositivo{

	@Override
	public void ligar() {
		this.inicializarsistemaOperacional();
		this.inicializandoAplicativos();
		
	}

	@Override
	public void desligar() {
		this.encerrandoAplicativo();
		this.encerrandoConexao();
		
	}

	@Override
	public void reiniciar() {
		System.out.println("Reinicando Celular...");
		this.desligar();
		this.ligar();
	}

}
