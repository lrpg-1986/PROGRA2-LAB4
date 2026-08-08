// Ejercicio 3: Clase PagoTarjeta
public class PagoTarjeta extends Pago {
    private String numeroTarjeta;
    private String tipoTarjeta; // Visa, MasterCard, etc.

    public PagoTarjeta(String cliente, String numeroTarjeta, String tipoTarjeta) {
        super(cliente);
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        // Formatear número de tarjeta para mostrar solo los últimos 4 dígitos por seguridad
        String ultimosDigitos = numeroTarjeta.length() >= 4 ? 
                numeroTarjeta.substring(numeroTarjeta.length() - 4) : numeroTarjeta;
        
        System.out.println("Procesando Pago con Tarjeta:");
        System.out.println("  Cliente: " + cliente);
        System.out.println("  Tarjeta: " + tipoTarjeta + " (**** **** **** " + ultimosDigitos + ")");
        System.out.println("  Monto: $" + String.format("%.2f", monto));
        System.out.println("  Estado: ¡PAGO CON TARJETA APROBADO EXITOSAMENTE!\n");
    }
}
