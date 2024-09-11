<%-- 
    Document   : cadastrado
    Created on : 10/09/2024, 21:31:30
    Author     : laboratorio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script language="Javascript">
            var timer = 2;
            function countdown() {
                if (timer > O) {
                timer -=1;
                setTimeout("countdown()", 3000);
            } else {
                location.href = 'login.jsp';
            }       
        }
        
        countdown();
        </script>
        
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%       String email = (String) request.getAttribute ("email");
             out.println("<h4>Email " + email + " Cadastrado com sucesso<h4>");
             out.println("Você será redirecionado para pagina de login");
    %>
</body>
</html>


