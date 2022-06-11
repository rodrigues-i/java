package classe;

public class AreaCirc {
	double raio;
	static final double PI = 3.14;

	AreaCirc(double raioInicial) {
		raio = raioInicial;
	
	}

	double calcularArea() {
		return pi * Math.pow(raio, 2);
	}

	static double calcularArea(double raioo) {
		return return pi * Math.pow(raioo, 2);
	}
}