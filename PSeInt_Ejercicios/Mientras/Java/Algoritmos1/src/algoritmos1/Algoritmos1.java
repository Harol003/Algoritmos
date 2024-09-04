/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos1;
/**
 *
 * @author Harol
 */
import java.util.Scanner;
public class Algoritmos1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un escaner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Inicializar la variable para la suma
        int suma = 0;
        // Inicializar la variable numero con un valor distinto de 0
        int numero = 1;
        // Indicar al usuario para que sirve el programa
        System.out.println("Politecnico Internacional - Diseno de Algoritmos");
        System.out.println("Objetivo: Este programa sumara todos los numeros que ingreses hasta que ingreses un 0.");
        // Mientras el numero no sea 0, continuar pidiendo numeros
        while (numero != 0) {
            System.out.print("Ingresa un numero (0 para salir): ");
            // Leer el numero ingresado por el usuario
            numero = scanner.nextInt();
            // Sumar el numero ingresado a la suma total
            suma += numero;
        }
        // Mostrar la suma total al usuario
        System.out.println("La suma total es: " + suma);
    } 
}
