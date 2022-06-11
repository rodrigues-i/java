package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testeAcessos() {

		// System.out.println(segredo); // Não consigo acessar
		// System.out.println(facoEmCasa); // Não consigo acessar
		System.out.println(formaDeFalar); // consigo
		System.out.println(todosSabem); // consigo
	}
}