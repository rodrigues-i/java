import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Digita um numero:");
		String num2 = JOptionPane.showInputDialog("Digita outro numero:");

		// Converter e somá-los
		double pri = Double.parseDouble(num);
		double seg = Double.parseDouble(num2);

		double soma = pri + seg;

		System.out.printf("A soma entre eles dá %.2f%n", soma);
	}
}