package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    
    public static void main(String[] args) {
    	
    	// esta interface não recebe nenhum parâmetro e mesmo assim retorna algo
    	Supplier<List<String>> umLista = () -> Arrays.asList("Bia", "Lia", "Ana", "Gui");

    	System.out.println(umLista.get());
    }
}
