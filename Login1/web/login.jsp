<%-- 
    Document   : login
    Created on : 10/09/2024, 20:38:10
    Author     : laboratorio
--%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript">
            function validarLogin(){
                if(document.formLogin.email.value===""){
                    alert("Campo Usuário Não Informado");
                    return false;
                }
                if(document.formLogin.senha.value===""){
                    alert("Campo Senha Não Informado");
                    return false;
                }
                document.formLogin.submit();
                }
</script>
<title>Acessar</title>
</head>

<body>

    <form name="formLogin" action="Login" method="post">
        <p align="center">
            <table>
                <tr><td>Usuário:</td><td><input type="text" name="email"/></td></tr>
                <tr><td>Senha:</td><td><input type="password" name="senha"/></td></tr>
                
                <tr><td colspan="2" align="center"><input type="button" value="Entrar"                                     
                        onclick="validarLogin()"/></td></tr>
            </table>
           </p>
    </form
</body>
</html>

