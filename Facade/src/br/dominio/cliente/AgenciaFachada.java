package br.dominio.cliente;

import br.dominio.ciaAerea.CompanhiaAerea;
import br.dominio.ciaAerea.ServicosCompanhiaAerea;
import br.dominio.hotel.Hotel;
import br.dominio.hotel.ServicosHotel;

public class AgenciaFachada {
	
	private CompanhiaAerea ca;
	private Hotel h;
	private ServicosCompanhiaAerea sca;
	private ServicosHotel sh;
		
	public AgenciaFachada(CompanhiaAerea ca, Hotel h) {
		super();
		this.ca = ca;
		this.h = h;
		this.sca = new ServicosCompanhiaAerea(this.ca);
		this.sh = new ServicosHotel(h);
	}
	
	public Cliente cadastrarCliente(String nome, String telefone) {
		Cliente c = new Cliente();
		c.setNome(nome);
		c.setTelefone(telefone);
		System.out.println("Cliente cadastrado");
		return c;
	}
	
	public void vericarVoos() {
		System.out.println("Voos Disponiveis");
		this.sca.mostrarVoosDisponiveis();
	}
	
	public void agendarVoo(String nomeVoo, int num, Cliente c, String data) {
		System.out.println("Agendamento de Voo");
		this.sca.ReservarVoo(nomeVoo, num, c, data);
	}
	public void verificaQuartos() {
		System.out.println("Quartos Disponiveis");
		this.sh.mostrarQuartosVagos();
	
		
	}
	public void reservarQuarto(int num, Cliente c, String data) {
		System.out.println("Agendamento de Hotel");
		this.sh.reservarQuarto(num, c, data);
	}
}
