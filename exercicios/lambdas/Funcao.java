package lambdas;

import java.util.function.Function;

public class Funcao {
    
    public static void main(String[] args) {

    	// Esta interface recebe um inteiro e retorna uma string
    	Function<Integer, String> parOuImpar =
    		numero -> numero % 2 == 0 ? "Par" : "Ímpar";

    	System.out.println(parOuImpar.apply(12));
    	System.out.println(parOuImpar.apply(15));

    	System.out.println();

    	// Esta functional interface recebe uma string e retorna uma string
    	Function<String, String> oResultadoE =
    		valor -> "O resultado é " + valor;

    	Function<String, String> empogado = valor -> valor + "!!!";

    	// composicap com functional interface
    	String resultadoFinal = parOuImpar
    		.andThen(oResultadoE)
    		.andThen(empogado)
    		.apply(15);

    	System.out.println(resultadoFinal);
    }
}
