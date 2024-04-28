
package com.mycompany.ejercicios;

import java.util.Scanner;

public class SIGLAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un string:");
        String linea = sc.nextLine();
        
        String[] splitWords = linea.split(" ");
        int n = splitWords.length;
        String sigla = "";
        
        for(int i = 0; i < n; i++){
            sigla += splitWords[i].charAt(0);
        }
        sigla = sigla.toUpperCase();
        System.out.println("SIGLA formada: " + sigla);
        
        
    }
}
