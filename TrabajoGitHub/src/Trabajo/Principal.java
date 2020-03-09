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

        System.out.println("\n\tMENÚ");
        System.out.println("1. Gestión de empleados");
        System.out.println("2. Gestión de alumnos");
        System.out.println("3. Gestión de libros");
        System.out.println("4. Salir");

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
                    Libro libro = new Libro();
                    break;
                case 4:
                    System.out.println("\n\t\tSalimos del programa.");
                    System.out.println("\t\tNos vemos");
                    terminao = true;
                    break;
            }
        } while (!terminao);
    }
}
