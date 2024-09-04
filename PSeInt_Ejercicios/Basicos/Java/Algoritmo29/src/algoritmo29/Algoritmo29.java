/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo29;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Declaración de variables
        double num1, num2, num3, mayor; // Variables para almacenar los números y el mayor
        
        // Entrada de datos
        System.out.print("Ingrese el primer numero: ");
        num1 = scanner.nextDouble(); // Lee el primer número ingresado por el usuario
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = scanner.nextDouble(); // Lee el segundo número ingresado por el usuario
        
        System.out.print("Ingrese el tercer numero: ");
        num3 = scanner.nextDouble(); // Lee el tercer número ingresado por el usuario
        
        // Inicializa el mayor con el primer número
        mayor = num1;
        
        // Compara con el segundo número
        if (num2 > mayor) {
            mayor = num2; // Actualiza el mayor si el segundo número es mayor
        }
        
        // Compara con el tercer número
        if (num3 > mayor) {
            mayor = num3; // Actualiza el mayor si el tercer número es mayor
        }
        
        // Mostrar el resultado
        System.out.println("El numero mayor de los tres es: " + mayor); // Muestra el número mayor
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
