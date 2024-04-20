
package com.mycompany.ejercicios;

import java.util.Scanner;

public class LecturaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa un entero (int): ");
        int myInt = scanner.nextInt();
        System.out.println("Mi Entero: " + myInt);
        
        System.out.println("Ingresa un entero (long): ");
        long myLong = scanner.nextLong();
        System.out.println("MyLong: " + myLong);
        
        System.out.println("Ingresa un boobleano: ");
        boolean myBoolean = scanner.nextBoolean();
        System.out.println("MyBoolean: " + myBoolean);
        
        System.out.println("Ingresa un Decimal");
        double MyDouble = scanner.nextDouble();
        System.out.println("MiDouble: " + MyDouble);
        
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.next();
        System.out.println("Tu nombre es:" + nombre);

        
        scanner.close();
    }
}
