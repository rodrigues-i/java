public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do usuário

		// Tipos númericos inteiro
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_750_256_570_35L;

		// Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 3_742_856_470_76.5;

		// tipo booleano
		boolean estaDeFerias = false; // true

		// Tipo caractere
		char status = 'A'; // ativo

		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);

		// Numero de viajens
		System.out.println(numeroDeVoos / 2);

		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);

		System.out.println(id + " ganha: " + salario);

		System.out.println("Ferias? " + estaDeFerias);

		System.out.println("Status: " + status);
	}
}