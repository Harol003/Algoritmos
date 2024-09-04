/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo15;

/**
 *
 * @author Harol
 */
public class Algoritmo15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Imprimir el encabezado del programa
        System.out.println("Politecnico Internacional");
        System.out.println("Programa: Ciclo Infinito");

        // Inicializar un contador
        int contador = 1;

        // Bucle infinito
        while (true) {
            System.out.println("Este es un ciclo infinito. Iteracion: " + contador);

            // Incrementar el contador
            contador++;

            // Pausa para evitar que el programa se ejecute demasiado rapido
            try {
                Thread.sleep(1000); // Espera de 1 segundo (1000 milisegundos)
            } catch (InterruptedException e) {
                System.out.println("Error en la pausa del ciclo.");
            }
        }
    }
    
}
