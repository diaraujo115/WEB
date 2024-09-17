package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import br.com.conexao.CriarConexao;
import java.sql.Connection;

public final class logado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Logado</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #f4f4f4;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #container {\n");
      out.write("                width: 80%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                background-color: #fff;\n");
      out.write("                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin-top: 50px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                color: #333;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table, th, td {\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                padding: 8px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th {\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            tr:hover {\n");
      out.write("                background-color: #f5f5f5;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form {\n");
      out.write("                display: inline;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn {\n");
      out.write("                background-color: #af4caa;\n");
      out.write("                color: white;\n");
      out.write("                padding: 8px 12px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn:hover {\n");
      out.write("                background-color: #c02525;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn-danger {\n");
      out.write("                background-color: #5f84a7;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn-danger:hover {\n");
      out.write("                background-color: #3dd864;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-group {\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-group input[type=\"text\"],\n");
      out.write("            .form-group input[type=\"submit\"] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-group input[type=\"submit\"] {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-group input[type=\"submit\"]:hover {\n");
      out.write("                background-color: #45a049;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("            ");

                String nomes = (String) session.getAttribute("nome");
                String email = (String) session.getAttribute("email");
            
      out.write("\n");
      out.write("\n");
      out.write("            <p>Seja Bem-Vindo : ");
      out.print(nomes);
      out.write(" | ");
      out.print(email);
      out.write(" |</p>\n");
      out.write("            <h1>Logado</h1>\n");
      out.write("\n");
      out.write("            <h3>Usuarios cadastrados no sistema: </h3>\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Id</th>\n");
      out.write("                    <th>Nome</th>\n");
      out.write("                    <th>Email</th>\n");
      out.write("                    <th>Senha</th>\n");
      out.write("                    <th>Ações</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

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
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(id);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(nome);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(emails);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(senha);
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <form action=\"DeletarUsuario\" method=\"post\">\n");
      out.write("                            <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("                            <input type=\"submit\" value=\"Deletar\" class=\"btn btn-danger\">\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 }
                    rs.close();
                    stmt.close();
                    conn.close();
                
      out.write("\n");
      out.write("\n");
      out.write("                <h1>Editar Usuário</h1>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <form action=\"UpdateLogin\" method=\"post\" class=\"form-group\">\n");
      out.write("                <strong>Id:</strong>\n");
      out.write("                <input type=\"text\" name=\"id\" size=\"1\" value=\"");
      out.print(request.getParameter("id"));
      out.write("\">\n");
      out.write("\n");
      out.write("                <strong>Nome:</strong>\n");
      out.write("                <input type=\"text\" name=\"nome\" size=\"35\" value=\"");
      out.print(request.getParameter("nome"));
      out.write("\">\n");
      out.write("\n");
      out.write("                <strong>Email:</strong>\n");
      out.write("                <input type=\"text\" name=\"email\" size=\"35\" value=\"");
      out.print(request.getParameter("email"));
      out.write("\">\n");
      out.write("\n");
      out.write("                <strong>Senha:</strong>\n");
      out.write("                <input type=\"text\" name=\"senha\" size=\"10\" value=\"");
      out.print(request.getParameter("senha"));
      out.write("\">\n");
      out.write("\n");
      out.write("                <input type=\"hidden\" name=\"ac\" value=\"atualizar\">\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"Atualizar\" class=\"btn\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <br><br>\n");
      out.write("            <a href=\"remover.jsp\" class=\"btn\">Sair</a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
