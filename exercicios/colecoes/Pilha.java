package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;


public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();

		/*
			o metodo add() retorna falso caso tente adcionar algo
			a uma pilha com tamanho maximo e não consiga

			Já o push() retorna uma exeção caso não consiga
		*/

		livros.add("O Pequeno Príncipe"); // add adiciona á causa da pilha, ou seja, no primeiro elemento
		livros.push("Dom Quixote"); // push adiciona na cabeça da pilha, ou seja, no final
		livros.push("O Robbit");
		livros.push("Harry Potter");

		// Na pilha, o ultimo a entrar é o primeiro a sair
		System.out.println(livros.peek()); // pega o elemto e não romove da colecao. retorna null caso não consiga
		System.out.println(livros.element()); // pega o elemento e não remove da colecao . retorna uma exceção caso não consiga
		System.out.println();

		livros.push("Push");
		livros.add("add");

		for(String livro: livros) {
			System.out.println(livro);
		}
	}
}
