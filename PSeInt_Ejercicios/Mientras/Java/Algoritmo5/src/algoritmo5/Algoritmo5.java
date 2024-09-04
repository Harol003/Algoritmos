/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo5;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un escaner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Inicializar la suma de numeros pares
        int suma_pares = 0;
        // Inicializar el producto de numeros impares
        int producto_impares = 1;
        // Inicializar la variable numero con un valor distinto de 0
        int numero = 1;
        // Indicar al usuario para que sirve el programa
        System.out.println("Politecnico Internacional - Diseno de Algoritmos");
        System.out.println("Objetivo: Este programa sumara los numeros pares y multiplicara los numeros impares que ingreses, hasta que ingreses un 0.");
        
        // Mientras el numero no sea 0, continuar pidiendo numeros
        while (numero != 0) {
            System.out.print("Ingresa un numero (0 para salir): ");
            // Leer el numero ingresado por el usuario
            numero = scanner.nextInt();
            // Si el numero no es 0, verificar si es par o impar
            if (numero != 0) {
                if (numero % 2 == 0) {
                    // Si es par, sumarlo a la suma de pares
                    suma_pares += numero;
                } else {
                    // Si es impar, multiplicarlo al producto de impares
                    producto_impares *= numero;
                }
            }
        }
        // Mostrar la suma de pares y el producto de impares al usuario
        System.out.println("La suma de los numeros pares es: " + suma_pares);
        System.out.println("El producto de los numeros impares es: " + producto_impares);
    }
    }
    

