package br.com.fortlev.cir.dao;

import br.com.fortlev.cir.bean.Material;
import br.com.fortlev.cir.connection.ConexaoBancoMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus.s
 */
public class MaterialDAO extends ConexaoBancoMysql {

    public boolean create(Material material) throws Exception {
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;

        /*
        * aplicando as informações no banco de dados com tratamento de exceção.
         */
        try {
            String sql = "INSERT INTO tb_material (codigo, produto, descricao)VALUES(?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, material.getCodigo());
            stmt.setString(2, material.getProduto());
            stmt.setString(3, material.getDescricao());

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
    * list para puxar os produtos do banco de dados.
     */
    public List<Material> read() throws Exception {
        // abrindo conexão e preparando.
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Material> material = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tb_material");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Material mat = new Material();
                mat.setId(rs.getInt("idmaterial"));
                mat.setCodigo(rs.getString("codigo"));
                mat.setProduto(rs.getString("produto"));
                mat.setDescricao(rs.getString("descricao"));

                material.add(mat);

            }

        } catch (SQLException ex) {
            System.out.println(ex);

        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt, rs);
        }

        return material;
    }
    
    
    
    /*
    * list para puxar os produtos do banco de dados.
     */
    public List<Material> readCodigo() throws Exception {
        // abrindo conexão e preparando.
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Material> material = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT DISTINCT codigo FROM tb_material;");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Material mat = new Material();

                mat.setCodigo(rs.getString("codigo"));

                material.add(mat);

            }

        } catch (SQLException ex) {
            System.out.println(ex);

        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt, rs);
        }

        return material;
    }

    /*
    * list para puxar os produtos do banco de dados.
     */
    public List<Material> readMaterial() throws Exception {
        // abrindo conexão e preparando.
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Material> material = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT distinct * FROM tb_material WHERE codigo = 4000000507");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Material mat = new Material();
                mat.setProduto(rs.getString("produto"));

                material.add(mat);

            }

        } catch (SQLException ex) {
            System.out.println(ex);

        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt, rs);
        }

        return material;
    }
    
    public List<Material> readMateria2() throws Exception {
        // abrindo conexão e preparando.
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Material> material = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT distinct * FROM tb_material WHERE codigo = 4000000508");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Material mat = new Material();
                mat.setProduto(rs.getString("produto"));

                material.add(mat);

            }

        } catch (SQLException ex) {
            System.out.println(ex);

        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt, rs);
        }

        return material;
    }
    
       public List<Material> readMateria3() throws Exception {
        // abrindo conexão e preparando.
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Material> material = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT distinct * FROM tb_material WHERE codigo = 4000000509");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Material mat = new Material();
                mat.setProduto(rs.getString("produto"));

                material.add(mat);

            }

        } catch (SQLException ex) {
            System.out.println(ex);

        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt, rs);
        }

        return material;
    }

    /*
    * realizar update no banco de dados.
     */
    public boolean update(Material mat) {
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;

        // aplicando as informações no banco de dados com tratamento de exceção. 
        try {
            stmt = con.prepareStatement("UPDATE tb_material SET codigo = ?, produto = ?, descricao = ? WHERE id = ? ");

            stmt.setString(1, mat.getCodigo());
            stmt.setString(2, mat.getProduto());
            stmt.setString(3, mat.getDescricao());

            stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {

            return false;
        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt);
        }

    }

    /*
    * deletando a empresa
     */
    public boolean delete(Material mat) throws Exception {

        Connection con = ConexaoBancoMysql.getInstance().getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tb_material WHERE idmaterial = ?");
            stmt.setInt(1, mat.getId());

            stmt.executeUpdate();

            return true;
        } catch (SQLException ex) {

            return false;
        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt);
        }

    }

}
