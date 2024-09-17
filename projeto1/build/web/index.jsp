<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro Login</title>
    <link rel="stylesheet" type="text/css" href="css/estilo_cadastro.css">
</head>
<body>
    <h1>Cadastro Login</h1>
    <table>
        <form name="frmCadastrarLogin" action="CadastroLogin" method="post">
            <tr>
                <td><label for="nome">Nome:</label></td>
                <td><input type="text" name="nome" id="nome" /></td>
            </tr>
            <tr>
                <td><label for="email">Email:</label></td>
                <td><input type="text" name="email" id="email" /></td>
            </tr>
            <tr>
                <td><label for="senha">Senha:</label></td>
                <td><input type="password" name="senha" id="senha" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Cadastrar" /></td>
            </tr>
        </form>
    </table>
</body>
</html>
