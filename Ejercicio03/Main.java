// Ejercicio 3: Clase principal Main para demostrar Polimorfismo en Pagos
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 3: SISTEMA DE PAGOS ===\n");

        Pago pago1 = new PagoTarjeta("Carlos Gómez", "4532123456789012", "Visa");
        Pago pago2 = new PagoEfectivo("Ana Martínez", 100.0);
        Pago pago3 = new PagoEfectivo("Luis Rodríguez", 40.0);

        pago1.procesarPago(150.75);
        pago2.procesarPago(85.50);
        pago3.procesarPago(50.00); // Demostrando validación de monto insuficiente
    }
}
