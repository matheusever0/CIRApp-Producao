package br.com.fortlev.cir.dao;

import br.com.fortlev.cir.bean.EntradaSaida;
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
public class EntradaSaidaRefugoDAO extends ConexaoBancoMysql {

    public boolean createEntrada(EntradaSaida entrada) throws Exception {
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;

        /*
        * aplicando as informações no banco de dados com tratamento de exceção.
         */
        try {
            String sql = "INSERT INTO tb_entrada (data, codigo, material, descricao, quantidade, empilhador, letra)VALUES(?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setDate(1, new java.sql.Date(entrada.getData().getTime()));
            stmt.setString(2, entrada.getCodigo());
            stmt.setString(3, entrada.getProduto());
            stmt.setString(4, entrada.getDescricao());
            stmt.setString(5, entrada.getQuantidade());
            stmt.setString(6, entrada.getEmpilhador());
            stmt.setString(7, entrada.getLetra());

            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt);
        }

    }
    
    
    public boolean createSaida(EntradaSaida saida) throws Exception {
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;

        /*
        * aplicando as informações no banco de dados com tratamento de exceção.
         */
        try {
            String sql = "INSERT INTO tb_consumo (data, codigo, material, descricao, quantidade, empilhador, letra)VALUES(?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setDate(1, new java.sql.Date(saida.getData().getTime()));
            stmt.setString(2, saida.getCodigo());
            stmt.setString(3, saida.getProduto());
            stmt.setString(4, saida.getDescricao());
            stmt.setString(5, saida.getQuantidade());
            stmt.setString(6, saida.getEmpilhador());
            stmt.setString(7, saida.getLetra());

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
    public List<EntradaSaida> readEntrada() throws Exception {
        // abrindo conexão e preparando.
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<EntradaSaida> entradaSaida = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tb_entrada");
            rs = stmt.executeQuery();

            while (rs.next()) {

                EntradaSaida ents = new EntradaSaida();

                ents.setId(rs.getInt("identrada"));
                ents.setData(rs.getDate("data"));
                ents.setCodigo(rs.getString("codigo"));
                ents.setProduto(rs.getString("material"));
                ents.setDescricao(rs.getString("descricao"));
                ents.setQuantidade(rs.getString("quantidade"));
                ents.setEmpilhador(rs.getString("empilhador"));
                ents.setLetra(rs.getString("letra"));

                entradaSaida.add(ents);

            }

        } catch (SQLException ex) {

        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt, rs);
        }

        return entradaSaida;
    }
    
    /*
    * list para puxar os produtos do banco de dados.
     */
    public List<EntradaSaida> readConsumo() throws Exception {
        // abrindo conexão e preparando.
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<EntradaSaida> entradaSaida = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tb_consumo");
            rs = stmt.executeQuery();

            while (rs.next()) {

                EntradaSaida ents = new EntradaSaida();

                ents.setId(rs.getInt("idconsumo"));
                ents.setData(rs.getDate("data"));
                ents.setCodigo(rs.getString("codigo"));
                ents.setProduto(rs.getString("material"));
                ents.setDescricao(rs.getString("descricao"));
                ents.setQuantidade(rs.getString("quantidade"));
                ents.setEmpilhador(rs.getString("empilhador"));
                ents.setLetra(rs.getString("letra"));

                entradaSaida.add(ents);

            }

        } catch (SQLException ex) {

        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt, rs);
        }

        return entradaSaida;
    }
    
        public boolean updateSaida(EntradaSaida saida) {
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;

        // aplicando as informações no banco de dados com tratamento de exceção. 
        try {
            stmt = con.prepareStatement("UPDATE tb_consumo SET data = ?, codigo = ?, material = ?, descricao = ?, quantidade = ?, empilhador = ?, letra = ? WHERE idconsumo = ?");

            stmt.setDate(1, new java.sql.Date(saida.getData().getTime()));
            stmt.setString(2, saida.getCodigo());
            stmt.setString(3, saida.getProduto());
            stmt.setString(4, saida.getDescricao());
            stmt.setString(5, saida.getQuantidade());
            stmt.setString(6, saida.getEmpilhador());
            stmt.setString(7, saida.getLetra());
            stmt.setInt(8, saida.getId());

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
    * realizar update no banco de dados.
     */
    public boolean updateEntrada(EntradaSaida entrada) {
        Connection con = ConexaoBancoMysql.getInstance().getConnection();
        PreparedStatement stmt = null;

        // aplicando as informações no banco de dados com tratamento de exceção. 
        try {
            stmt = con.prepareStatement("UPDATE tb_entrada SET data = ?, codigo = ?, material = ?, descricao = ?, quantidade = ?, empilhador = ?, letra = ? WHERE identrada = ?");

            stmt.setDate(1, new java.sql.Date(entrada.getData().getTime()));
            stmt.setString(2, entrada.getCodigo());
            stmt.setString(3, entrada.getProduto());
            stmt.setString(4, entrada.getDescricao());
            stmt.setString(5, entrada.getQuantidade());
            stmt.setString(6, entrada.getEmpilhador());
            stmt.setString(7, entrada.getLetra());
            stmt.setInt(8, entrada.getId());

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
    * deletando a empresa
     */
    public boolean deleteEntrada(EntradaSaida entrada) throws Exception {

        Connection con = ConexaoBancoMysql.getInstance().getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tb_entrada WHERE identrada = ?");
            stmt.setInt(1, entrada.getId());

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
    public boolean deleteSaida(EntradaSaida saida) throws Exception {

        Connection con = ConexaoBancoMysql.getInstance().getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tb_consumo WHERE idconsumo = ?");
            stmt.setInt(1, saida.getId());

            stmt.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        } finally {
            ConexaoBancoMysql.getInstance().closeConnection(con, stmt);
        }

    }

}
