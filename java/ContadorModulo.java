
package com.mycompany.ejercicios;

import java.util.Scanner;

public class ContadorModulo {
    public static void main(String[] args) {
        
        System.out.println("==== Contador Modulo M ====");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el modulo m = ");
        int m = scanner.nextInt();
        int[] cnt = new int [m];
        System.out.print("Ingrese la cantidad de elementos: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + " : ");
            int x = scanner.nextInt();
            int r = x % m;
            cnt[r]++;
        }
        
        System.out.println("\nRESULTADOS");
        for (int i = 0; i < m; i++) {
            System.out.println("Cantidad de elementos con res = " + i + " es : " + cnt[i]);
        }        
    }
}
