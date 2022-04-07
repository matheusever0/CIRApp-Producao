package br.com.fortlev.cir.dao;

import br.com.fortlev.cir.bean.Usuario;
import br.com.fortlev.cir.connection.ConexaoBancoMysql;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author matheus.s
 */
public class UsuarioDAO {
        public boolean checkLogin(String login, String senha) {
        // abrindo conexão e preparando.
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM tb_usuarios WHERE usuario = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true;

               
            } else {
                check = false;
              
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt, rs);

        }

        return check;
    }
    
    
        public boolean create(Usuario users) throws Exception {
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;
        String senha = users.getSenha();
        /*
        * Cria o usuário no banco de dados. 
         */
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(senha.getBytes("UTF-8"));

            StringBuilder sb = new StringBuilder();

            for (byte b : messageDigest) {
                sb.append(String.format("%02X", 0xFF & b));

            }
            String senhaHex = sb.toString();

            stmt = con.prepareStatement("INSERT INTO tb_usuarios (nome,email,usuario,senha,matricula,letra,permissao)VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, users.getNome());
            stmt.setString(2, users.getEmail());
            stmt.setString(3, users.getUsuario());
            stmt.setString(4, senhaHex);
            stmt.setString(5, users.getMatricula());
            stmt.setString(6, users.getLetra());
            stmt.setString(7, users.getPermissao());

            stmt.executeUpdate();
           
            return true;
        } catch (SQLException ex) {

            System.out.println(ex);
            return false;
        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt);
        }

    }

    /*
    * Lista os usuários do banco de dados cadastrado. 
     */
    public List<Usuario> read() throws Exception {
        // abrindo conexão e preparando.
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> Users = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tb_usuarios");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario users = new Usuario();
                users.setNome(rs.getString("nome"));
                users.setEmail(rs.getString("email"));
                users.setUsuario(rs.getString("usuario"));
                users.setSenha(rs.getString("senha"));
                users.setMatricula(rs.getString("matricula"));
                users.setLetra(rs.getString("letra"));
                users.setPermissao(rs.getString("permissao"));
                Users.add(users);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            
        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt, rs);
        }

        return Users;

    }

    /*
    * Realiza update dos usuários. 
     */
    public boolean update(Usuario users) throws Exception {

        Connection con = ConexaoBancoMysql.getInstance().getConnection();

        PreparedStatement stmt = null;
        String senha = users.getSenha();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte messageDigest[] = md.digest(senha.getBytes("UTF-8"));

        StringBuilder sb = new StringBuilder();

        for (byte b : messageDigest) {
            sb.append(String.format("%02X", 0xFF & b));

        }
        String senhaHex = sb.toString();

        try {

            stmt = con.prepareStatement("UPDATE tb_usuarios SET nome = ? ,email = ?,usuario = ?,senha = ?,matricula = ? ,letra = ? ,permissao = ? WHERE id = ?");
            stmt.setString(1, users.getNome());
            stmt.setString(2, users.getEmail());
            stmt.setString(3, users.getUsuario());
            stmt.setString(4, senhaHex);
            stmt.setString(5, users.getMatricula());
            stmt.setString(6, users.getLetra());
            stmt.setString(7, users.getPermissao());
            stmt.setInt(8, users.getId());
        

            stmt.executeUpdate();

            return true;
        } catch (SQLException ex) {

            System.out.println(ex);
            return false;
        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt);
        }

    }

    /*
    * Deletando o usuário
     */
    public boolean delete(Usuario usr) throws Exception {

        Connection con = ConexaoBancoMysql.getInstance().getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tb_usuarios WHERE id = ?");
            stmt.setInt(1, usr.getId());
            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {

            System.out.println(ex);
            return false;
        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt);
        }

    }

    public Usuario getUsuario(String usuario) {
        try {
            // abrindo conexão e preparando.
            Connection con = ConexaoBancoMysql.getInstance().getConnection();
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            Usuario users = null;
            String sql = "SELECT * FROM tb_usuarios ";
            sql += " Where usuario = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, usuario);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                users = new Usuario();
                users.setId(rs.getInt("id"));
                users.setNome(rs.getString("nome"));
                users.setEmail(rs.getString("email"));
                users.setUsuario(rs.getString("usuario"));
                users.setSenha(rs.getString("senha"));
                users.setMatricula(rs.getString("matricula"));
                users.setLetra(rs.getString("letra"));
                users.setPermissao(rs.getString("permissao"));
            }
            rs.close();
            pstmt.close();
            return users;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
        
}
