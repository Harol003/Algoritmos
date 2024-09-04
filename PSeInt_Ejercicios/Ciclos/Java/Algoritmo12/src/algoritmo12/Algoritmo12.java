/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo12;

/**
 *
 * @author Harol
 */
public class Algoritmo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Imprimir el encabezado del programa
        System.out.println("Politecnico Internacional");
        System.out.println("Programa: Contar cuantos numeros pares hay entre 1 y 20");

        // Definir e inicializar variables
        int contador = 0;

        // Bucle para recorrer los numeros del 1 al 20
        for (int i = 1; i <= 20; i++) {
            // Verificar si el numero es par
            if (i % 2 == 0) {
                // Incrementar el contador de numeros pares
                contador++;
            }
        }

        // Imprimir el resultado
        System.out.println("Hay " + contador + " numeros pares entre 1 y 20.");
        System.out.println("Gracias, Hasta luego.");
    }
    
}
