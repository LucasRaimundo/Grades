package br.com.turma.jdbc;

import java.util.ArrayList;

public class TesteMostrarTodosAlunos {

	public static void main(String[] args) {
		AlunoDao alunoDao = new AlunoDao();
		ArrayList<Aluno> aluno = alunoDao.mostrarTodos();
		for(Aluno alunos:aluno) {
			System.out.println(alunos.getCodigo());
			System.out.println(alunos.getNome());
			System.out.println(alunos.getPrimeiro());
			System.out.println(alunos.getSegundo());
			System.out.println(alunos.getTerceiro());
			System.out.println(alunos.getQuarto());
			System.out.println(alunos.getMedia());
			System.out.println(alunos.getStatus());
		}

	}

}
