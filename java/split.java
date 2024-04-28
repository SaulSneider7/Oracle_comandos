
package com.mycompany.ejercicios;

import java.util.Scanner;

public class split {
    public static void main(String[] args) {
//        String nombres = "Juan, Maria, Pedro, Karina";
//        String[] listaNombres = nombres.split(",");
//        
//        for(String nombre : listaNombres){
//            System.out.println(nombre.trim());
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una serie de numeros:");
        String numeros = scanner.nextLine();

        // Utilizamos el método split para dividir la cadena en un arreglo de strings
        String[] numerosArray = numeros.split("-");

        // Inicializamos la variable para almacenar la suma
        int suma = 0;

        // Iteramos sobre el arreglo de strings, convertimos cada elemento a entero y sumamos
        for (String numero : numerosArray) {
            // Convertimos el string a entero y lo sumamos
            suma += Integer.parseInt(numero);
        }

        // Imprimimos la suma
        System.out.println("La suma de los números es: " + suma);
    }
}
