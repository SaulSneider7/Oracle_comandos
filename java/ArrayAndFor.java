
package com.mycompany.ejercicios;

import java.util.Scanner;

public class ArrayAndFor {
    public static void main(String[] args) {
        
//        for(int i = 0; i < 5; i++){
//            System.out.println(i);
//        }
//        
//        int[] A = {12, 2, 14, 31, 100};
//        System.out.println("A[0]= " + A[0]);
//        System.out.println("A[1]= " + A[1]);
//        System.out.println("A[2]= " + A[2]);
//        System.out.println("A[3]= " + A[3]);
//        System.out.println("A[4]= " + A[4]);
//        
//        System.out.println("\nIMPRIMIENDO EL ARRAY USANDO EL FOR");
//        int n = A.length;
//        for (int i = 0; i < n; i++){
//            System.out.println("A[" + i + "] = " + A);
//        }
        




        
        
        //EJERCICIO
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud del Array");
        int m = scanner.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++){
            System.out.println("Ingrese el elemento B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }
        System.out.println("Los Elementos Ingresados son: ");
        System.out.println("m = " + m);
        for(int i = 0; i < m; i++){
            System.out.println("B[" + i + "] = " + B[i]);
        }
        
        
        
    }
}
