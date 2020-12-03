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
public class EventoList {
    
    private ArrayList<Eventos> list;

    public EventoList(ArrayList<Eventos> temp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
public boolean eventoExistente(String nomeEvento){
    boolean temp = false;
    for (int i=0; i< this.list.size(); i++){
        if (this.list.get(i).getNome().equals(nomeEvento)){
            temp=true;
        }
    }
    return temp;
}
public void carregarEventos(){
    String temp;
    Scanner leitor;
    Eventos eventos;
    String[] temp2;
    
     try{
            File arquivo = new File("arquivos/eventos.txt");
            leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                temp = leitor.nextLine();
                temp2 = temp.split("%##%", 4);
                System.out.print(temp2[0]);
                eventos = new Eventos(temp2[0], temp2[1], temp2[2], temp2[3]);
                this.list.add(eventos);
            }
            leitor.close();
        }
      
        catch (FileNotFoundException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
    }

public void salvarEvento(){
    
    String temp = "";
        FileWriter conteudo;
        for(int i = 0; i < this.list.size(); i++){
            temp += this.list.get(i).getNome()+"%##%"+
                    this.list.get(i).getEspaco()+"%##%"+
                    this.list.get(i).getDate()+"%##%"+
                    this.list.get(i).getSolicitacao()+"%##%"+
                    this.list.get(i).getCpf()+"\n";
    
}
          try {
            conteudo = new FileWriter("arquivos/eventos.txt");
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

public boolean cadastro(Eventos eventos){
    boolean bool = true;
        for (int i = 0; i < this.list.size(); i++){
            if (this.list.get(i).getNome().equals(eventos.getNome())){
                bool = false;
            }
        }
        if (bool){
            this.list.add(eventos);
        }
        return bool;
    }
public boolean removendo(String nomeEvento){
    boolean temp = false;
        for (int i = 0; i < this.list.size(); i++){
            if (this.list.get(i).getNome().equals(nomeEvento)){
                this.list.remove(i);
                temp = true;
            }
    
}
return temp;    
}
public ArrayList<Eventos> getLista() {
        return list;
    }

    public void setLista(ArrayList<Eventos> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Lista de eventos= " + list;
    }
    
}




        



    
    

