package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		

		// Se eu quiser que o java reipeite a ordem de inserção, devo utilizar o TreeSet no lugar de HashSet
		SortedSet<String> listaAprovados = new TreeSet<>(); // 'HashSet<String>' ou apenas 'HashSet<>' no HashSet

		listaAprovados.add("Pedro");
		listaAprovados.add("João");
		listaAprovados.add("Matheus");

		// for each
		for(String nome: listaAprovados) {
			System.out.println(nome);
		}

		TreeSet<Integer> numeros = new TreeSet<>(); // 'HashSet<String>' ou apenas 'HashSet<>' no HashSet

		numeros.add(1);
		numeros.add(3);
		numeros.add(7);

		for(int numero: numeros) {
			System.out.println(numero);
		}
	}
}