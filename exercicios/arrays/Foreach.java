package arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = {5.6,6.4,9,7.3};

		for(int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

		System.out.println();

		// Este é o foreach
		for(double nota: notas) {
			System.out.println(nota);
		}
	}
}