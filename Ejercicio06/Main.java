// Ejercicio 6: División Segura con try-catch
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 6: DIVISIÓN SEGURA ===");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el numerador (dividendo): ");
            double numerador = scanner.nextDouble();

            System.out.print("Ingrese el denominador (divisor): ");
            double denominador = scanner.nextDouble();

            // En Java, la división de double entre 0.0 produce Double.POSITIVE_INFINITY.
            // Para forzar la validación estricta de división entre cero:
            if (denominador == 0) {
                throw new ArithmeticException("No es posible dividir entre cero (0).");
            }

            double resultado = numerador / denominador;
            System.out.printf("✓ Resultado de la división: %.2f / %.2f = %.4f%n", numerador, denominador, resultado);

        } catch (InputMismatchException e) {
            System.out.println("❌ ERROR: Ha ingresado un valor que no es un número válido.");
        } catch (ArithmeticException e) {
            System.out.println("❌ ERROR ARITMÉTICO: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ ERROR GENERAL: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Operación finalizada.");
        }
    }
}
