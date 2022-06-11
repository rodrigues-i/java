public class DesafioAritimetico {

	public static void main(String[] args) {
		// int num = (int) Math.pow(3,3);

		// System.out.println(num);

		// Parte 1
		double parteUm = Math.pow((6 * (3 + 2)),2) / (3 * 2);
		double parteDois = Math.pow(((1 - 5) * (2 - 7)) / 2, 2);

		double AllTogether = Math.pow((parteUm - parteDois), 3) / Math.pow(10,3);

		System.out.println((int) AllTogether);
	}
}