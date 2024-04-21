
package com.mycompany.ejercicios;

import java.util.Scanner;


public class AllSubstrings {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el string: ");
        String str = sc.next();
        int n = str.length();
        for (int L = 1; L <= n; L++) {
            System.out.println("L = " + L);
            for (int i = 0; i + L <= n; i++) {
                System.out.println(str.substring(i, i + L));
            }
        }        
    }
}
