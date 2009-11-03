/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;

import br.com.sysmanager.dao.Marca_DAO;
import br.com.sysmanager.interfaces.Interface_Marca;
import br.com.sysmanager.model.GrupoProduto;
import br.com.sysmanager.model.Marca;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author Júnior
 */
public class Facade_Marca {

    private Interface_Marca marca_dao = new Marca_DAO();
    private Marca marca = new Marca();
    private List<Marca> list_marca;

    public Marca newInstance(){
        this.marca = new Marca();

        return this.marca;
    }

    public List<Marca> getList_marca() {
        return list_marca;
    }

    public void setList_marca(List<Marca> list_marca) {
        this.list_marca = list_marca;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Interface_Marca getMarca_dao() {
        return marca_dao;
    }

    public void setMarca_dao(Interface_Marca marca_dao) {
        this.marca_dao = marca_dao;
    }


    public void preencher_jtable_marca(int opcao, Object codigo, String descricao, JTable jtable){
        
        Funcoes.limpaLinhasTable(jtable);

        if(opcao == 1){
            this.setList_marca(this.getMarca_dao().buscar_por_codigo(codigo));
        }

        else if(opcao == 2){
            this.setList_marca(this.getMarca_dao().buscar_por_descricao(descricao));
        }

        for(Marca m : this.getList_marca()){

            Funcoes.getModel(jtable).addRow(new String[]{
                m.getCodigo().toString(),
                m.getDescricao()
            });

        }
    }

    public void preencherComboMarca(JComboBox combo){

        Funcoes.limpaComboBox(combo);

        this.setList_marca(this.getMarca_dao().buscar_todos());

        for(Marca m : this.getList_marca()){
            combo.addItem(m);
        }

    }
}
