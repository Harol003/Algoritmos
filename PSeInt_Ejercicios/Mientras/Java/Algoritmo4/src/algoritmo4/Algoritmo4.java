/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo4;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un escaner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Inicializar la suma de calificaciones
        int suma_calificaciones = 0;
        // Inicializar el contador de calificaciones
        int contador_calificaciones = 0;
        // Inicializar la variable calificacion con un valor inicial
        int calificacion = 0;
        // Indicar al usuario para que sirve el programa
        System.out.println("Politecnico Internacional - Diseno de Algoritmos");
        System.out.println("Objetivo: Este programa calculara el promedio de las calificaciones que ingreses, hasta que ingreses una negativa.");
        // Mientras la calificacion sea positiva o cero, continuar pidiendo calificaciones
        while (calificacion >= 0) {
            System.out.print("Ingresa una calificacion (negativa para terminar): ");
            // Leer la calificacion ingresada por el usuario
            calificacion = scanner.nextInt();
            // Si la calificacion es valida, sumarla e incrementar el contador
            if (calificacion >= 0) {
                suma_calificaciones += calificacion;
                contador_calificaciones++;
            }
        }
        // Si se ingresaron calificaciones validas, calcular y mostrar el promedio
        if (contador_calificaciones > 0) {
            double promedio = (double) suma_calificaciones / contador_calificaciones;
            System.out.println("El promedio es: " + promedio);
        } else {
            // Si no se ingresaron calificaciones validas, indicar al usuario
            System.out.println("No se ingresaron calificaciones validas.");
        }
    }
}
