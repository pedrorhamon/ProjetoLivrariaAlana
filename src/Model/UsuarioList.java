/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pedro Rhamon
 */
public class UsuarioList {
    
    private ArrayList<Usuario> list;
    
    public UsuarioList(){       
    }
   
    public UsuarioList(ArrayList<Usuario> l){
    this.list = l;
    }
    public boolean existente(String usrName){
        boolean temp = false;
        for(int i = 0; i < this.list.size(); i++){
            if (this.list.get(i).getNomeUsuario().equals(usrName)){
                temp = true;
            }
        }
        return temp;
    }
    
    public void carregarUsuarios(){
        String temp;
        Scanner leitor;
        Usuario usr;
        String[] temp2;
        try{
            File arquivo = new File("arquivos/usuarios.txt");
            leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                temp = leitor.nextLine();
                temp2 = temp.split("%##%", 4);
                System.out.print(temp2[0]);
                usr = new Usuario(temp2[0], temp2[1], temp2[2], temp2[3].charAt(0));
                this.list.add(usr);
            }
            leitor.close();
        }
      
        catch (FileNotFoundException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
    }
    public void salvarUsuarios(){
        String temp = "";
        FileWriter conteudo;
        for(int i = 0; i < this.list.size(); i++){
            temp += this.list.get(i).getNome()+"%##%"+
                    this.list.get(i).getNomeUsuario()+"%##%"+
                    this.list.get(i).getSenha()+"%##% \n";
                    
        
        }
        try {
            conteudo = new FileWriter("arquivos/usuarios.txt");
            conteudo.write(temp);
            conteudo.close();
            System.out.println("Lista salva!");
            this.list.clear();
        } 
        catch (IOException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
    }
    public int login(String nomeUsuario, String senha){
        int temp = -1;
        for (int i = 0; i < this.list.size(); i++){
            if (this.list.get(i).getNomeUsuario().equals(nomeUsuario) &&
                    this.list.get(i).getSenha().equals(senha)){
                temp = i;
            }
        }
        
        return temp;
    }
    
    public boolean cadastrar(Usuario usuario){
        boolean bool = true;
        for (int i = 0; i < this.list.size(); i++){
            if (this.list.get(i).getNomeUsuario().equals(usuario.getNomeUsuario())){
                bool = false;
            }
        }
        if (bool){
            this.list.add(usuario);
        }
        return bool;
    }
   
    
    public boolean remover(String nomeUsuario){
        boolean temp = false;
        for (int i = 0; i < this.list.size(); i++){
            if (this.list.get(i).getNomeUsuario().equals(nomeUsuario)){
                this.list.remove(i);
                temp = true;
            }
        }
        return temp;
    }
    
     public ArrayList<Usuario> getList() {
        return list;
    }

    public void setLista(ArrayList<Usuario> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "UsuarioList: " + "list=" + list;
    }
            
}
