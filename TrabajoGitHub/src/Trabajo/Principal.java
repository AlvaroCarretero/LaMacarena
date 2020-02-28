/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;

public class Principal {

    public static void main(String[] args) throws Exception {
        int cont = 0,mediaMasBaja;
        Alumno al = new Alumno();
        try {
            do {
                cont++;
                al.pedirNombre();
                al.pedirEdad();
                al.pedirNotas();
            } while (true);
        } catch (Exception e) {
            System.out.println("\nSe ha introducido fin. Salimos del programa");
        }
        al.visDatosAlumno();

    }
}
