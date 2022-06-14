package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Desafio {
    
    public static void main(String[] args) {
    	Produto produto = new Produto("iPad", 3235.89, 0.13);

    	// calcular preco com desconto
    	BinaryOperator<Double> precoComDesconto =
    		(preco, desconto) -> preco * (1 - desconto);

    	// calcular se paga imposto
    	UnaryOperator<Double> valorPagarEmImposto =
    		preco -> preco >= 2500 ? (preco * (1 + 0.085)) : 0;

    	System.out.println("O preco com desconto é " + precoComDesconto.apply(produto.preco, produto.desconto));
    	double valorParaPagar = precoComDesconto.andThen(valorPagarEmImposto).apply(produto.preco, produto.desconto);
    	System.out.println("Preco considerando imposto " + valorParaPagar);

    	// calcular preco frete
    	UnaryOperator<Double> valorComFrete = valor -> valor >= 3000 ? valor + 100 : valor - 50;
    	double precoAtualComFrete =
    		valorComFrete.apply(valorParaPagar);
    	System.out.println("Preco atual com frete " + precoAtualComFrete);

    	System.out.println();

    	// Mostra valor final formatado e tendo duas casas decimais
    	System.out.printf("O valor final é R$%.2f", precoAtualComFrete);
    	
    }
}
