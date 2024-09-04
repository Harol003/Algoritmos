/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo8;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un escaner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Inicializar el contador de multiplos de 3
        int contador_multiplos = 0;
        // Inicializar la variable numero con un valor distinto de 0
        int numero = 1;

        // Indicar al usuario para que sirve el programa
        System.out.println("Politecnico Internacional - Diseno de Algoritmos");
        System.out.println("Objetivo: Este programa contara cuantos multiplos de 3 ingresas hasta que ingreses un 0.");
        
        // Mientras el numero no sea 0, continuar pidiendo numeros
        while (numero != 0) {
            System.out.print("Ingresa un numero (0 para salir): ");
            // Leer el numero ingresado por el usuario
            numero = scanner.nextInt();
            // Si el numero es multiplo de 3, incrementar el contador
            if (numero % 3 == 0 && numero != 0) {
                contador_multiplos++;
            }
        }
        
        // Mostrar el numero total de multiplos de 3 ingresados
        System.out.println("Ingresaste " + contador_multiplos + " multiplos de 3.");
    }
    
}
