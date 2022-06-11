import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n");

		System.out.println("Bom");
		System.out.println("dia");

		// "%n" tambem quebra a linha
		System.out.printf("Números da mega sena: %d %d %d %d %d %d%n",
			1,2,3,4,5,6);

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digita o teu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digita o teu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digita a tua idade: ");
		int idade = entrada.nextInt();

		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

		entrada.close();
	}

}
