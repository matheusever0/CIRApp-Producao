package br.com.fortlev.cir.bean;

import java.util.Date;

/**
 *
 * @author matheus.s
 */
public class EntradaSaida extends Material{

        private String empilhador;
        private String letra; 
    
    public EntradaSaida() {
    }

    public EntradaSaida(int id, Date data, String codigo, String produto, String descricao, String quantidade) {
        super(id, data, codigo, produto, descricao, quantidade);
    }

    public String getEmpilhador() {
        return empilhador;
    }

    public void setEmpilhador(String empilhador) {
        this.empilhador = empilhador;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
    
}
