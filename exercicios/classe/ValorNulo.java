package classe;


/*
	atributos de classe ou instancia são automaticamente inicializados se não forem inicializados;
	Um contante deve ser inicialiazada ate antes de a instancia ser criada.
	Objetos recem o valor null se não forem inicializados

	atributos locais não são inicializados automaticamente
*/
public class ValorNulo {

	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.concat("!!!"));

		Data d1 = Math.random() > 0.5 ? new Data() : null;

		if(d1 != null) {
			d1.dia = 3;
			System.out.println(d1.obterData());
		}

		String s2 = Math.random() > 0.5 ? "Opa" : null;
		if(s2 != null) {
			System.out.println(s2.concat("!!!"));
		}
	}
}