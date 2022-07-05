package me.teste.heranca;

import me.infra.DAO;
import me.modelo.heranca.Aluno;
import me.modelo.heranca.AlunoBolsista;

public class NovoAluno {
	public static void main(String[] args) {
		DAO<Aluno> alunoDAO = new DAO<>();
		Aluno aluno1 = new Aluno(123L, "João");

		AlunoBolsista aluno2 = new AlunoBolsista(345L, "Maria", 1000);

		alunoDAO.incluirAtomico(aluno1);
		alunoDAO.incluirAtomico(aluno2);
	}
}
