<%-- 
    Document   : index
    Created on : 10/09/2024, 20:29:06
    Author     : laboratorio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>INDEX</title>
    </head>
    <body>
        <h1>Cadastrar Login</h1>
        
        <table>
            <form name="fmrCadastroLogin" action="CadastroLogin" method="post">
                <tr>
                    <td>Email.:</td><td><input type="text" name="email"></td>
                    <td>Senha.:</td><td><input type="password" name="senha"></td>
                    
                    <td colspan="2"><input type="submit" value="cadastrar"/></td>
            </form>
            
        </table
        
    </body>
</html>
