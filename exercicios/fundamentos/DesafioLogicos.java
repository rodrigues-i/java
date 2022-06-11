public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho1 na terça (V|F)
		// Trabalho2 na quinta (V|F)

		// Ambos os trabalhos ocorrem
		boolean trabalho1 = true;
		boolean trabalho2 = true;

		System.out.println("A familia vai ao shopping comprar uma tv de 50 polegadas e toma sorvete");

		// Apenas o primiero trabalho ocorre
		trabalho1 = true;
		trabalho2 = false;

		System.out.println("A familia vai ao shopping comprar uma tv de 30 polegadas e toma sorvete");

		// Apenas o segundo trabalho ocorre
		trabalho1 = false;
		trabalho2 = true;

		System.out.println("A familia vai ao shopping comprar uma tv de 30 polegadas e toma sorvete");

		// Nem um nem outro ocorre
		trabalho1 = false;
		trabalho2 = false;

		System.out.println("A familia fica em casa com fome");

	}
}