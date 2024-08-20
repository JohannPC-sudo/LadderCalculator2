/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laddercalculator2;

/**
 *
 * @Johann Lopez
 */
import java.util.Scanner; // Importar la clase Scanner para la entrada de datos
import java.lang.Math; // Importar la librería Math para cálculos trigonométricos

public class LadderCalculator2 {
    
    // Método para calcular la longitud de la escalera
    public static double calculateLadderLength(double height, double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees); // Convertir el ángulo de grados a radianes
        return height / Math.cos(angleInRadians); // Aplicar la fórmula trigonométrica
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para la entrada de datos

        // Solicitar la altura de la escalera
        System.out.print("Ingrese la altura de la escalera (x): ");
        double x = scanner.nextDouble();

        // Solicitar el angulo de inclinación
        System.out.print("Ingrese el angulo de inclinacion (α) en grados: ");
        double alpha = scanner.nextDouble();

        // Calcular la longitud de la escalera
        double y = calculateLadderLength(x, alpha);
        
        // Imprimir el resultado
        System.out.println("La longitud de la escalera es: " + y);
    }

    }
    

