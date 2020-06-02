package br.builder.componentes;

public class Diretor {
	private ConcretVendaBuilder b;
	
	public Diretor(ConcretVendaBuilder b) {
		this.b = b;
	}
	
	public void realizarvenda( String nomeCli, int codCli, String nomeVe, int codVe){
		b.cadastrarCliente(nomeCli, codCli);
		b.cadastrarVendedor(nomeVe, codVe);
	}
	public void informandoProduto(String nome, int cod, double valor ) {
		b.cadastrarProduto(nome, cod, valor);
	}
}
