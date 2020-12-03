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
public class LivroList {
    
    private ArrayList<Livro> list;
    private boolean temp;
    
    public LivroList(){
        
    }
      public LivroList(ArrayList<Livro> l){
    this.list = l;
    }
      public void addLivro(Livro livro){
        livro.setId(this.list.size());
        this.list.add(livro);
        }
      public void carregarLivros() throws FileNotFoundException{
        String temp;
        Livro a1;
        String[] temp2;
        try{
            File arquivo = new File("arquivos/livros.txt");
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
              temp = leitor.nextLine();
              temp2 = temp.split("%##%", 6);
              a1 = new Livro(temp2[0], temp2[1], Boolean.parseBoolean(temp2[2]),
                      temp2[3], Boolean.parseBoolean(temp2[4]), temp2[5]);
              //System.out.println(a1);
              this.addLivro(a1);
            }
            leitor.close();
      
        }
         catch (FileNotFoundException e) {
            System.out.println("Erro!");
            e.printStackTrace();
      }
      }
        public void salvarLivros(){
           String temp = "";
          for(int i = 0; i < this.list.size(); i++){
              temp += this.list.get(i).getTitulo()+"%##%"+
                    this.list.get(i).getAutor()+"%##%"+
                    this.list.get(i).getAnoPublicado()+"%##%"+
                    this.list.get(i).getEditora()+"%##%"+
                    this.list.get(i).getCategoria()+"%##% \n"; 
              
                    
          }
            try {
            FileWriter conteudo = new FileWriter("Arquivos/Livros.txt");
            conteudo.write(temp);
            conteudo.close();
            System.out.println("Lista foi salva!");
            this.list.clear();
        } 
        catch (IOException e) {
            System.out.println("Erro.");
            e.printStackTrace();
        }
                    
        }
        
         public boolean reservar(Livro livro, String titulo){
        boolean temp = false;
        for(int i = 0; i < this.list.size(); i++){    
            if (this.list.get(i).igual(livro)){
                this.list.get(i).setTitulo(true);
              
                temp = true;
                
            }
        
         }
        return temp;
         }
      
        public boolean alugar(Livro livro, String titulo, String autor){    
        boolean temp = false;
        for(int i = 0; i < this.list.size(); i++){    
            if (this.list.get(i).igual(livro)){
                this.list.get(i).setAlugado(true);
                this.list.get(i).setTitulo(titulo);
                this.list.get(i).setAutor(autor);
                temp = true;
        }
        }
        return temp;
        }
         public boolean retornarLivro(Livro livro){
        if (this.list.contains(livro)){
            if (livro.isAlugado() || livro.isReservado()){
                //int temp = this.lista.indexOf(livro);
                livro.setAlugado(false);
                livro.setReservado(false);
                livro.setNomeUsuario("---");
                //this.lista.set(temp, livro);
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
          public void aux(Livro t1, String t2, ArrayList<Livro> t3){
        if (t1.getTitulo().equals(t2)){
        t3.add(t1);
        }
    }
           public ArrayList<Livro> buscaLivro(String titulo){
        ArrayList<Livro> temp = new ArrayList<>();
        this.list.forEach((n) -> aux(n, titulo, temp));
        return temp;
           }
     
       public ArrayList<Livro> getList() {
        return list;
    }

    public void setLivroList(ArrayList<Livro> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "LivroList{\n" + "LivroList=\n" + list + '}';
    } 

}

        