<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Students</title>
</head>
<body>
	<h2> Insert Students</h2>

	<form method="post" action="entrada">
		Name <input type="text" name="txtnome" size="60" autocomplete="off"><br><br>
		1� Grade <input type="text" name="txtprimeiro" size="5" autocomplete="off">
		2� Grade <input type="text" name="txtsegundo" size="5" autocomplete="off">
		3� Grade <input type="text" name="txtterceiro" size="5" autocomplete="off">
		4� Grade <input type="text" name="txtquarto" size="5" autocomplete="off"><br> <br>
		<h3>Endere�o:</h3>
		Rua <input type="text" name="txtrua" size="50" autocomplete="off"><br><br>
		Bairro <input type="text" name="txtbairro" size="40" autocomplete="off">
		CEP <input type="text" name="txtcep" size="10" autocomplete="off"> <br><br>
		Cidade <input type="text" name="txtcidade" size="40" autocomplete="off">
		UF <input type="text" name="txtestado" size="10" autocomplete="off">
		<input type="hidden" name="txtacao" value="incluir">
		<input type="submit" value="Salvar Aluno">
	</form>
</body>
</html>