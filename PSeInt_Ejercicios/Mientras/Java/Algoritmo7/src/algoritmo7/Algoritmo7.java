/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo7;

/**
 *
 * @author Harol
 */

import java.util.Scanner;

public class Algoritmo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un escaner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Inicializar la variable mayor con un valor muy pequeno
        int mayor = Integer.MIN_VALUE;
        // Inicializar la variable numero con un valor distinto de 0
        int numero = 1;
        // Indicar al usuario para que sirve el programa
        System.out.println("Politecnico Internacional - Diseno de Algoritmos");
        System.out.println("Objetivo: Este programa te permitira encontrar el mayor numero que ingreses hasta que ingreses un 0.");
        // Mientras el numero no sea 0, continuar pidiendo numeros
        while (numero != 0) {
            System.out.print("Ingresa un numero (0 para salir): ");
            // Leer el numero ingresado por el usuario
            numero = scanner.nextInt();
            // Si el numero es mayor que el actual mayor, actualizar el mayor
            if (numero > mayor) {
                mayor = numero;
            }
        }
        // Mostrar el mayor numero ingresado al usuario
        if (mayor != Integer.MIN_VALUE) {
            System.out.println("El mayor numero ingresado fue: " + mayor);
        } else {
            System.out.println("No se ingresaron numeros validos.");
        }
        
    }
    
}
