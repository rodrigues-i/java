package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		// Tipo Primitivo
		// Atribuição por valor

		double a = 4;
		double b = 3;

		System.out.println(a + "\n" + b);

		// Objeto
		// Atribuição por referência

		Data dataExp = new Data(5,6,2022);
		Data dataExp2 = dataExp;

		dataExp2.dia = 16;
		dataExp.mes = 6;
		dataExp2.ano = 1997;


		System.out.println(dataExp.obterData());
		System.out.println(dataExp2.obterData());

	}
}