package oo.encapsulamento.casaA;


public class Paulo {
	Ana esposa = new Ana();

	void testeAcessos() {

		System.out.println(esposa.segredo); // Este é o único que não consigo acessar
		System.out.println(esposa.facoEmCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}
}