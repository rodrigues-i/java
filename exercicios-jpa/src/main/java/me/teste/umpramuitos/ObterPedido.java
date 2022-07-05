package me.teste.umpramuitos;

import me.infra.DAO;

import me.modelo.umpramuitos.Pedido;
import me.modelo.umpramuitos.ItemPedido;

public class ObterPedido {
	public static void main(String[] args) {
		DAO<Pedido> dao = new DAO<>(Pedido.class);

		Pedido pedido = dao.obterPorID(1L);

		for(ItemPedido item: pedido.getItens()) {
			System.out.println(item.getQuantidade());
		}

		dao.fecharDAO();
	}
}