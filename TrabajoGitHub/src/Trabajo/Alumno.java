/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;

import java.util.InputMismatchException;
import java.util.Scanner;
import pedirDatos.PedirDatosTeclado;

public class Alumno {

    String nombre;
    int edad;
    float notas;

    public Alumno() {
        pedirDatosAlumnoHastaFin();
    }

    public void pedirNombre() {
        nombre = PedirDatosTeclado.pedirString("\n\tIndique el nombre del alumno: ");
    }

    public String getNombre() {
        return nombre;
    }

    public void pedirEdad() {
        edad = PedirDatosTeclado.pedirInt("\n\tIndique la edad de " + nombre + ": ");
    }

    public void pedirNotas() {
        notas = pedirNumValidarNotaAlumno(0, 10);
    }

    public float getNotas() {
        return notas;
    }

    void visDatosAlumno() {
        System.out.println("\tDatos del alumno con la peor media:");
        System.out.println("\t\tNOMBRE: " + nombre);
        System.out.println("\t\tEDAD: " + edad);
        System.out.println("\t\tMEDIA: " + notas);
    }

    void pedirDatosAlumnoHastaFin() {
        pedirNombre();
        while (!nombre.equalsIgnoreCase("fin")) {
            pedirEdad();
            pedirNotas();
            pedirNombre();
        }
    }

    public int pedirNumValidarNotaAlumno(int min, int max) {
        int nota = 0, numNotasAlumnos = 5;
        int cont = 0, suma = 0, media;
        Scanner pedir = new Scanner(System.in);

        do {
            try {
                System.out.print("\n\t\tInserta la nota " + (cont + 1) + " de " + nombre + ": ");
                nota = pedir.nextInt();

                if (nota < min || nota > max) {
                    cont = 0;
                    suma = 0;
                    System.out.println("\t\tDato invalido. Numero fuera del rango");
                } else {
                    cont++;
                    suma = suma + nota;
                }
            } catch (InputMismatchException e) {
                pedir.nextLine();
                cont = 0;
                suma = 0;
                System.out.println("\t\tLo sineto, ha insertado letras.");
            }
        } while (cont < numNotasAlumnos);

        media = suma / numNotasAlumnos;

        return media;
    }
    
    void calcularMediaMasBaja() {
        
    }
}
