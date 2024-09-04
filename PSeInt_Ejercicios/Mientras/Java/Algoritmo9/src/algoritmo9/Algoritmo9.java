/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo9;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear un escaner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Indicar al usuario para que sirve el programa
        System.out.println("Politecnico Internacional - Diseno de Algoritmos");
        System.out.println("Objetivo: Este programa te permitira verificar si un numero es primo.");
        
        // Pedir al usuario que ingrese un numero
        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();

        // Inicializar la variable para verificar si es primo
        boolean esPrimo = true;
        int divisor = 2;
        
        // Mientras el divisor sea menor que el numero, verificar si es divisible
        while (divisor <= numero / 2) {
            if (numero % divisor == 0) {
                esPrimo = false;
                break; // Salir del ciclo si se encuentra un divisor
            }
            divisor++;
        }
        
        // Mostrar si el numero es primo o no
        if (esPrimo && numero > 1) {
            System.out.println(numero + " es un numero primo.");
        } else {
            System.out.println(numero + " no es un numero primo.");
        }
    }
    
}
