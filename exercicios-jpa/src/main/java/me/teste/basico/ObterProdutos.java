package me.teste.basico;

import me.infra.ProdutoDAO;

import java.util.List;
import me.modelo.basico.Produto;

public class ObterProdutos {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();

		List<Produto> produtos = dao.obterTodos();

		for(Produto produto: produtos) {
			System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
		}

		double precoTotal = produtos.stream()
			.map(p -> p.getPreco())
			.reduce(0.0, (total, precoAtual) -> total + precoAtual)
			.doubleValue();

		System.out.println("O preco total é R$ " + precoTotal);

		dao.fecharDAO();
	}
}