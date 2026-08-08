// Ejercicio 15: Clase principal Main con demostración de Polimorfismo y Validación
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 15: SISTEMA DE EMPLEADOS (POLIMORFISMO Y VALIDACIÓN) ===\n");

        List<Empleado> plantilla = new ArrayList<>();

        try {
            plantilla.add(new EmpleadoTiempoCompleto("EMP-001", "Roberto Alvarado", 4500.0, 500.0));
            plantilla.add(new EmpleadoPorHoras("EMP-002", "Sofía Morales", 160, 25.0));
            plantilla.add(new EmpleadoTiempoCompleto("EMP-003", "Fernando Castillo", 3800.0, 250.0));
            plantilla.add(new EmpleadoPorHoras("EMP-004", "Claudia Méndez", 120, 30.0));

            System.out.println("NÓMINA GENERAL DE EMPLEADOS:");
            System.out.println("-------------------------------------------------------------------------");
            double totalNomina = 0;
            for (Empleado emp : plantilla) {
                emp.mostrarRecibo();
                totalNomina += emp.calcularPago();
            }
            System.out.println("-------------------------------------------------------------------------");
            System.out.printf("TOTAL NÓMINA A PAGAR: $%,10.2f%n%n", totalNomina);

        } catch (IllegalArgumentException e) {
            System.out.println("❌ ERROR DE VALIDACIÓN DE EMPLEADO: " + e.getMessage());
        }

        // Prueba de Validación de Datos (Intentando crear empleado con tarifa negativa)
        System.out.println("--- PRUEBA DE VALIDACIÓN CON DATOS INVÁLIDOS ---");
        try {
            Empleado invalido = new EmpleadoPorHoras("EMP-999", "Prueba Error", -40, 15.0);
            invalido.calcularPago();
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Excepción capturada correctamente: " + e.getMessage());
        }
    }
}
