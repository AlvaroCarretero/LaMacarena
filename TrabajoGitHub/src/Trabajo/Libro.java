/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Libro {

    boolean tituLi = false;
    int numPag;
    String titulo, autor;
    int cantLibros = 0;

    public Libro() {
        pedirLibros();
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    void pedirAutor() {
        autor = pedirDatos.PedirDatosTeclado.pedirString("\tIndique el nombre del autor: ");
    }

    void pedirNumPag() {
        numPag = pedirDatos.PedirDatosTeclado.pedirIntValidInsLetras("\tIndique el número de páginas: ");
    }

    void pedirTitulo() {
        titulo = pedirDatos.PedirDatosTeclado.pedirString("\tInserte el titulo del libro: ");
    }

    void pedirLibros() {
        pedirAutor();
        pedirTitulo();
        pedirNumPag();
    }
}
