
package com.mycompany.ejercicios;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el N\u00B0 = ");

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n - i - 1 <= j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n - i - 1 <= j) System.out.print("*");
                else System.out.print(" ");
            }
            for (int j = 1; j < n; j++) {
                if (i >= j) System.out.print("*");
                else System.out.print(" ");
            }
            
            System.out.println("");
        }

    }
}
