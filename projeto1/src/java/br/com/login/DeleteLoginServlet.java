package br.com.login;

import br.com.conexao.CriarConexao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DeleteLoginServlet", urlPatterns = {"/DeletarUsuario"})
public class DeleteLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idStr = request.getParameter("id");
        if (idStr != null && !idStr.isEmpty()) {
            int id = Integer.parseInt(idStr);
            Connection con = null;
            try {
                con = CriarConexao.getConexao();
                UsuarioDAO dao = new UsuarioDAO(con);
                dao.deletar(id);
                response.sendRedirect("logado.jsp"); // Redireciona de volta para a página logado.jsp após a exclusão
            } catch (SQLException e) {
                e.printStackTrace();
                // Trate a exceção apropriadamente, por exemplo, exibindo uma mensagem de erro
                response.sendRedirect("errodeusuario.jsp"); // Redireciona para página de erro em caso de falha na exclusão
            } finally {
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        // Trate a exceção apropriadamente, se necessário
                    }
                }
            }
        } else {
            // Se o ID estiver vazio ou nulo, talvez você queira redirecionar para uma página de erro
            response.sendRedirect("errodeusuario.jsp");
        }
    }
}
