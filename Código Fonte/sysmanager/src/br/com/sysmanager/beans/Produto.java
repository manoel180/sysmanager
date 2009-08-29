package br.com.sysmanager.beans;

public class Produto  implements java.io.Serializable {

     private Integer codigo;
     private UnidadeMedida unidadeMedida;
     private String descricao;
     private int quantidadeEstoque;
     private double preco;

    public Produto() {
    }

    public Produto(UnidadeMedida unidadeMedida, String descricao, int quantidadeEstoque, double preco) {
       this.unidadeMedida = unidadeMedida;
       this.descricao = descricao;
       this.quantidadeEstoque = quantidadeEstoque;
       this.preco = preco;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public UnidadeMedida getUnidadeMedida() {
        return this.unidadeMedida;
    }
    
    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }
    
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public double getPreco() {
        return this.preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }

}
