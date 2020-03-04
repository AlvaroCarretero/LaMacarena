/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Trabajo;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Libro {
    boolean tituLi=false;
    int numPag;
    String titulo,autor;
    int cantLibros=0;

    public Libro() {
        pedirDatos();
        pedirLibros();
    }
    
    void pedirAutor(){
        autor=pedirDatos.PedirDatosTeclado.pedirString("\tIndique el nombre del autor: ");
    }
    void pedirNumPag(){
        int num = 0;
        boolean bien = false;
        Scanner pedir = new Scanner(System.in);

        do {
            try {
                num = pedir.nextInt();
                if (num < 0) {
                    System.out.println("\t\tLo siento ha insertado un numero negrativo");
                } else {
                    bien = true;
                }
            } catch (InputMismatchException e) {
                pedir.nextLine();
                System.out.println("\t\tLo siento, ha insertado letras.");
            }
        } while (bien == false);
    }
    void pedirTitulo(){
        titulo=pedirDatos.PedirDatosTeclado.pedirString("\tInserte el titulo del libro: ");
    }
    void pedirDatos(){
        pedirAutor();
        pedirNumPag();
    }
    void pedirLibros(){
        while(true){
        pedirTitulo();
        cantLibros++;
        }
    }

}
