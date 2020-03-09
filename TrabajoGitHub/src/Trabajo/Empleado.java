/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Empleado {

    String nombre;
    int edad;
    float sueldo;

    public Empleado() {
        pedirDatosEmpleado();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    void pedirNombre() {
        nombre = pedirDatos.PedirDatosTeclado.pedirString("\n\tInserte el nombre del empleado: ");
    }

    void pedirEdad() throws Exception {
        try {
            edad = pedirNumValidarEmpleado(18, 65, "\n\tIndique la edad de " + nombre + ": ");
        } catch (InputMismatchException e) {
            throw new Exception();
        }
    }

    void pedirSueldo() {
        sueldo = pedirDatos.PedirDatosTeclado.pedirFloatValLetras("\n\tIndique el sueldo de " + nombre + ": ");
    }

    void pedirDatosEmpleado() {
        try {
            do {
                pedirNombre();
                pedirEdad();
                pedirSueldo();
            } while (true);

        } catch (Exception e) {
            System.out.println("\t\tLo siento. Se han insertado letras");
            System.out.println("\t\tDejamos de pedir datos de empleados");
        }
    }

    public static int pedirNumValidarEmpleado(int min, int max, String menVis) {
        int num = 0;
        boolean bien = false;
        Scanner pedir = new Scanner(System.in);

        do {
            System.out.print(menVis);
            num = pedir.nextInt();
            if (num < min || num > max) {
                System.out.println("\t\tDato invalido. Numero fuera del rango");
            } else {
                bien = true;
            }
        } while (bien == false);

        return num;
    }
}
