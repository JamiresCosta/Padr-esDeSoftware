package br.builder.componentes;

import java.util.ArrayList;

public interface VendaBuilder {
	void cadastrarCliente(String nome, int cod);
	void cadastrarVendedor(String nome, int cod);
	void cadastrarProduto(String nome, int cod, double valor);
	Venda finalizarVenda();
	
}
