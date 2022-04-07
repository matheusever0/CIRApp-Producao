/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fortlev.cir.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/**
 *
 * @author matheus.s
 */
public abstract class ConexaoBancoAbstract {
    private Connection cx = null;

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        if (cx == null) {
            
            Properties prop = new Properties();
            try {
                prop.load(getClass().getClassLoader().getResourceAsStream("db.properties"));
            } catch (IOException ex) {
                System.out.println("Erro ao encontrar propriedade " + ex);
            }
            String URL = prop.getProperty("db.url");
            String PASS = prop.getProperty("db.pwd");
            String USER = prop.getProperty("db.user");
            Class.forName(prop.getProperty("db.driver"));
            cx = DriverManager.getConnection(URL, USER, PASS);
        }
        System.out.println(cx);
        return cx;

    }

    public Statement getStatement(){
        try {
            return this.getConnection().createStatement();
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro na classe do banco getStatement " + "ClassNotFoundException" + ex);
        } catch (SQLException ex) {
            System.out.println("Erro em classe do banco getStatement" + "SQLException " + ex);
        }
        return null;
    }

    public PreparedStatement getPreparedStatement(String sql){
        try {
            return this.getConnection().prepareStatement(sql);
        } catch (ClassNotFoundException ex) {
           System.out.println("Erro na classe do banco getPreparedStatement " + "ClassNotFoundException" + ex);
        } catch (SQLException ex) {
           System.out.println("Erro na classe do banco getPreparedStatement " + "SQLException" + ex);
        }
        return null;
    }

    public void getFechaTudo(){
        if (cx != null) {
            try {
                cx.close();
            } catch (SQLException ex) {
                System.out.println("Erro em instancia SQL (getFechaTudo)" + ex);
            }
            cx = null;
        }
    }
}
