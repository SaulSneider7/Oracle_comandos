
package com.mycompany.ejercicios;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== TABLA DE MULTIPLICAR ====");
        System.out.println("Ingrese N = ");
        int n = scanner.nextInt();
        for(int i = 0; i <= 12; i++){
            System.out.println(i + " x " + n + " = " + ( i * n));
        }
    }
}
