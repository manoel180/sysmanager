package br.com.sysmanager.model;
// Generated 31/08/2009 22:11:06 by Hibernate Tools 3.2.1.GA



/**
 * Estado generated by hbm2java
 */
public class Estado  implements java.io.Serializable {


     private int codigo;
     private String descricao;
     private String sigla;

    public Estado() {
    }

    public Estado(int codigo, String descricao, String sigla) {
       this.codigo = codigo;
       this.descricao = descricao;
       this.sigla = sigla;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getSigla() {
        return this.sigla;
    }
    
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }




}


