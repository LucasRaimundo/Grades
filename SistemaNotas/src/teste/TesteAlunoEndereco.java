package teste;

import br.com.turma.jdbc.Aluno;
import br.com.turma.jdbc.Endereco;

public class TesteAlunoEndereco {

	public static void main(String[] args) {
	Endereco endereco = new Endereco("Rua ABC, 10", "Morumbi", "12345-123", "São Paulo", "SP");
	Aluno aluno = new Aluno("José", 3,5,7,9, endereco);
	System.out.println("Nome:" + aluno.getNome());
	
	System.out.println("Rua:" + aluno.getEndereco().getRua());
	System.out.println("Bairro:" + aluno.getEndereco().getBairro());
	System.out.println("Cep:" + aluno.getEndereco().getCep());
	System.out.println("Cidade:" + aluno.getEndereco().getCidade());
	System.out.println("Estado:" + aluno.getEndereco().getEstado());
	}

}
