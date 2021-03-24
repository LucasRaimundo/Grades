package br.com.turma.jdbc;

public class TesteCadastrarAluno {

	public static void main(String[] args) {
		Aluno aluno =  new Aluno("Mãe da rafinha", 4, 0, 8, 4);
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.cadastrar(aluno);
	}

}
