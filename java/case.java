
package com.mycompany.ejercicios;

import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        System.out.println("Ingresa un numero del 1 al 7");
//        int dia = sc.nextInt();
//        
//        String nombreDia;
//        
//        switch (dia) {
//            case 1:
//                nombreDia = "Lunes";
//                break;
//            case 2:
//                nombreDia = "Martes";
//                break;
//            case 3:
//                nombreDia = "Miercoles";
//                break;
//            case 4:
//                nombreDia = "Jueves";
//                break;
//            case 5:
//                nombreDia = "Viernes";
//                break;
//            case 6:
//                nombreDia = "Sabado";
//                break;
//            case 7:
//                nombreDia = "Domingo";
//                break;
//            default:
//                nombreDia = "Numero Invalido";
//                break;
//        }
//        System.out.println("El dia que corresponde al numero seleccionado es " + nombreDia);
        
        /////////////////////
        
//        System.out.println("Ingrese el dia de la semana (1-7):");
//        int dia2 = sc.nextInt();
//        
//        
//        String mensaje;
//        switch (dia2) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                mensaje = "Es un dia laboral.";
//                break;
//            case 6:
//            case 7:
//                mensaje = "Es fin de semana.";
//                break;
//            default:
//                mensaje = "Numero de día invalido.";
//        }
//
//        System.out.println(mensaje);

        System.out.println("Ingrese un string:");
        String s = sc.next();
        int[] cnt = new int [5];
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'a':
                    cnt[0]++;
                    break;
                case 'e':
                    cnt[1]++;
                    break;
                case 'i':
                    cnt[2]++;
                    break;
                case 'o':
                    cnt[3]++;
                    break;
                case 'u':
                    cnt[4]++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("a = " + cnt[0]);
        System.out.println("e = " + cnt[1]);
        System.out.println("i = " + cnt[2]);
        System.out.println("o = " + cnt[3]);
        System.out.println("u = " + cnt[4]);  

    }
}
