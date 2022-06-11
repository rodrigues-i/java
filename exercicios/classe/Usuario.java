package classe;

public class Usuario {

	String nome;
	String email;

	public boolean equals(Object objeto) {

		if(objeto instanceof Usuario) {

			Usuario outro = (Usuario) objeto;

			// O ideal é usar 'equals' em vez de '=='
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			return nomeIgual && emailIgual;
		}

		return false;
	}
}