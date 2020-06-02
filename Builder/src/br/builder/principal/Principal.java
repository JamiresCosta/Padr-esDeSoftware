package br.builder.principal;

import br.builder.componentes.*;

public class Principal {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setCodCliente(2121);
		c1.setNome("Joao Alfredo");
		c1.setTelefone("99998-7894");
		
		Vendedor v1 = new Vendedor();
		v1.setCodVendedor(4541);
		v1.setNome("Maria Luiza");
		v1.setDataInicio("10/02/2015");
		
		Produto p1 = new Produto();
		p1.setCodProduto(211);
		p1.setNome("sabonete");
		p1.setValor(1.10);
		
		Produto p2 = new Produto();
		p2.setCodProduto(455);
		p2.setNome("Desodorante");
		p2.setValor(11.00);
		
		Produto p3 = new Produto();
		p3.setCodProduto(144);
		p3.setNome("Biscoito");
		p3.setValor(4.00);
		
		Venda venda = new Venda();
		venda.setCodVenda(0145);
		venda.setCliente(c1);
		venda.setVendedor(v1);
		venda.setProdutos(p1);
		venda.setProdutos(p2);
		venda.setProdutos(p3);
		venda.imprimirComprovante();
		
		

	}

}
