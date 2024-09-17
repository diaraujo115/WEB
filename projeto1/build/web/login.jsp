<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="css/estilo_login.css">
</head>
<body>
    <h1>Login</h1>
    <form name="formLogin" action="Login" method="post">
        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome" />

        <label for="email">Email:</label>
        <input type="text" name="email" id="email" />

        <label for="senha">Senha:</label>
        <input type="password" name="senha" id="senha" />

        <input type="submit" value="Entrar" />
    </form>
</body>
</html>
