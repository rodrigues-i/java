package me.teste.basico;

import me.infra.DAO;
import me.modelo.basico.Produto;

public class NovoProduto {
	public static void main(String[] args) {
		
		Produto produto = new Produto("Monitor 23", 789.98);
		DAO<Produto> dao = new DAO<>(Produto.class);

		// dao.abrirTransacao().incluir(produto).fecharTransacao().fecharDAO();
		dao.incluirAtomico(produto).fecharDAO();

		System.out.println("ID do produto: " + produto.getId());

	}
}