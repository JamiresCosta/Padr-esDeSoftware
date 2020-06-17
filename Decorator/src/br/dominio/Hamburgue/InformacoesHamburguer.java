package br.dominio.Hamburgue;

public class InformacoesHamburguer {

	public static void ResumoHsamburguer(Hamburguer ham) {
		System.out.println("Hamburguer "+ham.getNome()+ "\nIngredientes:\n"
	+ham.getAdicionais()+"\nPreço: "+ham.getValor());
	}
}
