package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantidade de alunos? ");
		int quantidadeAlunos = entrada.nextInt();

		System.out.print("Quantidade de notas? ");
		int quantidadeNotas = entrada.nextInt();

		double notasAlunos[][] = new double[quantidadeAlunos][quantidadeNotas];

		double total = 0;
		for (int a = 0; a < notasAlunos.length; a++) {
			for (int n = 0; n < notasAlunos[a].length; n++) {
				System.out.printf("Informa a nota %d do aluno %d: ", n + 1, a + 1);
				notasAlunos[a][n] = entrada.nextDouble();
				total += notasAlunos[a][n];
			}
			
		}

		double media = total / (quantidadeAlunos * quantidadeNotas);
		System.out.println("A média da turma é " + media);

		entrada.close();
	}
}