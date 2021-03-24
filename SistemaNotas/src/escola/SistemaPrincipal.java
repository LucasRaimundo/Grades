package escola;
import java.util.Scanner;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Notas novoAluno = new Notas();
		String user;
		String password;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o usurario:");
		user = ler.next();
		if (user.equals("Admin")) {
			System.out.println("Digite a senha:");
			password = ler.next();
			if (password.equals("Admin@Admin")) {
				System.out.println("Bem vindo ADM");
			} else {
				System.out.println("Senha errada");
				System.exit(0);
			}
		} else {
			System.exit(0);
		}
		
		
		System.out.println("Digite o nome do Aluno");
		novoAluno.setNome(ler.next());
		System.out.println("Digite a primeira nota do aluno: ");
		novoAluno.setPrimeiroBimestre(ler.nextDouble());
		System.out.println("Digite a segunda nota do aluno: ");
		novoAluno.setSegundoBimestre(ler.nextDouble());
		System.out.println("Digite a terceira nota do aluno: ");
		novoAluno.setTerceiroBimestre(ler.nextDouble());
		System.out.println("Digite a quarta nota do aluno: ");
		novoAluno.setQuartoBimestre(ler.nextDouble());
		
		
		System.out.println("O aluno " + novoAluno.getNome());
		System.out.println("Teve como nota no Primeiro Bimestre: "+ novoAluno.getPrimeiroBimestre());
		System.out.println("Teve como nota no Segundo Bimestre: " + novoAluno.getSegundoBimestre());
		System.out.println("Teve como nota no Terceiro Bimestre: "+ novoAluno.getTerceiroBimestre());
		System.out.println("Teve como nota no Quarto Bimestre: "+ novoAluno.getQuartoBimestre());
		System.out.println("A média do Aluno foi de: "+ novoAluno.calcularMedia());
		System.out.println("O aluno foi: "+ novoAluno.verificarStatus());
		

	}

}
