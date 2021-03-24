package br.com.turma.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection receberConexao() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/dbalunos?useSSL=false","root","");
			System.out.println("Banco de dados conectado com sucesso");
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println("Deu merda zica");
			e.printStackTrace();
		}
		return con;
	}
}
