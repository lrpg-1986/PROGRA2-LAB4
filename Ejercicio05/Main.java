// Ejercicio 5: Validación de Edad con try-catch y excepciones personalizadas
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Método para validar que la edad sea un número entero positivo
    public static void validarEdad(int edad) throws IllegalArgumentException {
        if (edad < 0) {
            throw new IllegalArgumentException("Error: La edad no puede ser un número negativo (" + edad + ").");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 5: VALIDACIÓN DE EDAD ===");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            if (!scanner.hasNextInt()) {
                throw new InputMismatchException("Entrada no válida: Debe ingresar un número entero.");
            }
            
            int edad = scanner.nextInt();
            validarEdad(edad);
            
            System.out.println("✓ Éxito: La edad ingresada (" + edad + " años) es válida.");

        } catch (InputMismatchException e) {
            System.out.println("❌ ERROR DE FORMATO: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("❌ ERROR DE VALIDACIÓN: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ ERROR INESPERADO: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Proceso de validación de edad finalizado.");
        }
    }
}
