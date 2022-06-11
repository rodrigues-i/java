import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");

		String s = new String("2");
		System.out.println("2" == s);

		System.out.println("2".equals(s));

		Scanner entrada = new Scanner(System.in);

		String s2 = entrada.nextLine(); // next tira os espaçoes antes e depois, mas o nextLine não o tira
		System.out.println("2" == s2);
		System.out.println("2".equals(s2));
		System.out.println(s2);
		System.out.println(s2.trim());

		entrada.close();
	}
}