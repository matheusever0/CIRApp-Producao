package br.com.fortlev.cir.bean;

/**
 *
 * @author matheus.s
 */
public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String usuario;
    private String senha;
    private String matricula;
    private String letra;
    private String permissao;

    public Usuario() {
    }

    public Usuario(int id, String nome, String email, String usuario, String senha, String matricula, String letra, String permissao) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.matricula = matricula;
        this.letra = letra;
        this.permissao = permissao;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

}
