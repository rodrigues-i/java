package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();

		conjunto.add(5.3); // double -> Double
		conjunto.add(true);  // boolean -> Boolean
		conjunto.add("Hey, up!"); // String
		conjunto.add(1);  // int -> Integer
		conjunto.add('y');  // char -> Charactere

		// Imprime tamnho do conjunto
		System.out.println(conjunto.size());

		// Não aumentará o tamanho, pois ele não permite valores repitidos
		conjunto.add(true);
		conjunto.add(1);
		System.out.println(conjunto.size());

		// conjunto.remove(item) retorna 'true' se ele conseguir remover, e retorna false quando não conseguir
		System.out.println(conjunto.remove('c'));

		System.out.println(conjunto.remove('y'));
		System.out.println(conjunto.size());

		// Checar se o conjunto possui um certo item
		System.out.println(conjunto.contains('y'));
		System.out.println(conjunto.contains(5.3));


		Set numeros = new HashSet();
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);

		// Diferente dos arrays, as colocoes já implementam automaticamente a conversão para string ao imprimir
		System.out.println();
		System.out.println("Conjunto:");
		System.out.println(conjunto);

		System.out.println();
		System.out.println("Numeros:");
		System.out.println(numeros);

		// A fazer uma união de conjuntos
		conjunto.addAll(numeros);
		System.out.println(conjunto);

		// A fazer intersecao, ou seja, manter somente os items comuns em ambos
		conjunto.retainAll(numeros);
		System.out.println(conjunto);

		// A remove tudo do conjunto
		System.out.println();
		System.out.println("Conjunto:");
		conjunto.clear();
		System.out.println(conjunto);
	}
}