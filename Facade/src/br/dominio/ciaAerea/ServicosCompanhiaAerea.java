package br.dominio.ciaAerea;
import br.dominio.cliente.Cliente;

public class ServicosCompanhiaAerea {
	private CompanhiaAerea ca;

	public ServicosCompanhiaAerea(CompanhiaAerea ca) {
		super();
		this.ca = ca;
	}
	
	public void mostrarVoosDisponiveis() {
		for (Voo v : this.ca.getVoos()) {
			for (Poltrona p : v.getPoltrona()) {
				if(!p.isReservada()) {
					System.out.println("Companhia Aerea: "+this.ca.getNomeCompanhiaAerea()+
							" Voo: "+v.getNomeVoo()+" Poltrona:" + p.getNumero());
				}
			}
		}
	}
	
	public ReservaVoo ReservarVoo(String nomeVoo, int num, Cliente c, String data){
		for (Voo v : this.ca.getVoos()) {
			for (Poltrona p : v.getPoltrona()) {
				if(p.getNumero()==num) {
					if(!p.isReservada()) {
						ReservaVoo rv = new ReservaVoo();
						rv.setC(c);
						rv.setCompanhiaaerea(this.ca.getNomeCompanhiaAerea());
						rv.setNumPoltrona(num);
						rv.setVoo(nomeVoo);
						rv.setData(data);
						p.setReservada(true);
						System.out.println("Poltrona "+p.getNumero()+" reservada");
						return rv;
					}
				}
			}
		}
		return null;
		
	}
}
