/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo6;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un escaner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Indicar al usuario para que sirve el programa
        System.out.println("Politecnico Internacional - Diseno de Algoritmos");
        System.out.println("Objetivo: Este programa calculara la potencia de un numero base elevado a un exponente.");
        // Pedir al usuario que ingrese la base
        System.out.print("Ingresa la base: ");
        int base = scanner.nextInt();
        // Pedir al usuario que ingrese el exponente
        System.out.print("Ingresa el exponente: ");
        int exponente = scanner.nextInt();
        
        // Inicializar el resultado con 1
        int resultado = 1;
        // Inicializar el contador en 0
        int contador = 0;
        
        // Mientras el contador sea menor que el exponente, continuar multiplicando
        while (contador < exponente) {
            resultado *= base;
            contador++;
        }
        
        // Mostrar el resultado al usuario
        System.out.println(base + " elevado a " + exponente + " es igual a: " + resultado);
    }
    
}
