import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Pega os valores do usuario
		System.out.print("Digita o teu último salário: ");
		String salario1 = entrada.nextLine();

		System.out.print("Digita o teu penultimo salario: ");
		String salario2 = entrada.nextLine();

		System.out.print("Digita o teu antepenultimo salario: ");
		String salario3 = entrada.nextLine();

		// Converte os valores em string para numeros do tipo double
		Double valor1 = Double.parseDouble(salario1.replace(",", "."));
		Double valor2 = Double.parseDouble(salario2.replace(",", "."));
		Double valor3 = Double.parseDouble(salario3.replace(",", "."));

		double media = (valor1 + valor2 + valor3) / 3;

		// Imprime o valor da média
		System.out.printf("%nA médio dos teus três últimos sálarios é: %.1f\n", media);

		entrada.close();

	}
}