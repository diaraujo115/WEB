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

@WebServlet(name = "UpdateLoginServlet", urlPatterns = {"/UpdateLogin"})
public class UpdateLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idStr = request.getParameter("id");
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        if (idStr != null && !idStr.isEmpty()) {
            int id = Integer.parseInt(idStr);
            Connection con = null;
            try {
                con = CriarConexao.getConexao();
                UsuarioDAO dao = new UsuarioDAO(con);
                Usuario u = new Usuario();
                u.setId(id);
                u.setNome(nome);
                u.setEmail(email);
                u.setSenha(senha);
                dao.atualizar(u);
                response.sendRedirect("logado.jsp"); // Redireciona de volta para a página logado.jsp
            } catch (SQLException e) {
                e.printStackTrace();
                // Trate a exceção apropriadamente, por exemplo, exibindo uma mensagem de erro
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
