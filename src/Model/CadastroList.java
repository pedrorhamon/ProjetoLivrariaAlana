/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Pedro Rhamon
 */
public class CadastroList {

    private static void add(Usuario U) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ArrayList<Usuario> list;

    public CadastroList() {
        list = new ArrayList();

    }

    public CadastroList(ArrayList<Usuario> list) {
        this.list = list;
    }

    public ArrayList<Usuario> getList() {
        return list;
    }

    public void setList(ArrayList<Usuario> list) {
        this.list = list;
    }
    
    public void addCadastroList(Usuario U){
        U.setCadastroList(this);
        CadastroList.add(U);
        
    }
    
  
    
    
    

}
