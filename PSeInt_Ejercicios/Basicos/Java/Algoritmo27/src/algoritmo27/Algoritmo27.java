/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo27;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Declaración de variables
        double num1, num2, resultado;
        int opcion;
        
        // Entrada de datos
        System.out.print("Ingrese el primer numero: ");
        num1 = scanner.nextDouble(); // Lee el primer número ingresado por el usuario
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = scanner.nextDouble(); // Lee el segundo número ingresado por el usuario
        
        // Mostrar opciones al usuario
        System.out.println("Seleccione la operacion que desea realizar:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Resto");
        System.out.println("6. Potencia");
        System.out.print("Ingrese su opcion: ");
        opcion = scanner.nextInt(); // Lee la opción seleccionada por el usuario
        
        // Estructura de control para decidir qué operación realizar
        switch (opcion) {
            case 1:
                // Operación de suma
                resultado = num1 + num2; // Calcula la suma de los dos números
                System.out.println("La suma es: " + resultado); // Muestra el resultado de la suma
                break;
                
            case 2:
                // Operación de resta
                resultado = num1 - num2; // Calcula la resta de los dos números
                System.out.println("La resta es: " + resultado); // Muestra el resultado de la resta
                break;
                
            case 3:
                // Operación de multiplicación
                resultado = num1 * num2; // Calcula la multiplicación de los dos números
                System.out.println("La multiplicacion es: " + resultado); // Muestra el resultado de la multiplicación
                break;
                
            case 4:
                // Operación de división
                if (num2 != 0) { // Verifica que el divisor no sea cero para evitar división por cero
                    resultado = num1 / num2; // Calcula la división de los dos números
                    System.out.println("La division es: " + resultado); // Muestra el resultado de la división
                } else {
                    System.out.println("Error: Division por cero no permitida."); // Mensaje de error si el divisor es cero
                }
                break;
                
            case 5:
                // Operación de resto
                if (num2 != 0) { // Verifica que el divisor no sea cero para evitar división por cero
                    resultado = num1 % num2; // Calcula el resto de la división de los dos números
                    System.out.println("El resto de la division es: " + resultado); // Muestra el resultado del resto
                } else {
                    System.out.println("Error: Division por cero no permitida."); // Mensaje de error si el divisor es cero
                }
                break;
                
            case 6:
                // Operación de potencia
                resultado = 1; // Inicializa el resultado para el cálculo de la potencia
                for (int i = 1; i <= num2; i++) { // Calcula la potencia de num1 elevado a num2
                    resultado *= num1;
                }
                System.out.println("La potencia es: " + resultado); // Muestra el resultado de la potencia
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
