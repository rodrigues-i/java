package me.modelo.composicao;

import javax.persistence.Embeddable;

// Faz com que os dados desta classe sejam salvos dentro das tabelas fornecedor e funcionario
@Embeddable
public class Endereco {

	private String logradouro;
	private String complemento;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
