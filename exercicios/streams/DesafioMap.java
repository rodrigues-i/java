package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DesafioMap {
    
    public static void main(String[] args) {
    	List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

    	/*
		 * 1. Número para string binária ... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
    	 */

    	Function<String, Integer> convertToInteger = item -> Integer.parseInt(item, 2);

    	numeros.stream()
    		.map(Integer::toBinaryString)
    		.map(item -> {
    			StringBuilder sb = new StringBuilder(item);
    			sb.reverse();
    			return sb.toString();
    		})
    		.map(convertToInteger)
    		.forEach(System.out::println);
    }
}
