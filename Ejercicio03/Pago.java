// Ejercicio 3: Clase base Pago
public abstract class Pago {
    protected String cliente;

    public Pago(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    // Método abstracto para procesar el pago
    public abstract void procesarPago(double monto);
}
