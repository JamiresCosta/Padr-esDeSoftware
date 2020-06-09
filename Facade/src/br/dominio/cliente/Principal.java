package br.dominio.cliente;

import br.dominio.ciaAerea.CompanhiaAerea;
import br.dominio.ciaAerea.GerarVoos;
import br.dominio.ciaAerea.Voo;
import br.dominio.hotel.GerarHotel;
import br.dominio.hotel.Hotel;

public class Principal {

	public static void main(String[] args) {
		CompanhiaAerea ca = new CompanhiaAerea();
		ca.setNomeCompanhiaAerea("Fantasia");
		Voo v = GerarVoos.criarVoo("fant-2130", "25/08/2020");
		ca.setVoos(v);
		Hotel h = GerarHotel.criarHotel("Aventure");
		AgenciaFachada agencia = new AgenciaFachada(ca, h);
		System.out.println("Cadastrar Cliente");
		Cliente c= agencia.cadastrarCliente("Laura Maria","99987-7879");
		System.out.println("###############################\n");
		agencia.vericarVoos();
		System.out.println("###############################\n");
		agencia.agendarVoo("fant-2130", 2, c, "25/08/2020");
		System.out.println("###############################\n");
		agencia.vericarVoos();
		System.out.println("###############################\n");
		agencia.verificaQuartos();
		System.out.println("###############################\n");
		agencia.reservarQuarto(5, c, "26/08/2020");
		agencia.verificaQuartos();

	}

}
