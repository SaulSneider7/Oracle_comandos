/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios;

/**
 *
 * @author sauls
 */
public class Ejercicios {

    public static void main(String[] args) {
        //Definiendo variables
        int entero = 104;
        double decimal = 3.99;
        char caracter = 'z';
        boolean booleano = true;
        
        //Impresion de Datos
        System.out.println("TIPOS DE DATOS BASICOS");
        System.out.println("Entero: " + entero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Caracter: " + caracter);
        System.out.println("Booleano: " + booleano);
        
        //Conversiones de Datos
        double EnteroDouble = (double)entero;
        int DoubleEntero = (int)decimal;
        int ChatInt = (int)caracter;
        char IntChar = (char) entero;
        
        //IMPRESION DE DATOS CONVERTIDOS
        System.out.println("\nCONVERSIONES ENTRE TIPOS DE DATOS");
        System.out.println("Entero a Double: " + EnteroDouble);
        System.out.println("Double a Entero: " + DoubleEntero);
        System.out.println("Char a Int: " + ChatInt);
        System.out.println("Int a Char: " + IntChar);
        
        
    }
}
