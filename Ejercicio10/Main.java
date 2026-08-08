// Ejercicio 10: Estadísticas Básicas de 5 Números
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 10: ESTADÍSTICAS BÁSICAS ===");
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];

        System.out.println("Por favor ingrese 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            if (scanner.hasNextDouble()) {
                numeros[i] = scanner.nextDouble();
            } else {
                numeros[i] = (i + 1) * 3.5;
            }
        }

        // Cálculo de estadísticas
        double suma = 0;
        double mayor = numeros[0];
        double menor = numeros[0];

        for (double num : numeros) {
            suma += num;
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;
        }

        double promedio = suma / numeros.length;

        System.out.println("\n==================================");
        System.out.println("         RESULTADOS              ");
        System.out.println("==================================");
        System.out.print("Valores ingresados: [ ");
        for (double n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println("]");
        System.out.printf("  1. Suma total:    %.2f%n", suma);
        System.out.printf("  2. Promedio:      %.2f%n", promedio);
        System.out.printf("  3. Número Mayor:  %.2f%n", mayor);
        System.out.printf("  4. Número Menor:  %.2f%n", menor);
        System.out.println("==================================");

        scanner.close();
    }
}
