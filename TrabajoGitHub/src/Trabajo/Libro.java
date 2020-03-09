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
        visLibros();
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

    void pedirNumPag() throws Exception {
        try {
            numPag = pedirDatos.PedirDatosTeclado.pedirInt("\tIndique el número de páginas: ");
        } catch (InputMismatchException e) {
            throw new Exception();
        }
    }

    void pedirTitulo() {
        titulo = pedirDatos.PedirDatosTeclado.pedirString("\tInserte el titulo del libro: ");
    }

    void pedirLibros() {
        try {
            do {
                pedirAutor();
                pedirTitulo();
                pedirNumPag();
            } while (numPag > 0);
            System.out.println("\t\tLo siento. El número que ha insertado es negativo");
            System.out.println("\t\tDejamos de pedir datos de los libros");
        } catch (Exception e) {
            System.out.println("\t\tLo siento. Se han insertado letras");
            System.out.println("\t\tDejamos de pedir datos de libros");
        }
    }
    void visLibros(){
        System.out.println("\n\tAUTOR: "+autor);
        System.out.println("\n\tNUMERO DE PÁGINAS: "+numPag);
        System.out.println("\n\tTITULO: "+titulo);
    }
}