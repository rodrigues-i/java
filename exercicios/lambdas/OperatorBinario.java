package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.BiFunction;

public class OperatorBinario {
    
    public static void main(String[] args) {
    	BinaryOperator<Double> media =
			(x, y) -> (x + y) / 2;

		System.out.println(media.apply(9.8,5.7));

		BiFunction<Double, Double, String> resultado =
			(n1, n2) -> {
				double notaFinal = (n1 + n2) / 2;

				return notaFinal >= 7.0 ? "Aprovado" : "Reprovado";
			};

		System.out.println(resultado.apply(9.7, 5.1));
    }
}
