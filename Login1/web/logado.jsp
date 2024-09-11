<%@page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="150-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="cext/html; charset=I50-28859-1">
<title>Logado</title>
</head>
<body>
<
String email = (String) session.getAttribute ("email");
>
Seja bem Vindo : <t=email %> | <a href="remover.jsp">Sair</a>
<h1>Logado</h1>
<hr>
</body>
