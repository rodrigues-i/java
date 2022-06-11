package classe;

import java.util.Date;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Cardoso";
		u1.email = "pedro.cardoso@exemplo.com";

		Usuario u2 = new Usuario();
		u2.nome = "Pedro Cardoso";
		u2.email = "pedro.cardoso@exemplo.com";

		// Compara endereço de memoria
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(new Date()));
	}
}