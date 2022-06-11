package oo.heranca.desafio;


public interface Luxo {
	// por padraõ, são public abastract mesmo que não os coloque assim
	void ligarAr();
	void desligarAr();

	// tu não obrigado a implementar um metodo default, como os public abastract
	default int velocidadeDoAr() {
		return 1;
	}
}