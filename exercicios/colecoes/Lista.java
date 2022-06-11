package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();

		Usuario user1 = new Usuario("Ana");
		lista.add(user1);

		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));

		// Imprime usuario com base no indice
		System.out.println(lista.get(2).nome);

		// remove item com base no indice
		System.out.println(lista.remove(3)); // O indice 3 pertence a Bia | retorna o objeto removido

		// remove com base em comparacao com objeto passado
		System.out.println(lista.remove(new Usuario("Carlos"))); // esta remocao retorna true ou false

		System.out.println();

		for(Usuario user: lista) {
			System.out.println(user.nome);
		}

		System.out.println();

		// Checa se contem objecto
		System.out.println("Contem Lia? " + lista.contains(new Usuario("Lia")));
		System.out.println("Contem Carlos? " + lista.contains(new Usuario("Carlos")));
	}
}