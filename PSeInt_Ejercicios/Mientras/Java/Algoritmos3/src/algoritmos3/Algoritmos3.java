/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos3;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear un escaner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Inicializar el contador de numeros positivos
        int contador_positivos = 0;
        // Inicializar la variable numero con un valor inicial
        int numero = 0;
        // Indicar al usuario para que sirve el programa
        System.out.println("Politecnico Internacional - Diseno de Algoritmos");
        System.out.println("Objetivo: Este programa contara cuantos numeros positivos ingresas hasta que ingreses un numero negativo.");
        
        // Mientras el numero ingresado sea positivo o cero, continuar pidiendo numeros
        while (numero >= 0) {
            System.out.print("Ingresa un numero (negativo para terminar): ");
            // Leer el numero ingresado por el usuario
            numero = scanner.nextInt();
            // Si el numero es positivo, incrementar el contador
            if (numero > 0) {
                contador_positivos++;
            }
        }
        // Mostrar el numero total de positivos ingresados
        System.out.println("Ingresaste " + contador_positivos + " numeros positivos.");
    }
}
