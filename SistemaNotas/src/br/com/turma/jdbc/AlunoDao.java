package br.com.turma.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunoDao {
	public void cadastrar(Aluno aluno) {
		// obter a coneção com o bd
		Connection con = Conexao.receberConexao();
		// criar uma string com o comando sql
		String sql = "insert into alunos (nome, primeiro, segundo, terceiro, quarto, media, status) values(?, ?, ?, ?, ?, ?, ?)";
		// preparação da linha de instrução (statement), substituindo a interrogação pela informação que esta dentro do obj
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, aluno.getNome());
			preparador.setDouble(2, aluno.getPrimeiro());
			preparador.setDouble(3, aluno.getSegundo());
			preparador.setDouble(4, aluno.getTerceiro());
			preparador.setDouble(5, aluno.getQuarto());
			preparador.setDouble(6, aluno.getMedia());
			preparador.setNString(7, aluno.getStatus());
			Endereco endereco = new Endereco();
			endereco.setCod_aluno(aluno.getCodigo());
			preparador.execute();
			System.out.println("Aluno cadastrado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Aluno>mostrarTodos() {
		Connection con = Conexao.receberConexao();
		ArrayList<Aluno> alunos = new ArrayList<>();
		String sql = "select * from alunos";
		PreparedStatement preparador;
		try {
			preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()) {
				Aluno aluno = new Aluno();
				aluno.setCodigo(resultado.getInt("cod"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setPrimeiro(resultado.getDouble("primeiro"));
				aluno.setSegundo(resultado.getDouble("segundo"));
				aluno.setTerceiro(resultado.getDouble("terceiro"));
				aluno.setQuarto(resultado.getDouble("quarto"));
				aluno.setMedia(resultado.getDouble("media"));
				aluno.setStatus(resultado.getString("status"));
				
				alunos.add(aluno);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alunos;
		
	}

	
	public Aluno mostrarPorCodigo(int cod) {
		Connection con = Conexao.receberConexao();
		String sql = "select * from alunos where cod = ?";
		Aluno aluno = null;
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, cod);
			ResultSet resultado = preparador.executeQuery();
			if (resultado.next()) {
				aluno = new Aluno();
				aluno.setCodigo(resultado.getInt("cod"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setPrimeiro(resultado.getDouble("primeiro"));
				aluno.setSegundo(resultado.getDouble("segundo"));
				aluno.setTerceiro(resultado.getDouble("terceiro"));
				aluno.setQuarto(resultado.getDouble("quarto"));
				aluno.setMedia(resultado.getDouble("media"));
				aluno.setStatus(resultado.getString("status"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.err.println("Código invalido");
		}
		
		
		return aluno;
	}


	public void excluirPorCod(int cod) {
		Connection con = Conexao.receberConexao();
		String sql = "delete from alunos where cod = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, cod);
			preparador.execute();
			System.out.println("Aluno Excluido com sucesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void alterarPorCod(Aluno aluno) {
		Connection con = Conexao.receberConexao();
		String sql = "update alunos set nome=?, primeiro=?, segundo=?, terceiro=?, quarto=?, media=?, status=? where cod = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, aluno.getNome());
			preparador.setDouble(2, aluno.getPrimeiro());
			preparador.setDouble(3, aluno.getSegundo());
			preparador.setDouble(4, aluno.getTerceiro());
			preparador.setDouble(5, aluno.getQuarto());
			preparador.setDouble(6, aluno.getMedia());
			preparador.setString(7, aluno.getStatus());
			preparador.setInt(8,  aluno.getCodigo());
			
			
			preparador.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
