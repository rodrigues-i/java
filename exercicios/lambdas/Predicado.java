package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
    	
    	// O FunctionalInterface 'Predicate' recebe um parametro e retorna true ou false
    	Predicate<Produto> isCaro =
    		prod -> (prod.preco * (1 - prod.desconto)) >= 750;

    	Produto produto = new Produto("Notebook", 3893.89, 0.15);
    	System.out.println(isCaro.test(produto));
    }
}
