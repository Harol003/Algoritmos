/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo18;

/**
 *
 * @author Harol
 */
public class Algoritmo18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Mostrar el título del programa
        System.out.println("Politecnico Internacional");
        System.out.println("Programa para: Sumar los primeros 5 numeros");
        
        // Definir las variables
        int i, suma;
        suma = 0; // Inicializar la variable suma en 0
        
        // Iterar desde 1 hasta 5, sumando cada valor de i a suma
        for (i = 1; i <= 5; i++) {
            suma += i; // Acumulando el valor de i en suma
        }
        
        // Mostrar el resultado de la suma
        System.out.println("La suma es: " + suma);
        
        // Mostrar un mensaje de despedida
        System.out.println("Gracias, Hasta luego.");
    }
    
}
