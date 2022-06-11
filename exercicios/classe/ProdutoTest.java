package classe;

public class ProdutoTest {

	public static void main(String[] args)  {

		Produto p = new Produto("Notebook", 4_356.89);
		// p.nome = "Notebook";
		// p.preco = 4_356.89;
		// p.desconto = 0.25;

		var p2 = new Produto();
		p2.nome = "Caneta Preta2";
		p2.preco = 12.56;
		Produto.desconto = 0.29;

		System.out.println(p.nome);
		System.out.println(p2.nome);

		double precoFinal1 = p.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();

		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("Media do carrinho %.2f", mediaCarrinho);;
	}
}
