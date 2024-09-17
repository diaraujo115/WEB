package br.com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    private Connection con;

    public UsuarioDAO(Connection con){
        this.con = con;
    }

    public void adicionar(Usuario u) throws SQLException{
        String sql = "INSERT INTO tb_login(nome, email, senha) VALUES (?, ?, ?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getSenha());

            stmt.executeUpdate();
            stmt.close();
        } catch(SQLException e){
            e.printStackTrace();
            throw e;
        }
    }

    public void atualizar(Usuario u) throws SQLException{
        String sql = "UPDATE tb_login SET nome = ?, email = ?, senha = ? WHERE id = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getSenha());
            stmt.setInt(4, u.getId());

            stmt.executeUpdate();
            stmt.close();
        } catch(SQLException e){
            e.printStackTrace();
            throw e;
        }
    }

    public void deletar(int id) throws SQLException {
        String sql = "DELETE FROM tb_login WHERE id = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        } catch(SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
