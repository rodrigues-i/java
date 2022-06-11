package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Comida comida1 = new Comida(0.3, "pizza");
		Comida comida2 = new Comida(0.5, "churrasco");

		Pessoa pessoa = new Pessoa(76, "Joaquim");

		// Imprime o pessoa antes de comer
		System.out.printf("%s pesa %.2f antes de comer.", pessoa.nomePessoa, pessoa.pesoPessoa);

		// Faz a pessoa comer
		pessoa.comer(comida1);


		// Imprime novo peso apos comer
		System.out.printf("\n%s comeu %s e agora pesa %.2f.",
			pessoa.nomePessoa, comida1.nomeComida, pessoa.pesoPessoa);
	}
}