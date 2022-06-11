package classe;

public class Data {
	int dia;
	int mes;
	int ano;

	Data() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;

		// A paritir de um construtor, chamar outro construtor

		// Usando o 'this' para chamar outro construor
		this(1,1,1970);
	}

	Data(int dia, int mes, int ano) {

		// o 'this' refere-se à instância
		this.dia  = dia;
		this.mes = dia;
		this.ano = ano;
	}

	String obterData() {
		return String.format("%d/%d/%d", this.dia, mes, ano);

		// Ou String.format("%d/%d/%d", dia, mes, ano);
	}
}