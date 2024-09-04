/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo24;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Definir las variables
        double radio, area;
        
        // Solicitar al usuario que ingrese el radio del círculo
        System.out.print("Ingrese el radio del circulo: ");
        radio = scanner.nextDouble(); // Leer el radio ingresado por el usuario
        
        // Calcular el área del círculo
        area = 3.14159 * radio * radio;
        
        // Mostrar el área del círculo
        System.out.println("El area del circulo es: " + area);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
