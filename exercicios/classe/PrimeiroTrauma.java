package classe;

/*
	A forma mais simples é ou criar uma instancia de PrimeioTRauma dentro de main ou tornar 'a' estatico
	Não precisa criar outra classe como eu fiz

	PrimeiroTrauma p = PrimeiroTrauma();
	System.out.println(p.a);
*/

public class PrimeiroTrauma {

	// Não pode mexer aqui
	int a = 3;

	public static void main(String[] args) {
		
		// Criar uma classe dentro do metodo main
		class Ajudante {

			// Cria um metodo que retornará um inteiro
			int pegarValorA() {

				// Instancia a classe onde estamos para pegar o valor de 'a', que pertence a instancia, e retorná-lo
				 PrimeiroTrauma filho = new PrimeiroTrauma();
				 return filho.a;
			}
		}

		Ajudante ajudante = new Ajudante();
		int numero = ajudante.pegarValorA();

		System.out.println(numero);
	}


}