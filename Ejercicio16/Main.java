// Ejercicio 16: Clase principal Main para el Sistema de Productos
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 16: SISTEMA DE PRODUCTOS (FÍSICOS Y DIGITALES) ===\n");

        List<Producto> inventario = new ArrayList<>();

        // Productos físicos (Precio base + (peso * envío))
        inventario.add(new ProductoFisico("PROD-F01", "Laptop Gaming", 1200.0, 2.5, 10.0));
        inventario.add(new ProductoFisico("PROD-F02", "Monitor 27 pulgadas", 300.0, 5.0, 8.0));

        // Productos digitales (Precio base - descuento digital)
        inventario.add(new ProductoDigital("PROD-D01", "Licencia Antivirus 1 Año", 50.0, 150.0, 0.15));
        inventario.add(new ProductoDigital("PROD-D02", "Curso Completo de Java EE", 100.0, 2500.0, 0.20));

        System.out.println("CATÁLOGO Y CÁLCULO DE PRECIOS FINALES:");
        System.out.println("----------------------------------------------------------------------------------------");
        double totalVenta = 0;
        for (Producto p : inventario) {
            p.mostrarInformacionProducto();
            totalVenta += p.calcularPrecioFinal();
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("VALOR TOTAL DEL CATÁLOGO (PRECIO FINAL): $%,10.2f%n", totalVenta);
    }
}
