import br.com.conexao.CriarConexao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginControllers extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        String sql = "SELECT * FROM tb_login WHERE email = ? AND senha = ?";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Obtendo a conexão com o banco de dados
            con = CriarConexao.getConexao();

            // Preparando a consulta SQL
            stmt = con.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);

            // Executando a consulta SQL
            rs = stmt.executeQuery();

            if (rs.next()) {
                // Se encontrou um usuário com o email e senha fornecidos, define a sessão e redireciona para a página logado.jsp
                HttpSession session = request.getSession();
                session.setAttribute("email", email);
                request.getRequestDispatcher("logado.jsp").forward(request, response);
            } else {
                // Se não encontrou, redireciona para a página de erro errodeusuario.jsp
                request.getRequestDispatcher("errodeusuario.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            // Em caso de erro de SQL, imprime o stack trace e redireciona para a página de erro errodeusuario.jsp
            e.printStackTrace();
            request.getRequestDispatcher("errodeusuario.jsp").forward(request, response);
        } finally {
            // Fechando os recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
