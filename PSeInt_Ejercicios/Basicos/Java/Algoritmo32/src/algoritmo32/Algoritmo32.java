/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo32;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Definición de variables
        int num; // Variable para almacenar el número ingresado
        
        // Entrada de datos
        System.out.print("Ingrese un numero: ");
        num = scanner.nextInt(); // Lee el número ingresado por el usuario
        
        // Verificar si el número es par o impar
        if (num % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
