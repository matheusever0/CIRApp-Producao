package br.com.fortlev.cir.controller;

import br.com.fortlev.cir.bean.Material;
import br.com.fortlev.cir.dao.MaterialDAO;
import java.util.List;

/**
 *
 * @author matheus.s
 */
public class MaterialController {
    MaterialDAO matedao = new MaterialDAO();
    Material materialselecionado; 
    List<Material> materiais;

    public MaterialController() {
    }

    public Material getMaterialselecionado() {
        return materialselecionado;
    }

    public void setMaterialselecionado(Material materialselecionado) {
        this.materialselecionado = materialselecionado;
    }

    public MaterialDAO getMatedao() {
        return matedao;
    }

    public void setMatedao(MaterialDAO matedao) {
        this.matedao = matedao;
    }

    public List<Material> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }

    public Boolean preparaInclusao(){
        materialselecionado = new Material();
        
        return true;
    }
}
