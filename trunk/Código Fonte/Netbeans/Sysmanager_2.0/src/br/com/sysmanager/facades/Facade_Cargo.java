/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.Cargo_DAO;
import br.com.sysmanager.interfaces.Interface_Cargo;
import br.com.sysmanager.model.Cargo;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Júnior
 */
public class Facade_Cargo {

    private Interface_Cargo cargo_dao = new Cargo_DAO();
    private Cargo cargo = new Cargo();
    private List<Cargo> list;

    public Cargo newInstance(){
        this.cargo = new Cargo();

        return this.cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Interface_Cargo getCargo_dao() {
        return cargo_dao;
    }

    public void setCargo_dao(Interface_Cargo cargo_dao) {
        this.cargo_dao = cargo_dao;
    }

    public List<Cargo> getList_cargo() {
        return list;
    }

    public void setList_cargo(List<Cargo> list_cargo) {
        this.list = list_cargo;
    }


    public void preencher_jtable_cargo(int opcao, Object codigo, String descricao, JTable jtable){
        
        Funcoes.limpaLinhasTable(jtable);

        if(opcao == 1){
            this.setList_cargo(this.getCargo_dao().buscar_por_codigo(codigo));
        }

        else if(opcao == 2){
            this.setList_cargo(this.getCargo_dao().buscar_por_descricao(descricao));
        }

        for(Cargo c : this.getList_cargo()){

            Funcoes.getModel(jtable).addRow(new String[]{
                c.getCodigo().toString(),
                c.getDescricao()
            });

        }
    }

}
