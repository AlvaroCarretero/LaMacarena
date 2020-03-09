/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;

import pedirDatos.PedirDatosTeclado;

public class Principal {

    public static void main(String[] args) {
        boolean terminao = false;
        int opcion;
        int cont = 0;

        do {
            opcion = PedirDatosTeclado.pedirIntValidInsLetras("\nInserte una opcion: ");
            switch (opcion) {
                case 1:
                    Empleado emp = new Empleado();
                    break;
                case 2:
                    Alumno al = new Alumno();
                    break;
                case 3:
                    Libro libro;
                    do {            
                    libro=new Libro();
                    } while (libro.getNumPag()>=0);
                    break;
                case 4:
                    System.out.println("\n\t\tSalimos del programa.");
                    System.out.println("\t\tMuchas gracias por venir");
                    System.out.println("\t\tDeje su like y suscribase");
                    terminao = true;
                    break;
            }
        } while (!terminao);
    }
}
