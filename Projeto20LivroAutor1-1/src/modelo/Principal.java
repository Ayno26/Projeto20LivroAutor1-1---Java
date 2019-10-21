/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Livro livro1 = new Livro("Chamas da Paixão", "Editora 1000", 2006);
        Autor autor1 = new Autor("Senhor Sr", 1987, "srsr@gmail.com");
        
        autor1.setObra(livro1);
        livro1.setEscritor(autor1);
        
        System.out.println("Obra: "+autor1.getObra().getTitulo());
        System.out.println("Autor: "+livro1.getEscritor().getNome());
    }
}
