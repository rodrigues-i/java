package me.teste.consulta;

import me.infra.DAO;

import me.modelo.muitospramuitos.Filme;
import me.modelo.muitospramuitos.Ator;
import java.util.List;

public class ObterFilmes {
	public static void main(String[] args) {
		
		DAO<Filme> dao = new DAO<>(Filme.class);

		List<Filme> filmes = dao.consultar("filmesNotaMaiorQue", "nota", 8.5);

		for(Filme filme: filmes) {
			System.out.println(filme.getNome());

			for(Ator ator: filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
	}
}
