/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo10;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear un escaner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Indicar al usuario para que sirve el programa
        System.out.println("Politecnico Internacional - Diseno de Algoritmos");
        System.out.println("Objetivo: Este programa contara cuantas veces se repite un numero especifico que determines.");
        
        // Pedir al usuario que ingrese el numero a buscar
        System.out.print("Ingresa el numero a buscar: ");
        int numero_buscar = scanner.nextInt();

        // Inicializar el contador de repeticiones
        int contador_repeticiones = 0;
        // Inicializar la variable numero con un valor distinto de 0
        int numero = 1;

        // Mientras el numero no sea 0, continuar pidiendo numeros
        while (numero != 0) {
            System.out.print("Ingresa un numero (0 para salir): ");
            // Leer el numero ingresado por el usuario
            numero = scanner.nextInt();
            // Si el numero ingresado es igual al numero a buscar, incrementar el contador
            if (numero == numero_buscar) {
                contador_repeticiones++;
            }
        }
        
        // Mostrar cuantas veces se repitio el numero buscado
        System.out.println("El numero " + numero_buscar + " se repitio " + contador_repeticiones + " veces.");
    }
    
}
