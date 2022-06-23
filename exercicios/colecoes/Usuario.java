package colecoes;


// no arquivo Par do pacote generics também há uma implementação de override do equals e hashCode
public class Usuario {

	String nome;

	// construtor
	Usuario(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object objeto) {
		if(this == objeto) 
			return true;

		if(objeto == null) 
			return false;

		if(getClass() != objeto.getClass())
			return false;

		Usuario other = (Usuario) objeto;

		if(nome == null) {
			if(other.nome != null)
				return false;
		} else if(!nome.equals(other.nome))
			return false;

		return true;

	}
}