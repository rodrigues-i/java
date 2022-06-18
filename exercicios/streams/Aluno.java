package streams;

public class Aluno {
    final String nome;
    final double nota;
    final boolean bomComportamento = true;


    public Aluno(String nome, double nota) {
    	this.nome = nome;
    	this.nota = nota;
    }

    public String toString() {
        return nome + " tem nota " + nota;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(this == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if(bomComportamento != other.bomComportamento)
            return false;
        if(nome == null) {
            if(other.nome != null)
                return false;
        } else if(!nome.equals(other.nome))
            return false;
        if(Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
            return false;
        return true;
    }
}
