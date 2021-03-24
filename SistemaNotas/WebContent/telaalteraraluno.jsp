<%@ page import="br.com.turma.jdbc.Aluno" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students Alter</title>
</head>
<body>
<h1>Alterar Aluno</h1>


<form method="post" action="entrada">
	Cod <input type="text" name="txtcod" value="${aluno.codigo}" size="5" readonly>
	Name <input type="text" name="txtnome" value="${aluno.nome}" size="45">
	Primeiro <input type="text" name="txtprimeiro" value="${aluno.primeiro}" size="5">
	Segundo <input type="text" name="txtsegundo" value="${aluno.segundo}" size="5" >
	Terceiro <input type="text" name="txtterceiro" value="${aluno.terceiro}" size="5" >
	Quarto <input type="text" name="txtquarto" value="${aluno.quarto}" size="5" >
	<input type="hidden" name="txtacao" value="alterar">
	<input type="submit" value="Alterar Aluno">
</form>

</body>
</html>