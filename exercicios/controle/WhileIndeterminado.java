import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String palavra = "";

		while(!palavra.equalsIgnoreCase("sair")) {
			System.out.print("Digita uma palavra: ");
			palavra = input.next();
			System.out.println("Tu digitaste: " + palavra);
		}

		input.close();
	}
}