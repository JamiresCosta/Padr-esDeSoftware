package br.builder.principal;

import br.builder.componentes.*;

public class PrincipalBuilder {

	public static void main(String[] args) {
		ConcretVendaBuilder vendaBuilder = new ConcretVendaBuilder(1245);
		Diretor dir = new Diretor (vendaBuilder);
		dir.realizarvenda("Maria Fernanda", 112, "Juarez Pires", 25);
		dir.informandoProduto("Arroz",21,4.50);
		dir.informandoProduto("Açucar", 47, 3.5);
		Venda venda = vendaBuilder.finalizarVenda();
		venda.imprimirComprovante();

	}

}
