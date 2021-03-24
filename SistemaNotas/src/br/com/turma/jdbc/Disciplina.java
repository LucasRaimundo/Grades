package br.com.turma.jdbc;

public class Disciplina {
	private String materia;
	private int duraco;
	public Disciplina(String materia, int duraco) {
		super();
		this.materia = materia;
		this.duraco = duraco;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getDuraco() {
		return duraco;
	}
	public void setDuraco(int duraco) {
		this.duraco = duraco;
	}
		
	
}
