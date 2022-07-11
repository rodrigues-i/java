package com.example.exerciciossb.controllers;

import com.example.exerciciossb.models.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00");
	}

	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654.321-00");
	}
}
