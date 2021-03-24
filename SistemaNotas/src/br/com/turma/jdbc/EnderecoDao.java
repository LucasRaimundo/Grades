package br.com.turma.jdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


public class EnderecoDao {
	public void cadastrar(Endereco endereco) {
		Aluno aluno = new Aluno();
		Connection con = Conexao.receberConexao();
		String sql = "insert into endereco (rua, bairro, cep, cidade, estado, cod_aluno) values (?, ?, ?, ?, ?, ?) ";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, endereco.getRua());
			preparador.setString(2, endereco.getBairro());
			preparador.setString(3, endereco.getCep());
			preparador.setString(4, endereco.getCidade());
			preparador.setString(5, endereco.getEstado());
			preparador.setInt(6, endereco.getCod_aluno());
			preparador.execute();
			System.out.println("Endereço cadastrado");
		} catch(SQLException e) {
			System.err.println("Não foi possivel cadastrar");
			e.printStackTrace();
		}
	}
	
	public ArrayList<Endereco> mostrarTudo(){
		Connection con = Conexao.receberConexao();
		ArrayList<Endereco> enderecos = new ArrayList<>();
		String sql = "select * from endereco";
		PreparedStatement preparador;
		try {
			preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()) {
				Endereco endereco = new Endereco();
				endereco.setRua(resultado.getString("rua"));
				endereco.setBairro(resultado.getString("bairro"));
				endereco.setCep(resultado.getString("cep"));
				endereco.setCidade(resultado.getString("cidade"));
				endereco.setEstado(resultado.getString("estado"));
				
			}
		} catch(SQLException e) {
			System.err.println("Não foi possivel");
		} return enderecos;
	}

}
