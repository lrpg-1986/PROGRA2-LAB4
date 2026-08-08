// Ejercicio 12: Menú Básico Interactivo (Sumar y Restar)
import java.util.Scanner;

public class Main {

    public static void ejecutarSuma(Scanner scanner) {
        System.out.println("\n--- OPCIÓN 1: SUMAR ---");
        System.out.print("Ingrese el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = scanner.nextDouble();
        System.out.printf("✓ Resultado de la suma: %.2f + %.2f = %.2f%n", a, b, (a + b));
    }

    public static void ejecutarResta(Scanner scanner) {
        System.out.println("\n--- OPCIÓN 2: RESTAR ---");
        System.out.print("Ingrese el minuendo (primer número): ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el sustraendo (segundo número): ");
        double b = scanner.nextDouble();
        System.out.printf("✓ Resultado de la resta: %.2f - %.2f = %.2f%n", a, b, (a - b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n==================================");
            System.out.println("        MENÚ PRINCIPAL           ");
            System.out.println("==================================");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opción (1-3): ");

            try {
                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                } else {
                    opcion = 3; // Salir en caso de ejecución no interactiva
                }

                switch (opcion) {
                    case 1:
                        ejecutarSuma(scanner);
                        break;
                    case 2:
                        ejecutarResta(scanner);
                        break;
                    case 3:
                        System.out.println("¡Gracias por utilizar el sistema! Saliendo...");
                        break;
                    default:
                        System.out.println("❌ Opción inválida. Por favor seleccione 1, 2 o 3.");
                }
            } catch (Exception e) {
                System.out.println("❌ Error en la lectura de datos: " + e.getMessage());
                scanner.nextLine(); // Limpiar búfer
            }

        } while (opcion != 3);

        scanner.close();
    }
}
