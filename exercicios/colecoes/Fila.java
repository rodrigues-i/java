package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();

		fila.add("Ana");  // Dá erro caso tente adicionar a uma fila com limite e não consiga
		fila.offer("Bia"); // Retorna false caso tente adicionar a uma fila com limite e não consiga
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");

		/*
			Tanto o peek quanto element pegam o primeiro elemento da fila e não o removem da fila
			A diferença entre eles é que o peek retorna null se a fila estiver vazia
			já o element solta uma execao/erro
		*/

		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());

		// fila.size()
		// fila.clear()
		// fila.isEmpty()

		// Retorna o primeiro elemento da fila e remove-o
		System.out.println(fila.poll());
		System.out.println(fila.poll());

		System.out.println(fila.remove());

		// Se tentar remove algo da fila com poll e ela estiver vazia, retorna-se-á null
		// Já o remove retorna uma exceção caso tentes remove algo da fila e ela estiver vazia

		System.out.println();


	}
}