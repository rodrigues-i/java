package com.example.exerciciossb.model.repositories;

import com.example.exerciciossb.model.entities.Produto;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

//import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

	// A fazer consulta com base em atributo, no caso aqui, com base no nome

	// findByNomeContaining
	// findByNomeIsContainig
	// findByNomeContains

	// findByNomeStartsWith
	// findByNomeEndsWith

	// findByNomeNotContaining

	// findByNomeContainingIgnoreCase

	// criar metodo para fazer busca por nome
	public Iterable<Produto> findByNomeContaining(String parteNome);

	// usando named query
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
	
}
