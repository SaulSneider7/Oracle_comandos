
package com.mycompany.ejercicios;

import java.util.Scanner;

public class OperacionBasicas {
    public static void main(String[] args) {
        int x = 14;
        int y = 5;
        int add = x + y;
        int prod = x * y;
        int div = x / y;
        double div_double = (double) x / y;
        int res = x % y;
        
        System.out.println("x = " + x + " / y = " + y);
        System.out.println("Suma: " + add);
        System.out.println("Produto: " + prod);
        System.out.println("Division Entera: " + div);
        System.out.println("Division Decimal: " + div_double);
        System.out.println("Residuo: " + res);
        
         //SCANNER
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe X");
        x = sc.nextInt();
        System.out.println("Escribe Y");
        y = sc.nextInt();
        
        add = x + y;
        prod = x * y;
        div = x / y;  
        div_double = (double) x / y;
        res = x % y; 
        System.out.println("x = " + x + " / y = " + y);
        System.out.println("Suma: " + add);
        System.out.println("Producto: " + prod);
        System.out.println("Division Entera: " + div);
        System.out.println("Division Decimal: " + div_double);
        System.out.println("Residuo: " + res);
    }
}
