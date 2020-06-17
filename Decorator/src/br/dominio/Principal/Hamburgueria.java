package br.dominio.Principal;

import br.dominio.Hamburgue.Bacon;
import br.dominio.Hamburgue.Hamburguer;
import br.dominio.Hamburgue.InformacoesHamburguer;
import br.dominio.Hamburgue.Mussarela;
import br.dominio.Hamburgue.Presunto;
import br.dominio.Hamburgue.XBacon;

public class Hamburgueria {

	public static void main(String[] args) {
		Hamburguer ham = new XBacon();
		InformacoesHamburguer.ResumoHsamburguer(ham);
		ham = new Bacon(ham);
		ham = new Mussarela(ham);
		ham = new Presunto(ham);
		InformacoesHamburguer.ResumoHsamburguer(ham);
	
		
		

	}

}
