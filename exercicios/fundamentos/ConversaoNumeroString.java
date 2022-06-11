public class ConversaoNumeroString {

	public static void main(String[] args) {
		Integer numero = 10000;
		System.out.println(numero.toString().startsWith("1"));

		int numeroDois = 500;
		System.out.println(Integer.toString(numeroDois).length());

		System.out.println(("" + numeroDois).contains("50"));
	}
}