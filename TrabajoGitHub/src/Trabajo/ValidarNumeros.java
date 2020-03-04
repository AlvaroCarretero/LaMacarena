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
