import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();

		if(media <= 10 && media >= 7.0) {
			System.out.println("Tu passaste!");
			System.out.println("Parabéns!");
		} else if(media >= 5 && media < 7 ) {
			System.out.println("Ops! ficaste em recuperação!");
		} else {
			System.out.println("Ha ha ha, tu reprovaste!");
		}

		entrada.close();
	}
}