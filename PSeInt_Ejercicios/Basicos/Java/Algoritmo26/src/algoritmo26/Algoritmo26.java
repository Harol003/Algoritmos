/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo26;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Importar la clase Math para funciones matemáticas
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Definir las variables
        double lado, area;
        
        // Solicitar al usuario que ingrese la longitud del lado del triángulo equilátero
        System.out.print("Ingrese la longitud del lado del triangulo equilatero: ");
        lado = scanner.nextDouble(); // Leer la longitud del lado ingresada por el usuario
        
        // Calcular el área del triángulo equilátero
        area = (Math.sqrt(3) / 4) * (lado * lado);
        
        // Mostrar el área del triángulo equilátero
        System.out.println("El area del triangulo equilatero es: " + area);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
