/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo22;

/**
 *
 * @author Harol
 */

import java.util.*;

public class Algoritmo22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Mostrar el título del programa
        System.out.println("Politecnico Internacional");
        System.out.println("Programa: Contar cuantos numeros son mayores a 10 en una lista de 10 elementos");
        
        // Definir las variables
        int i, numero, contador;
        contador = 0; // Inicializar el contador en 0
        
        // Iterar 10 veces para leer los números
        for (i = 1; i <= 10; i++) {
            // Solicitar al usuario que ingrese un número
            System.out.print("Ingresa un numero: ");
            numero = scanner.nextInt(); // Leer el número ingresado por el usuario
            
            // Verificar si el número es mayor a 10
            if (numero > 10) {
                contador++; // Incrementar el contador si el número es mayor a 10
            }
        }
        
        // Mostrar la cantidad de números mayores a 10
        System.out.println("Cantidad de numeros mayores a 10: " + contador);
        
        // Mostrar un mensaje de despedida
        System.out.println("Gracias, Hasta luego.");
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
