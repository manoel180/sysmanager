/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sysmanager.facades;


import br.com.sysmanager.dao.GrupoProdutoDAO;
import br.com.sysmanager.interfaces.InterfaceGrupoProduto;
import br.com.sysmanager.model.GrupoProduto;
import br.com.sysmanager.services.Funcoes;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;


public class FacadeGrupoProduto {

    private InterfaceGrupoProduto grupoProdutoDAO = new GrupoProdutoDAO();
    private GrupoProduto grupoProduto = new GrupoProduto();
    private List<GrupoProduto> list;

    public GrupoProduto getGrupoProduto() {
        return grupoProduto;
    }

    public void setGrupoProduto(GrupoProduto grupoProduto) {
        this.grupoProduto = grupoProduto;
    }

    public InterfaceGrupoProduto getGrupoProdutoDAO() {
        return grupoProdutoDAO;
    }

    public void setGrupoProdutoDAO(InterfaceGrupoProduto grupoProdutoDAO) {
        this.grupoProdutoDAO = grupoProdutoDAO;
    }

    public List<GrupoProduto> getList() {
        return list;
    }

    public void setList(List<GrupoProduto> list) {
        this.list = list;
    }


    public GrupoProduto newInstance(){
        grupoProduto = new GrupoProduto();

        return grupoProduto;
    }
    //**************************************************************************

    public void preencherComboGrupo(JComboBox combo){

        Funcoes.limpaComboBox(combo);

        DefaultComboBoxModel model = (DefaultComboBoxModel) combo.getModel();

        setList(getGrupoProdutoDAO().buscar_todos());
        for(GrupoProduto g : getList()){
            combo.addItem(g);
    
        }
    }


    public void preecherTableGrupoProduto(int opcao, Object codigo, String descricao, JTable table){
        Funcoes.limpaLinhasTable(table);

        if(opcao == 1){
            setList(getGrupoProdutoDAO().buscar_por_codigo(codigo));
        }

        else if(opcao == 2){
            setList(getGrupoProdutoDAO().buscar_por_descricao(descricao));
        }

        for(GrupoProduto g : getList()){
            Funcoes.getModel(table).addRow(new String[]{
                String.valueOf(g.getCodigo()),
                g.getDescricao()
            });
        }
    }

}
