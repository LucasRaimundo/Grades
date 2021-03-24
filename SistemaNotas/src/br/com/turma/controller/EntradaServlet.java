package br.com.turma.controller;
//author: Lucas da Silva Raimundo

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.turma.jdbc.Aluno;
import br.com.turma.jdbc.AlunoDao;
import br.com.turma.jdbc.Endereco;
import br.com.turma.jdbc.EnderecoDao;


@WebServlet("/entrada")
public class EntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		if(acao.equals("incluir")) {
			RequestDispatcher rd = request.getRequestDispatcher("/telacadastraralunos.jsp");
			rd.forward(request, response);
		}else if(acao.equals("mostrar")) {
			AlunoDao alunoDao = new AlunoDao();
			ArrayList<Aluno> alunos = alunoDao.mostrarTodos();
			request.setAttribute("alunos", alunos);
			RequestDispatcher rd = request.getRequestDispatcher("/telamostraralunos.jsp");
			rd.forward(request, response);
		}else if(acao.equals("excluir")) {
			int cod = Integer.parseInt(request.getParameter("cod"));
			AlunoDao alunoDao = new AlunoDao();
			alunoDao.excluirPorCod(cod);
			
			response.sendRedirect("http://localhost:8082/SistemaNotas/entrada?acao=mostrar");
		}else if(acao.equals("alterar")) {
			int cod = Integer.parseInt(request.getParameter("cod"));
			AlunoDao alunoDao = new AlunoDao();
			Aluno aluno = alunoDao.mostrarPorCodigo(cod);
			
			
			request.setAttribute("aluno", aluno);
			RequestDispatcher rd = request.getRequestDispatcher("/telaalteraraluno.jsp");
			
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("txtacao");
		String nome = request.getParameter("txtnome");
		double primeiro = Double.parseDouble(request.getParameter("txtprimeiro"));
		double segundo = Double.parseDouble(request.getParameter("txtsegundo"));
		double terceiro = Double.parseDouble(request.getParameter("txtterceiro"));
		double quarto = Double.parseDouble(request.getParameter("txtquarto"));
		String rua = request.getParameter("txtrua");
		String bairro = request.getParameter("txtbairro");
		String cep = request.getParameter("txtcep");
		String cidade = request.getParameter("txtcidade");
		String estado = request.getParameter("txtestado");
		
			
		
		
		Aluno aluno = new Aluno(nome, primeiro, segundo, terceiro, quarto);
		Endereco endereco = new Endereco(rua, bairro, cep, cidade, estado);
		
		AlunoDao alunoDao = new AlunoDao();
		EnderecoDao enderecoDao = new EnderecoDao();
		if(acao.equals("incluir")) {
		alunoDao.cadastrar(aluno);
		enderecoDao.cadastrar(endereco);
		} else if(acao.equals("alterar")) {
			aluno.setCodigo(Integer.parseInt(request.getParameter("txtcod")));
			alunoDao.alterarPorCod(aluno);
		}
		response.sendRedirect("http://localhost:8082/SistemaNotas/entrada?acao=mostrar");
	}

}
