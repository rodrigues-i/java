package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	// construtor que não recebe nada
	Produto() {

	}


	// construtor que recebe todos os parametos
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		
	}


	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}