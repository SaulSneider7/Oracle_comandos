
package com.mycompany.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class JuegoNumAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        int numeroUsuario;

        System.out.println("Bienvenido al juego 'Adivina el numero'!");
        while (intentos < 5) {
            System.out.print("Ingresa un numero entre 1 y 100: ");
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El numero secreto es mayor.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El numero secreto es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número secreto.");
                System.out.println("Numero de intentos: " + intentos);
                return;
            }
        }
        System.out.println("¡Lo siento! Has agotado tus intentos.");
        System.out.println("El número secreto era: " + numeroSecreto);
    
    }
}
