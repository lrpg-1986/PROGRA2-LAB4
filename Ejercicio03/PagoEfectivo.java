// Ejercicio 3: Clase PagoEfectivo
public class PagoEfectivo extends Pago {
    private double montoEntregado;

    public PagoEfectivo(String cliente, double montoEntregado) {
        super(cliente);
        this.montoEntregado = montoEntregado;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando Pago en Efectivo:");
        System.out.println("  Cliente: " + cliente);
        System.out.println("  Monto a pagar: $" + String.format("%.2f", monto));
        System.out.println("  Efectivo recibido: $" + String.format("%.2f", montoEntregado));
        
        if (montoEntregado >= monto) {
            double cambio = montoEntregado - monto;
            System.out.println("  Cambio a entregar: $" + String.format("%.2f", cambio));
            System.out.println("  Estado: ¡PAGO EN EFECTIVO REGISTRADO Y COMPLETADO!\n");
        } else {
            double faltante = monto - montoEntregado;
            System.out.println("  Error: Efectivo insuficiente. Faltan $" + String.format("%.2f", faltante) + "\n");
        }
    }
}
