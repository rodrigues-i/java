package classe;

public class Pessoa {
	double pesoPessoa;
	String nomePessoa;

	Pessoa(double pesoPessoa, String nomePessoa) {
		this.pesoPessoa = pesoPessoa;
		this.nomePessoa = nomePessoa;
	}

	void comer(Comida comida) {
		if(comida != null) {

			this.pesoPessoa += comida.peso;
		}
	}
}