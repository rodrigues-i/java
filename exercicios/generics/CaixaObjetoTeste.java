package generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {

		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // automaticamente converte double para Double

		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);

		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Ola"); // automaticamente converte double para Double

		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}
}
