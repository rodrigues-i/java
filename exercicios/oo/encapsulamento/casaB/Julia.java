package oo.encapsulamento.casaB;


public class Julia {
	Ana enteada = new Ana();

	void testeAcessos() {

		System.out.println(enteada.segredo); // Não consigo
		System.out.println(enteada.facoEmCasa); // não consigo
		System.out.println(enteada.formaDeFalar); // não consigo
		System.out.println(enteada.todosSabem);	// consigo
	}
}