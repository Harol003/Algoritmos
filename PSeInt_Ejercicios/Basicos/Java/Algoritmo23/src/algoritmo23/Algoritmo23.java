/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo23;

/**
 *
 * @author Harol
 */


import java.util.*;

public class Algoritmo23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Definir las variables
        int num, i;
        
        // Solicitar al usuario que ingrese un número para la tabla de multiplicar
        System.out.print("Ingrese el numero para la tabla de multiplicar: ");
        num = scanner.nextInt(); // Leer el número ingresado por el usuario
        
        // Iterar desde 1 hasta 10, generando la tabla de multiplicar del número ingresado
        for (i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i)); // Imprimir el resultado de la multiplicación
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
