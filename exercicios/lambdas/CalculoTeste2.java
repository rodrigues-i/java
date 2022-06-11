package lambdas;

// as lambdas functions são uma maneira mais fácil de implementar interfaces
// pois o metodo que implementa com classes é bem mais completo
public class CalculoTeste2 {
    public static void main(String[] args) {
    	
    	Calculo calculo = (x, y) -> { return x + y; };
    	System.out.println(calculo.executar(2,3));

    	// multiplicar
    	calculo = (j, k) -> j * k;
    	System.out.println(calculo.executar(2,3));

    	// dividir
    	calculo = (c, d) -> c / d;
    	System.out.println(calculo.executar(5,7));
    }
}
