package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String NOME;
	final List<Compra> compras = new ArrayList<>();

	// construtor
	Cliente(String nome) {
		this.NOME = nome;
	}

	// adicionarCompra
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}

	// fazer metodo obterValorTotal
	double obterValorTotal() {
		double total = 0;

		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}

		return total;
	}

}