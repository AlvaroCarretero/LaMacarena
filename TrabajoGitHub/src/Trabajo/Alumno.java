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
    int notas;
    
    public Alumno() throws Exception {
        pedirNombre();
        pedirEdad();
        pedirNotas();
    }

    void pedirNombre() throws Exception {
        nombre = PedirDatosTeclado.pedirString("\n\tIndique el nombre del alumno: ");
        if (nombre.equalsIgnoreCase("fin")) {
            throw new Exception();
        }
    }

    public String getNombre() {
        return nombre;
    }

    void pedirEdad() {
        edad = PedirDatosTeclado.pedirInt("\n\tIndique la edad del alumno: ");
    }

    void pedirNotas() {
        notas = ValidarNumeros.pedirNumValidarNotaAlumno(0, 10);
    }
}
