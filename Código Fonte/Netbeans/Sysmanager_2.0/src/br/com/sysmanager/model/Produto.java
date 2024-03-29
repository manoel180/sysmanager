package br.com.sysmanager.model;
// Generated 06/10/2009 21:13:06 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * Produto generated by hbm2java
 */
public class Produto  implements java.io.Serializable {


     private int codigo;
     private GrupoProduto grupoProduto;
     private Marca marca;
     private UnidadeMedida unidadeMedida;
     private String descricao;
     private BigDecimal quantidadeEstoque;
     private BigDecimal quantidadeMinimo;
     private BigDecimal precoVenda;
     private BigDecimal precoCompra;
     private char status;

    public Produto() {
    }

    public Produto(int codigo, GrupoProduto grupoProduto, Marca marca, UnidadeMedida unidadeMedida, String descricao, BigDecimal quantidadeEstoque, BigDecimal quantidadeMinimo, BigDecimal precoVenda, BigDecimal precoCompra, char status) {
       this.codigo = codigo;
       this.grupoProduto = grupoProduto;
       this.marca = marca;
       this.unidadeMedida = unidadeMedida;
       this.descricao = descricao;
       this.quantidadeEstoque = quantidadeEstoque;
       this.quantidadeMinimo = quantidadeMinimo;
       this.precoVenda = precoVenda;
       this.precoCompra = precoCompra;
       this.status = status;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public GrupoProduto getGrupoProduto() {
        return this.grupoProduto;
    }
    
    public void setGrupoProduto(GrupoProduto grupoProduto) {
        this.grupoProduto = grupoProduto;
    }
    public Marca getMarca() {
        return this.marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
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
    public BigDecimal getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }
    
    public void setQuantidadeEstoque(BigDecimal quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public BigDecimal getQuantidadeMinimo() {
        return this.quantidadeMinimo;
    }
    
    public void setQuantidadeMinimo(BigDecimal quantidadeMinimo) {
        this.quantidadeMinimo = quantidadeMinimo;
    }
    public BigDecimal getPrecoVenda() {
        return this.precoVenda;
    }
    
    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }
    public BigDecimal getPrecoCompra() {
        return this.precoCompra;
    }
    
    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }
    public char getStatus() {
        return this.status;
    }
    
    public void setStatus(char status) {
        this.status = status;
    }




}


