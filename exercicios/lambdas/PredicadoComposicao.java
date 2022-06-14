package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
    	// Um predicado é uma interface funcional que recebe um item e retorna um boolean

    	Predicate<Integer> isPar = (numero) -> numero % 2 == 0;
    	Predicate<Integer> hasTresDigitos = numero -> numero >= 100 && numero <= 999;

    	System.out.println(isPar.test(5));

    	System.out.println();

    	// 'and' checa duas condicoes
    	// o negate() nega o resultado de hasTresDigitos
    	System.out.println(isPar.and(hasTresDigitos).negate().test(123));
    	System.out.println(isPar.or(hasTresDigitos).test(123));
    }
}
