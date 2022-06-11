package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {
	
	final int QUANTIDADE;
	final Produto PRODUTO;

	// construtor
	Item(Produto produto, int quantidade) {

		this.PRODUTO = produto;
		this.QUANTIDADE = quantidade;

	}
}