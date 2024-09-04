/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo21;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Mostrar el título del programa
        System.out.println("Politecnico Internacional");
        System.out.println("Programa: Mostrar la tabla de multiplicar de un numero");
        
        // Definir las variables
        int numero, i;
        
        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un numero para ver su tabla de multiplicar: ");
        numero = scanner.nextInt(); // Leer el número ingresado por el usuario
        
        // Iterar desde 1 hasta 10, generando la tabla de multiplicar del número ingresado
        for (i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i)); // Imprimir el resultado de la multiplicación
        }
        
        // Mostrar un mensaje de despedida
        System.out.println("Gracias, Hasta luego.");
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
