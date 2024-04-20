package com.mycompany.ejercicios;


public class TiposEnteros {
    public static void main(String[] args) {
        //Tipo de dato byte 8 bits
        byte miByte = -127; //rango: -128 a 127 
        System.out.println("Valor byte: " + miByte + "bits");
        System.out.println("Cantidad de bits de byte: " + Byte.SIZE);
        
        //Tipo de datos short 16 bits
        short miShort = 32767; // rago: -32768 a 32767
        System.out.println("Valor short: " + miShort + "bits");
        System.out.println("Cantidad de bits de short: " + Short.SIZE);
        
        //Tipo de dato int 32 bits
        int miInt = 2147483647; // rango: -2147483648 a 2147483647
        System.out.println("Valor Int: " + miInt);
        System.out.println("Cantidad de bts de int: " + Integer.SIZE);
        
        //Tipo de dato Long 64 bits
        long miLong = 9223372036854775807L; // rango: -9223372036854775808 a 9223372036854775807
        System.out.println("Valor long: " + miLong);
        System.out.println("Cantidad de bts de long: " + Long.SIZE);
    }
}
