package br.com.turma.jdbc;

public class Endereco {
	private String rua;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	private int cod_aluno;
	
	public int getCod_aluno() {
		return cod_aluno;
	}


	public void setCod_aluno(int cod_aluno) {
		this.cod_aluno = cod_aluno;
	}


	public Endereco() {
		
	}
	
	
	public Endereco(String rua, String bairro, String cep, String cidade, String estado) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	public String getRua() {
		return rua;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCep() {
		return cep;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
