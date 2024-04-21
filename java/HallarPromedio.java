
package com.mycompany.ejercicios;

import java.util.Scanner;

public class HallarPromedio {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== HALLAR EL PROMEDIO =====");
        System.out.print("Ingrese la cantidad de datos: ");
        int n = scanner.nextInt();
        double sumaTotal = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingres el dato " + (i + 1) + " : ");
            double dato = scanner.nextDouble();
            sumaTotal += dato;
        }
        double promedio = sumaTotal / n;
        System.out.println("=> El promedio es: " + promedio);
    }
}
