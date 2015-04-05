<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%--- Criação do Usuário Vindo de Novo Cadastro --%>
<jsp:useBean id="cliente" class="br.ucb.modelo.Usuario" scope="session"></jsp:useBean>
<jsp:setProperty name="cliente" property="nome" value="${param.novoUsuario}"/>
<jsp:setProperty name="cliente" property="senha" value="${param.novoPassword}"/>	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mercado</title>
</head>
<body>
	<h2> Mercado do seu Zé </h2>
	<form method="post" action="Calcular.do">
		<b>Usuário:</b> <input type="text" name="usuario" size=10><p/>
		<b>Senha:</b> <input type="password" name="password" size=7><p/>
		Valor da Mercadoria: <input type="text" name="valor" size=5><p/>
		<input type="submit" value="Confirmar"><p/> 
		Caso deseja cadastrar um novo usuário clique <a href="cadastro.jsp">aqui</a> 
</form>
</body>
</html>