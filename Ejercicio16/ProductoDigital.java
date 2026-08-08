// Ejercicio 16: Subclase ProductoDigital (Sin envío, aplica descuento por producto digital)
public class ProductoDigital extends Producto {
    private double tamanioMB;
    private double porcentajeDescuento; // Ejemplo: 10% = 0.10

    public ProductoDigital(String id, String nombre, double precioBase, double tamanioMB, double porcentajeDescuento) {
        super(id, nombre, precioBase);
        this.tamanioMB = tamanioMB;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getTamanioMB() { return tamanioMB; }

    @Override
    public double calcularPrecioFinal() {
        double descuento = getPrecioBase() * porcentajeDescuento;
        return getPrecioBase() - descuento;
    }
}
