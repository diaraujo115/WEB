<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="br.com.conexao.CriarConexao"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logado</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 0;
            }

            #container {
                width: 80%;
                margin: 0 auto;
                padding: 20px;
                background-color: #fff;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                border-radius: 5px;
                margin-top: 50px;
            }

            h1 {
                color: #333;
                text-align: center;
            }

            table {
                width: 100%;
                border-collapse: collapse;
                margin-top: 20px;
            }

            table, th, td {
                border: 1px solid #ddd;
                padding: 8px;
                text-align: left;
            }

            th {
                background-color: #f2f2f2;
            }

            tr:hover {
                background-color: #f5f5f5;
            }

            form {
                display: inline;
            }

            .btn {
                background-color: #af4caa;
                color: white;
                padding: 8px 12px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }

            .btn:hover {
                background-color: #c02525;
            }

            .btn-danger {
                background-color: #5f84a7;
            }

            .btn-danger:hover {
                background-color: #3dd864;
            }

            .form-group {
                margin-bottom: 20px;
            }

            .form-group input[type="text"],
            .form-group input[type="submit"] {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }

            .form-group input[type="submit"] {
                background-color: #4CAF50;
                color: white;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }

            .form-group input[type="submit"]:hover {
                background-color: #45a049;
            }
        </style>
    </head>
    <body>
        <div id="container">
            <%
                String nomes = (String) session.getAttribute("nome");
                String email = (String) session.getAttribute("email");
            %>

            <p>Seja Bem-Vindo : <%=nomes%> | <%=email%> |</p>
            <h1>Logado</h1>

            <h3>Usuarios cadastrados no sistema: </h3>

            <table>
                <tr>
                    <th>Id</th>
                    <th>Nome</th>
                    <th>Email</th>
                    <th>Senha</th>
                    <th>Ações</th>
                </tr>
                <%
                    int id = 0;
                    String nome = "";
                    String emails = "";
                    String senha = "";
                    Connection conn = CriarConexao.getConexao();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from tb_login");
                    while (rs.next()) {
                        id = rs.getInt("id");
                        nome = rs.getString("nome");
                        emails = rs.getString("email");
                        senha = rs.getString("senha");
                %>
                <tr>
                    <td><%=id%></td>
                    <td><%=nome%></td>
                    <td><%=emails%></td>
                    <td><%=senha%></td>
                    <td>


                        <form action="DeletarUsuario" method="post">
                            <input type="hidden" name="id" value="<%=id%>">
                            <input type="submit" value="Deletar" class="btn btn-danger">
                        </form>
                    </td>
                </tr>
                <% }
                    rs.close();
                    stmt.close();
                    conn.close();
                %>
                   
                <h1>Editar Usuário</h1>
            </table>

            <form action="UpdateLogin" method="post" class="form-group">
                <strong>Id:</strong>
                <input type="text" name="id" size="1" value="<%=request.getParameter("id")%>">

                <strong>Nome:</strong>
                <input type="text" name="nome" size="35" value="<%=request.getParameter("nome")%>">

                <strong>Email:</strong>
                <input type="text" name="email" size="35" value="<%=request.getParameter("email")%>">

                <strong>Senha:</strong>
                <input type="text" name="senha" size="10" value="<%=request.getParameter("senha")%>">

                <input type="hidden" name="ac" value="atualizar">

                <input type="submit" value="Atualizar" class="btn">
            </form>

            <br><br>
            <a href="remover.jsp" class="btn">Sair</a>
        </div>
    </body>
</html>
