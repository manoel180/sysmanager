/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.Fornecedor_DAO;
import br.com.sysmanager.interfaces.Interface_Fornecedor;
import br.com.sysmanager.model.Fornecedor;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Júnior
 */
public class Facade_Fornecedor {

    private Interface_Fornecedor fornecedor_dao = new Fornecedor_DAO();
    private Fornecedor fornecedor = new Fornecedor();
    private List<Fornecedor> list_fornecedor;

    public Fornecedor newInstance(){
        this.fornecedor = new Fornecedor();

        return this.fornecedor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Interface_Fornecedor getFornecedor_dao() {
        return fornecedor_dao;
    }

    public void setFornecedor_dao(Interface_Fornecedor fornecedor_dao) {
        this.fornecedor_dao = fornecedor_dao;
    }

    public List<Fornecedor> getList_fornecedor() {
        return list_fornecedor;
    }

    public void setList_fornecedor(List<Fornecedor> list_fornecedor) {
        this.list_fornecedor = list_fornecedor;
    }
    
    public void preencher_jtable_fornecedor(int opcao, Object codigo, String nome, String email, JTable table){

        Funcoes.limpaLinhasTable(table);

        if(opcao == 1){
            this.setList_fornecedor(this.getFornecedor_dao().buscar_por_codigo(codigo));
        }

        else if(opcao == 2){
            this.setList_fornecedor(this.getFornecedor_dao().buscar_por_nome(nome));
        }

        else if(opcao == 3){
            this.setList_fornecedor(this.getFornecedor_dao().buscar_por_email(email));
        }

        for(Fornecedor f : getList_fornecedor()){

                String tipoFornecedor;

                if(f.getTipoFornecedor() == 'F'){
                    tipoFornecedor = "Físico";

                } else{
                    tipoFornecedor = "Jurídico";
                }

                Funcoes.getModel(table).addRow(new String[]{

                String.valueOf(f.getCodigo()),
                f.getNome(),
                tipoFornecedor,
                f.getEmail()
            });

        }

    }

}
