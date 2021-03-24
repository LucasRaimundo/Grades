package br.com.turma.jdbc;

public class TesteAlunoDisciplina {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("zé", 8, 8, 8, 8);
		aluno.adciona(new Disciplina("redes", 50));
		aluno.adciona(new Disciplina("Mobile", 40));
		
		System.out.println("nome "+ aluno.getNome());
		System.out.println("materia"+ aluno.getDisciplina().get(0).getMateria());
		System.out.println("materia"+ aluno.getDisciplina().get(1).getMateria());
		
		
		for(Disciplina disciplina:aluno.getDisciplina()) {
			System.out.println("Materia: " + disciplina.getMateria());
		}
	}	

}
