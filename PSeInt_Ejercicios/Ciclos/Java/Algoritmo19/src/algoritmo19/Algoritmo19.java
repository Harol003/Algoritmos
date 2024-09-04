/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo19;

/**
 *
 * @author Harol
 */
public class Algoritmo19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mostrar el título del programa
        System.out.println("Politecnico Internacional");
        System.out.println("Programa: Sumar los primeros 10 numeros naturales");
        
        // Definir las variables
        int suma, i;
        suma = 0; // Inicializar la variable suma en 0
        
        // Iterar desde 1 hasta 10, sumando cada valor de i a suma
        for (i = 1; i <= 10; i++) {
            suma += i; // Acumulando el valor de i en suma
        }
        
        // Mostrar el resultado de la suma
        System.out.println("La suma de los primeros 10 numeros naturales es: " + suma);
        
        // Mostrar un mensaje de despedida
        System.out.println("Gracias, Hasta luego.");
    }
    
}
