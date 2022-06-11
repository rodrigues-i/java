package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String NOME;
	final List<Aluno> alunos = new ArrayList<>();

	Curso(String nome) {
		this.NOME = nome;
	}

	void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
		aluno.cursos.add(this);
	}
}