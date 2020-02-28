/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;

import pedirDatos.PedirDatosTeclado;

public class Alumno {

    String nombre;
    int edad;
    float notas;

    public Alumno() {

    }

    public void pedirNombre() throws Exception {
        nombre = PedirDatosTeclado.pedirString("\n\tIndique el nombre del alumno: ");
        if (nombre.equalsIgnoreCase("fin")) {
            throw new Exception();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void pedirEdad() {
        edad = PedirDatosTeclado.pedirInt("\n\tIndique la edad de " + nombre + ": ");
    }

    public void pedirNotas() {
        notas = ValidarNumeros.pedirNumValidarNotaAlumno(0, 10);
    }

    public float getNotas() {
        return notas;
    }
    
    void visDatosAlumno() {
        System.out.println("\tDatos del alumno con la peor media:");
        System.out.println("\t\tNOMBRE: "+nombre);
        System.out.println("\t\tEDAD: "+edad);
        System.out.println("\t\tMEDIA: "+notas);
    }
}
