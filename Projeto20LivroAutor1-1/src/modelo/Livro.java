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
public class Livro {
    
    private String titulo;
    private String editora;
    private int ano;
    
    private Autor escritor;

    public Livro() {
    }
    public Livro(String titulo, String editora, int ano) {
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
    }
    public Livro(Autor escritor) {
        this.escritor = escritor;
    }    
    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public Autor getEscritor() {
        return escritor;
    }
    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

}
