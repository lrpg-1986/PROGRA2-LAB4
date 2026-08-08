// Ejercicio 9: Determinar el Número Mayor de 3 Números
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 9: NÚMERO MAYOR DE 3 NÚMEROS ===");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Ingrese el tercer número: ");
            double num3 = scanner.nextDouble();

            // Algoritmo para determinar el mayor
            double mayor = num1;
            if (num2 > mayor) {
                mayor = num2;
            }
            if (num3 > mayor) {
                mayor = num3;
            }

            System.out.println("\n-------------------------------------------");
            System.out.println("Números ingresados: [" + num1 + ", " + num2 + ", " + num3 + "]");
            System.out.println("★ El número mayor es: " + mayor);
            System.out.println("-------------------------------------------");

        } catch (Exception e) {
            System.out.println("❌ Error: Debe ingresar números válidos.");
        } finally {
            scanner.close();
        }
    }
}
