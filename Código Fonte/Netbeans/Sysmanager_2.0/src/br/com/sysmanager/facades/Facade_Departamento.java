/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.Departamento_DAO;
import br.com.sysmanager.interfaces.Interface_Departamento;
import br.com.sysmanager.model.Departamento;
import br.com.sysmanager.model.Marca;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Júnior
 */
public class Facade_Departamento {

    private Interface_Departamento departamento_dao = new Departamento_DAO();
    private Departamento departamento = new Departamento();
    private List<Departamento> list_departamento;

    public Departamento newInstance(){
        this.departamento = new Departamento();

        return this.departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Interface_Departamento getDepartamento_dao() {
        return departamento_dao;
    }

    public void setDepartamento_dao(Interface_Departamento departamento_dao) {
        this.departamento_dao = departamento_dao;
    }

    public List<Departamento> getList_departamento() {
        return list_departamento;
    }

    public void setList_departamento(List<Departamento> list_departamento) {
        this.list_departamento = list_departamento;
    }

    public void preencher_jtable_departamento(int opcao, Object codigo, String descricao, JTable jtable){
        
        Funcoes.limpaLinhasTable(jtable);

        if(opcao == 1){
            this.setList_departamento(this.getDepartamento_dao().buscar_por_codigo(codigo));
        }

        else if(opcao == 2){
            this.setList_departamento(this.getDepartamento_dao().buscar_por_descricao(descricao));
        }

        for(Departamento d : this.getList_departamento()){

            Funcoes.getModel(jtable).addRow(new String[]{
                d.getCodigo().toString(),
                d.getDescricao()
            });

        }
    }

}
