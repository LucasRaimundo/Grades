package br.com.turma.jdbc;

import java.util.ArrayList;

public class Aluno {
	public Aluno() {
		
	}
	
	public void adciona(Disciplina disciplina) {
		this.disciplina.add(disciplina);
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPrimeiro(double primeiro) {
		this.primeiro = primeiro;
	}
	public void setSegundo(double segundo) {
		this.segundo = segundo;
	}
	public void setTerceiro(double terceiro) {
		this.terceiro = terceiro;
	}
	public void setQuarto(double quarto) {
		this.quarto = quarto;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Aluno(String nome, double primeiro, double segundo, double terceiro, double quarto){
		this.nome = nome;
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.terceiro = terceiro;
		this.quarto = quarto;
		this.media = calcularMedia();
		this.status = verificarStatus();
	}
	public Aluno(String nome, double primeiro, double segundo, double terceiro, double quarto, Endereco endereco){
		this.nome = nome;
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.terceiro = terceiro;
		this.quarto = quarto;
		this.media = calcularMedia();
		this.status = verificarStatus();
		this.endereco = endereco;
	}
	
	public Aluno(int cod, String nome, double primeiro, double segundo, double terceiro, double quarto){
		this.codigo = cod;
		this.nome = nome;
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.terceiro = terceiro;
		this.quarto = quarto;
		this.media = calcularMedia();
		this.status = verificarStatus();
	}
	
	
	private int codigo;
	private String nome;
	private double primeiro;
	private double segundo;
	private double terceiro;
	private double quarto;
	private double media;
	private String status;
	private Endereco endereco;
	private ArrayList<Disciplina> disciplina = new ArrayList<>();
	
	
	public ArrayList<Disciplina> getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	private double calcularMedia() {
		return (this.primeiro + this.segundo  +this.terceiro+this.quarto) /4.0;
		
	}
	
	private String verificarStatus() {
		if (this.media >= 7.0000 && this.media <=10) { 
			return "Aprovado";
		} else if (media >= 5.00000 && media <=7.00000) {
			return "RECUPERAÇÃO";
		} else if (media <= 4.00000 ) {
			return "REPROVADO";
		} else {
			return "NOTA INVALIDA";
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPrimeiro() {
		return primeiro;
	}

	public double getSegundo() {
		return segundo;
	}

	public double getTerceiro() {
		return terceiro;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public double getQuarto() {
		return quarto;
	}

	public double getMedia() {
		return media;
	}

	public String getStatus() {
		return status;
	}
	
}
