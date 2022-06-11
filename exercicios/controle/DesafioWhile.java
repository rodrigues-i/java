import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		double valor = 0;
		int totalDeValorValido = 0;

		while(valor != -1) {
			System.out.print("Digita um valor: ");
			valor = Double.parseDouble(input.nextLine());
			if(valor > 10) {
				System.out.print("Digita um valor válido!\n");
			} else {
				if(valor != -1) {
					total += valor;
					totalDeValorValido++;
					System.out.printf("total: %f. vezes: %d%n", total, totalDeValorValido);
				}
			}
		}
		double media = total / totalDeValorValido;

		System.out.println("A media é: " + media);
		input.close();
	}
}