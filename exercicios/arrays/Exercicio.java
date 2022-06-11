package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];
		String meuArray2 = Arrays.toString(notasAlunoA);
		System.out.println(meuArray2);

		notasAlunoA[0] = 7.6;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 3.6;

		String meuArray = Arrays.toString(notasAlunoA);

		System.out.println(meuArray);

		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
			
		}

		System.out.println(totalAlunoA / notasAlunoA.length);

		double[] notasAlunoB = {5.3,5,7,8.5};

		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}

		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}