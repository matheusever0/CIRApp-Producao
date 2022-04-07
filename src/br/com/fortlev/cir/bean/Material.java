package br.com.fortlev.cir.bean;

import java.util.Date;

/**
 *
 * @author matheus.s
 */
public class Material {



    private String codigo;
    private String produto;
    private String descricao;
    private String quantidade;
    private int id;
    private Date data;

    public Material() {
    }

    public Material(int id,Date data, String codigo, String produto, String descricao, String quantidade) {
        
        this.id = id;
        this.data = data;
        this.codigo = codigo;
        this.produto = produto;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return getProduto(); 
    }
    
    
    

}
