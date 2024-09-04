/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo17;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declarar variables
        int opcion;
        int suma, i, j;

        // Bucle infinito para mostrar el menu de ejercicios
        while (true) {
            // Mostrar el menu
            System.out.println("Politecnico Internacional");
            System.out.println("Programa Menu de Ejercicios");
            System.out.println("Menu de Ejercicios - Elija una opcion:");
            System.out.println("1. Imprimir los numeros del 1 al 5");
            System.out.println("2. Sumar los numeros del 1 al 5");
            System.out.println("3. Imprimir la tabla de multiplicar del 2");
            System.out.print("Ingrese su opcion: ");
            opcion = scanner.nextInt();  // Leer la opcion ingresada por el usuario

            // Ejecutar la opcion seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Ejercicio 1: Numeros del 1 al 5");
                    for (i = 1; i <= 5; i++) {
                        System.out.println(i);
                    }
                    break;

                case 2:
                    suma = 0;
                    System.out.println("Ejercicio 2: Suma de los numeros del 1 al 5");
                    for (i = 1; i <= 5; i++) {
                        suma += i;
                    }
                    System.out.println("La suma es: " + suma);
                    break;

                case 3:
                    System.out.println("Ejercicio 3: Tabla de multiplicar del 2");
                    for (j = 1; j <= 10; j++) {
                        System.out.println("2 x " + j + " = " + (2 * j));
                    }
                    break;

                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
                    break;
            }
        }
    }
    
}
