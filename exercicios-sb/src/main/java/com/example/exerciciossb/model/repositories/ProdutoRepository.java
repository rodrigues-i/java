package com.example.exerciciossb.model.repositories;

import com.example.exerciciossb.model.entities.Produto;

import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	
}
