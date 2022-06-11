public class Temperatura {
	public static void main(String[] args) {
		// Formula para converter de Fahrenheit para Celsius
		// (°F - 32) * 5/9

		final double X = 32;
		final double Y = 5/9.0;

		double temperaturaFahr = 86;
		double temperaturaCel = (temperaturaFahr - X) * Y;

		System.out.println("Temperatura em graus celsius: " + temperaturaCel);
	}
}