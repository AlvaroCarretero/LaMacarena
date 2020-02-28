/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidarNumeros {

    public static int pedirNumValidarEmpleado(int min, int max, String menVis) {
        int num = 0;
        boolean bien = false;
        Scanner pedir = new Scanner(System.in);

        do {
            try {
                System.out.print(menVis);
                num = pedir.nextInt();
                if (num < min || num > max) {
                    System.out.println("\t\tDato invalido. Numero fuera del rango");
                } else {
                    bien = true;
                }
            } catch (InputMismatchException e) {
                pedir.nextLine();
                System.out.println("\t\tLo sineto, ha insertado letras.");
            }
        } while (bien == false);

        return num;
    }

    public static int pedirNumValidarNotaAlumno(int min, int max) {
        int nota = 0, notasAlumnos = 5, mediaMasBaja = Integer.MAX_VALUE;
        int cont = 0, suma = 0, media;
        Scanner pedir = new Scanner(System.in);

        do {
            try {
                System.out.print("\n\tInserta la nota " + (cont+1) + " del alumno: ");
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
        } while (cont < notasAlumnos);

        media = suma / notasAlumnos;
        return media;
    }

}
