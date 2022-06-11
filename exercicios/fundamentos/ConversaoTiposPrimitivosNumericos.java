public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {

		double a = 1; // Conversão implicita, pois double, com 8 bytes, é maior que int, que tem 4 bytes
		System.out.println(a);

		float b = (float) 1.123458888; // explicita (CAST)
		System.out.println(b);

		int c = 130;
		byte d = (byte) c; // conversão explicita (CAST)
		System.out.println(d);
	}
}