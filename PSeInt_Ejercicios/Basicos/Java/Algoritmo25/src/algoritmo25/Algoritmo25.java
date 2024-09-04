/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo25;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Definir las variables
        double lado, area;
        
        // Solicitar al usuario que ingrese la longitud del lado del cuadrado
        System.out.print("Ingrese la longitud del lado del cuadrado: ");
        lado = scanner.nextDouble(); // Leer la longitud del lado ingresada por el usuario
        
        // Calcular el área del cuadrado
        area = lado * lado;
        
        // Mostrar el área del cuadrado
        System.out.println("El area del cuadrado es: " + area);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
