package oo.encapsulamento;


public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(16);
		pessoa.setIdade(-15);

		System.out.println(pessoa.getIdade());
	}
}