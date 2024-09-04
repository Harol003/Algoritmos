/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo31;

/**
 *
 * @author Harol
 */
import java.util.Scanner;

public class Algoritmo31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Definición de variables
        double alturaInicial, velocidadInicial, tiempoCaida; // Variables para la altura inicial, velocidad inicial y tiempo de caída
        double velocidadFinal, alturaFinal; // Variables para la velocidad final y altura final
        double velocidadFinalParacaidas = 5; // Velocidad final con el paracaídas abierto
        double tiempoCaidaConParacaidas; // Tiempo de caída con el paracaídas abierto
        double alturaFinalConParacaidas; // Altura final después del descenso con paracaídas
        
        // Inicialización
        velocidadInicial = 0; // Velocidad inicial al tirarse del avión es 0 (en m/s)
        
        // Entrada de datos
        System.out.print("Ingrese la altura inicial desde la que se tira (en metros): ");
        alturaInicial = scanner.nextDouble(); // Lee la altura inicial desde la que el paracaidista se tira
        
        System.out.print("Ingrese el tiempo de caída (en segundos): ");
        tiempoCaida = scanner.nextDouble(); // Lee el tiempo de caída desde que se tira hasta que el paracaídas se abre
        
        // Calcular la velocidad final antes de abrir el paracaídas (asumiendo aceleración constante)
        velocidadFinal = velocidadInicial + 9.81 * tiempoCaida; // Usamos la aceleración debida a la gravedad (9.81 m/s²) para calcular la velocidad final
        
        // Calcular la altura final después de la caída libre
        alturaFinal = alturaInicial - (0.5 * 9.81 * Math.pow(tiempoCaida, 2)); // Calcula la altura final usando la fórmula de caída libre
        
        // Mostrar los resultados
        System.out.println("La velocidad final antes de abrir el paracaídas es: " + velocidadFinal + " m/s"); // Muestra la velocidad final
        System.out.println("La altura final antes de abrir el paracaídas es: " + alturaFinal + " metros"); // Muestra la altura final
        
        // Suponiendo que el paracaídas se abre y reduce la velocidad a 5 m/s
        System.out.print("Ingrese el tiempo de descenso con el paracaídas abierto (en segundos): ");
        tiempoCaidaConParacaidas = scanner.nextDouble(); // Lee el tiempo de descenso con el paracaídas abierto
        
        // Calcular la altura final después del descenso con paracaídas
        alturaFinalConParacaidas = alturaFinal - (velocidadFinalParacaidas * tiempoCaidaConParacaidas); // Calcula la altura final después del descenso con paracaídas
        
        // Mostrar resultados finales
        System.out.println("La altura final después del descenso con paracaídas es: " + alturaFinalConParacaidas + " metros"); // Muestra la altura final después de abrir el paracaídas
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
