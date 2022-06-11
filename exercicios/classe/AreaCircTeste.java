package classe;

// Atributo de classe e atributo estatico são a mesma coisa. Ambos pertencem a classe

public class AreaCircTeste {

	public static void main(String[] args) {

		AreaCirc area = new AreaCirc(5.6);
		// area.pi = 1;

		AreaCirc area2 = new AreaCirc(10);
		// area2.pi = 0;

		// A forma ideal de acessar pi, um atributo de classe, é pela classe
		// AreaCirc.pi = 0;

		System.out.println(area.calcularArea());
		System.out.println(area2.calcularArea());

		// usando metodo estatico da classse
		System.out.println(AreaCirc.calcularArea(2));
	}
}