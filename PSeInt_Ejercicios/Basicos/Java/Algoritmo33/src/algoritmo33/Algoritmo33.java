/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo33;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Definición de variables
        int num1, num2, suma; // Variables para almacenar los números ingresados y su suma
        
        // Entrada de datos
        System.out.print("Ingrese el primer numero: ");
        num1 = scanner.nextInt(); // Lee el primer número ingresado por el usuario
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = scanner.nextInt(); // Lee el segundo número ingresado por el usuario
        
        // Calcular la suma
        suma = num1 + num2;
        
        // Mostrar el resultado
        System.out.println("La suma de los dos numeros es: " + suma);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
