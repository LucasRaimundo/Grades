
<%@page import="br.com.turma.jdbc.Aluno"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar Alunos</title>
</head>
<body>
<h2>Lista de Alunos </h2>
	<a href="entrada?acao=incluir"><button>Cadastrar Novo Aluno</button></a>

<table border=1>
		<thead>
			<tr bgcolor="black" style="color:white">
				<th>Código</th>
				<th>Nome</th>
				<th>Primeiro Bimestre</th>
				<th>Segundo Bimestre</th>
				<th>Terceiro Bimestre</th>
				<th>Quarto Bimestre</th>
				<th>Média</th>
				<th>Status</th>
				<th colspan="2">Ação</th>
				</tr>
		</thead>
		<tbody>
		
		<c:forEach var="aluno" items="${alunos}">
			<tr>
				<td> ${aluno.codigo}</td>
				<td> ${aluno.nome}</td>
				<td> ${aluno.primeiro}</td>
				<td> ${aluno.segundo}</td>
				<td> ${aluno.terceiro}</td>
				<td> ${aluno.quarto}></td>
				<td> ${aluno.media}</td>
				<td> ${aluno.status}</td>
				<td><a href="entrada?acao=alterar&cod=${aluno.codigo}"> Alterar</a></td>
				<td><a href="entrada?acao=excluir&cod=${aluno.codigo}"> Excluir</a></td>
			</tr>
		</c:forEach>
		
		</tbody>
	</table>
</body>
</html>