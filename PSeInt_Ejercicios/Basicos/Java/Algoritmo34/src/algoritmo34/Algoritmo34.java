/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo34;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Definición de variables
        int num, i; // Variable para el número de la tabla y el contador
        
        // Entrada de datos
        System.out.print("Ingrese el numero para la tabla de multiplicar: ");
        num = scanner.nextInt(); // Lee el número ingresado por el usuario
        
        // Calcular y mostrar la tabla de multiplicar
        for (i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
