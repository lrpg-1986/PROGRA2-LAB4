// Ejercicio 7: Entrada Numérica con Manejo de Excepciones de Entrada
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 7: ENTRADA NUMÉRICA EN JAVA ===");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Por favor, ingrese un número (entero o decimal): ");
            double numero = scanner.nextDouble();
            
            System.out.println("✓ ¡Entrada exitosa!");
            System.out.println("El número ingresado es: " + numero);
            System.out.println("El doble del número es: " + (numero * 2));

        } catch (InputMismatchException e) {
            System.out.println("\n❌ ERROR DE TIPO DE DATO:");
            System.out.println("Ha ingresado texto o caracteres no numéricos.");
            System.out.println("Por favor asegúrese de ingresar únicamente dígitos numéricos.");
        } catch (Exception e) {
            System.out.println("\n❌ Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\nFin del programa de lectura de datos.");
        }
    }
}
