package oo.encapsulamento;


public class Pessoa {

	private int idade;

	Pessoa(int idade) {
		if(idade >=0 ) {
			setIdade(idade);
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade >= 0) {
			this.idade = idade;
		}
	}

}