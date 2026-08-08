// Ejercicio 11: Clasificación de Edad
import java.util.Scanner;

public class Main {

    public static String clasificarEdad(int edad) {
        if (edad < 0) {
            return "Edad inválida (no puede ser negativa)";
        } else if (edad <= 12) {
            return "Niño";
        } else if (edad <= 17) {
            return "Adolescente";
        } else {
            return "Adulto";
        }
    }

    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 11: CLASIFICACIÓN DE EDAD ===");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese la edad a clasificar: ");
            int edad = scanner.nextInt();

            String categoria = clasificarEdad(edad);

            System.out.println("\n-------------------------------------------");
            System.out.println("Edad ingresada: " + edad + " años");
            System.out.println("Categoría correspondiente: ★ " + categoria + " ★");
            System.out.println("-------------------------------------------");

        } catch (Exception e) {
            System.out.println("❌ Error: Debe ingresar una edad entera numérica válida.");
        } finally {
            scanner.close();
        }
    }
}
