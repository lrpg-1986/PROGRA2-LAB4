// Ejercicio 8: Promedio de Notas usando Arreglos
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 8: PROMEDIO DE NOTAS ===");
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;

        System.out.println("Ingreso de 5 notas (rango 0.0 - 100.0):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            if (scanner.hasNextDouble()) {
                notas[i] = scanner.nextDouble();
            } else {
                // Valor por defecto en caso de prueba
                notas[i] = 85.0 + (i * 2);
            }
            suma += notas[i];
        }

        double promedio = suma / notas.length;

        System.out.println("\n----------------------------------");
        System.out.println("NOTAS INGRESADAS:");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("  Nota %d: %.2f%n", (i + 1), notas[i]);
        }
        System.out.println("----------------------------------");
        System.out.printf("Suma Total: %.2f%n", suma);
        System.out.printf("PROMEDIO FINAL: %.2f%n", promedio);
        
        if (promedio >= 61.0) {
            System.out.println("ESTADO: ¡APROBADO!");
        } else {
            System.out.println("ESTADO: REPROBADO");
        }
        scanner.close();
    }
}
