/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo16;
import java.util.Scanner;

/**
 *
 * @author Harol
 */
public class Algoritmo16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Imprimir el encabezado del programa
        System.out.println("Politecnico Internacional");
        System.out.println("Programa: Calcular la media de 5 numeros ingresados por el usuario");

        // Declarar e inicializar variables
        double suma = 0;
        double numero;
        double media;

        // Bucle para pedir 5 numeros al usuario
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresa un numero: ");
            numero = scanner.nextDouble(); // Leer el numero ingresado por el usuario
            suma += numero; // Sumar el numero a la suma total
        }

        // Calcular la media
        media = suma / 5;

        // Imprimir la media calculada
        System.out.println("La media es: " + media);

        // Mensaje de despedida
        System.out.println("Gracias, Hasta luego.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
