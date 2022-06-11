package arrays;

import java.util.Scanner;

public class Desafio {


	public static void main(String[] args) {
		
		// Pergunta ao usuário o tanto de notas e em seguida pede-lhe para digita-lás
		Scanner input = new Scanner(System.in);

		System.out.println("Qual a quantidade de notas?");
		int quantidadeNotas = input.nextInt();

		double notas[] = new double[quantidadeNotas];
		for(int i = 0; i < quantidadeNotas; i++) {
			System.out.printf("Digita a %d nota: ", i + 1);
			notas[i] = input.nextDouble();
		}

		// Calcular a media das notas
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}

		double media = total / quantidadeNotas;

		// Imprime a media na tela

		System.out.printf("\nA média das notas é %.2f", media);

		input.close();
	}
}