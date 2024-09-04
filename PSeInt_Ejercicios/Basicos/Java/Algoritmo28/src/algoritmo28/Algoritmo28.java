/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo28;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Declaración de variables
        double num1, num2, num3, num4, producto; // Variables para almacenar los números y el producto
        
        // Entrada de datos
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble(); // Lee el primer número ingresado por el usuario
        
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble(); // Lee el segundo número ingresado por el usuario
        
        System.out.print("Ingrese el tercer número: ");
        num3 = scanner.nextDouble(); // Lee el tercer número ingresado por el usuario
        
        System.out.print("Ingrese el cuarto número: ");
        num4 = scanner.nextDouble(); // Lee el cuarto número ingresado por el usuario
        
        // Cálculo del producto de los cuatro números
        producto = num1 * num2 * num3 * num4; // Calcula el producto de los cuatro números
        
        // Mostrar el resultado
        System.out.println("El producto de los cuatro números es: " + producto); // Muestra el resultado del producto
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
