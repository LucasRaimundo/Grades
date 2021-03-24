
package br.com.turma.jdbc;

public class TesteMostrarAlunoCod {

	public static void main(String[] args) {
		try {
			
		
		AlunoDao alunoDao = new AlunoDao();
		Aluno aluno = alunoDao.mostrarPorCodigo(15);
		
		System.out.println("Código:" + aluno.getCodigo());
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Primeiro Bimestre:" + aluno.getPrimeiro());
		System.out.println("Segundo Bimestre: " + aluno.getSegundo());
		System.out.println("Terceiro Bimestre:" + aluno.getTerceiro());
		System.out.println("Quarto Bimestre: " + aluno.getQuarto());
		System.out.println("Media:" + aluno.getMedia());
		System.out.println("Status: " + aluno.getStatus());
		} catch (NullPointerException e) {
			System.out.println("Codigo invalido");
		}

	}

} 
