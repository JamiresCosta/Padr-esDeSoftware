package br.dominio.hotel;
import br.dominio.cliente.Cliente;

public class ServicosHotel {
	private Hotel hotel;
	public ServicosHotel(Hotel h) {
		this.hotel=h;
	}
	public void mostrarQuartosVagos() {
		for (Quarto quarto: this.hotel.getQuartos()){
			if(!quarto.isReservado()) {
				System.out.println("Quarto numero: "+quarto.getNumero()+" disponível!");
			}
			
		}
		
	}
	
	public ReservaHotel reservarQuarto(int num, Cliente c, String data) {
		for (Quarto quarto: this.hotel.getQuartos()) {
			if(quarto.getNumero() == num) {
				if(quarto.isReservado()) {
					System.out.println("Quarto não disponível");
					return null;
				}else {
					ReservaHotel r = new ReservaHotel();
					r.setC(c);
					r.setData(data);
					r.setH(this.hotel);
					quarto.setReservado(true);
					r.setQ(quarto);
					System.out.println("Quarto "+quarto.getNumero()+ " reservado");
					return r;
					
				}
			}
		}
		return null;
		
	}
}
