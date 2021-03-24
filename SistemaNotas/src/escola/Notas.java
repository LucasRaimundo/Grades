package escola;

public class Notas {
private String nome;
private double primeiroBimestre;
private double segundoBimestre;
private double terceiroBimestre;
private double quartoBimestre;
private double media;

public double  calcularMedia() {
	this.media = (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre) / 4;
	return this.media;
}

public String verificarStatus() {
	if(this.media >= 5) {
		return "Aprovado";
	} else {
		return "Reprovado";
	}
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getPrimeiroBimestre() {
	return primeiroBimestre;
}
public void setPrimeiroBimestre(double primeiroBimestre) {
	if (primeiroBimestre <= 10 && primeiroBimestre >= 0 ) {
	this.primeiroBimestre = primeiroBimestre;
	}
}
public double getSegundoBimestre() {
	return segundoBimestre;
}
public void setSegundoBimestre(double segundoBimestre) {
	if (segundoBimestre <= 10 && segundoBimestre >= 0 ) {
	this.segundoBimestre = segundoBimestre;
	}
}
public double getTerceiroBimestre() {
	return terceiroBimestre;
}
public void setTerceiroBimestre(double terceiroBimestre) {
	if (terceiroBimestre <= 10 && terceiroBimestre >= 0 ) {
	this.terceiroBimestre = terceiroBimestre;
	}
}
public double getQuartoBimestre() {
	return quartoBimestre;
}
public void setQuartoBimestre(double quartoBimestre) {
	if (quartoBimestre <= 10 && quartoBimestre >= 0 ) {
	this.quartoBimestre = quartoBimestre;
	}
}
public double getMedia() {
	return media;
}
public void setMedia(double media) {
	this.media = media;
}


}
