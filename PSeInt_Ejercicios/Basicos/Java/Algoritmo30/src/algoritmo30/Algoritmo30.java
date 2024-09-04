/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo30;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Declaración de variables
        double num1, num2; // Variables para almacenar los números ingresados
        int opcion; // Variable para almacenar la opción seleccionada
        
        // Entrada de datos
        System.out.print("Ingrese el primer numero: ");
        num1 = scanner.nextDouble(); // Lee el primer número ingresado por el usuario
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = scanner.nextDouble(); // Lee el segundo número ingresado por el usuario
        
        // Mostrar opciones al usuario
        System.out.println("1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5. Resto 6. Potencia");
        opcion = scanner.nextInt(); // Lee la opción seleccionada por el usuario
        
        // Estructura de control para decidir qué operación realizar
        switch (opcion) {
            case 1:
                // Operación de suma
                System.out.println("Resultado: " + (num1 + num2)); // Muestra el resultado de la suma
                break;
            case 2:
                // Operación de resta
                System.out.println("Resultado: " + (num1 - num2)); // Muestra el resultado de la resta
                break;
            case 3:
                // Operación de multiplicación
                System.out.println("Resultado: " + (num1 * num2)); // Muestra el resultado de la multiplicación
                break;
            case 4:
                // Operación de división
                if (num2 != 0) { // Verifica que el divisor no sea cero para evitar división por cero
                    System.out.println("Resultado: " + (num1 / num2)); // Muestra el resultado de la división
                } else {
                    System.out.println("Error: Division por cero."); // Mensaje de error si el divisor es cero
                }
                break;
            case 5:
                // Operación de resto
                if (num2 != 0) { // Verifica que el divisor no sea cero para evitar división por cero
                    System.out.println("Resultado: " + (num1 % num2)); // Muestra el resultado del resto
                } else {
                    System.out.println("Error: Division por cero."); // Mensaje de error si el divisor es cero
                }
                break;
            case 6:
                // Operación de potencia
                double resultado = 1; // Inicializa el resultado para el cálculo de la potencia
                for (int i = 1; i <= num2; i++) { // Calcula la potencia de num1 elevado a num2
                    resultado *= num1;
                }
                System.out.println("Resultado: " + resultado); // Muestra el resultado de la potencia
                break;
            default:
                // Opción no válida
                System.out.println("Opcion no valida."); // Muestra un mensaje de error si la opción no es válida
                break;
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
