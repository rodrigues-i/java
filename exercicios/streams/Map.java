package streams;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.List;
import java.util.Arrays;

public class Map {
    public static void main(String[] args) {
    	Consumer<String> print = System.out::print;
    	List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
    	marcas.stream().map(marca -> marca.toUpperCase()).forEach(print);

    	UnaryOperator<String> maiusculo = m -> m.toUpperCase();
    	UnaryOperator<String> primeiraLetra = letra -> letra.charAt(0) + "";
    	UnaryOperator<String> grito = n -> n + "!!! ";

    	System.out.println("\n\nUsando composição...");
    	marcas.stream()
    		.map(maiusculo)
    		.map(primeiraLetra)
    		.map(grito)
    		.forEach(print);
    }
}
