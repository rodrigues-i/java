import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digita um dia da semana em extenso: ");
		String dia = entrada.nextLine();

		if(dia.equalsIgnoreCase("domingo")) {
			System.out.printf("%s equivale ao dia 1\n", dia);
		} else if(dia.equalsIgnoreCase("segunda")
			|| dia.equalsIgnoreCase("segunda-feira") || dia.equalsIgnoreCase("segunda feira")) {

			System.out.printf("%s equivale ao dia 2\n", dia);
		} else if(
			dia.equalsIgnoreCase("terça")
			|| dia.equalsIgnoreCase("terça-feita") || dia.equalsIgnoreCase("terça feria") ) {

			System.out.printf("%s equivale ao dia 3\n", dia);
		} else if(dia.equalsIgnoreCase("quarta")) {

			System.out.printf("%s equivale ao dia 4\n", dia);
		} else if(dia.equalsIgnoreCase("quinta")) {

			System.out.printf("%s equivale ao dia 5\n", dia);
		} else if(dia.equalsIgnoreCase("sexta")) {

			System.out.printf("%s equivale ao dia 6\n", dia);
		} else if(dia.equalsIgnoreCase("sabado")
			|| dia.equalsIgnoreCase("sábado")) {

			System.out.printf("%s equivale ao dia 7\n", dia);
		} else {
			
			System.out.println("Dia inválido");
		}

		entrada.close();
	}
}