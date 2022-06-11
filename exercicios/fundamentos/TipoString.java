public class TipoString {

	public static void main(String[] args) {

		System.out.println("Ola, pessoal".charAt(3));

		String greeting = "Good morgin";

		System.out.println(greeting.concat(", sir!"));

		System.out.println(greeting.startsWith("Good"));
		System.
		out
		.println(greeting.startsWith("good"));

		System.out.println(greeting.length());

		System.out.println(greeting.endsWith("morgin"));

		System.out.println(greeting.equals("good morgin"));

		System.out.println(greeting.equalsIgnoreCase("good morgin"));

		var nome = "Lucas";
		var sobrenome = "Rodrigues";
		var idade = 25;
		var sal = 0F;

		System.out.printf("Nome: %s %s tem %d anos e ganha %.1f\n",
		 nome, sobrenome, idade,sal);

		String frase = String.format("Nome: %s %s tem %d anos e ganha R$%.1f\n",
		 nome, sobrenome, idade,sal);

		System.out.println(frase);
	}
}