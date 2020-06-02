package br.builder.componentes;

public class ConcretVendaBuilder implements VendaBuilder {
	private Venda venda;
	
	
	public ConcretVendaBuilder( int codVenda) {
		
		this.venda = new Venda();
		this.venda.setCodVenda(codVenda);
	}
	
	public void cadastrarCliente(String nome, int cod) {
		Cliente c1 = new Cliente();
		c1.setCodCliente(cod);
		c1.setNome(nome);
		this.venda.setCliente(c1);
		
	}
	public void cadastrarVendedor(String nome, int cod) {
		Vendedor v1 = new Vendedor();
		v1.setCodVendedor(cod);
		v1.setNome(nome);
		this.venda.setVendedor(v1);
	}
	
	public void cadastrarProduto(String nome, int cod, double valor) {
		Produto p1 = new Produto();
		p1.setCodProduto(cod);
		p1.setNome(nome);
		p1.setValor(valor);
		this.venda.setProdutos(p1);
		
	}
	public Venda finalizarVenda() {
		return this.venda;
	}
}
