/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos2;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un escaner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Definir la contrasena correcta
        String contrasena_correcta = "1234";
        // Inicializar la variable contrasena con una cadena vacia
        String contrasena = "";
        // Indicar al usuario para que sirve el programa
        System.out.println("Politecnico Internacional - Diseno de Algoritmos");
        System.out.println("Objetivo: Este programa te pedira que ingreses una contrasena hasta que sea correcta.");
        // Mientras la contrasena ingresada no sea la correcta, continuar pidiendo
        while (!contrasena.equals(contrasena_correcta)) {
            System.out.print("Ingresa la contrasena: ");
            // Leer la contrasena ingresada por el usuario
            contrasena = scanner.nextLine();
            // Si la contrasena es incorrecta, indicar al usuario
            if (!contrasena.equals(contrasena_correcta)) {
                System.out.println("Contrasena incorrecta, intenta nuevamente.");
            }
        }
        // Indicar que la contrasena es correcta
        System.out.println("Contrasena correcta, acceso autorizado");
    }
}
