// Ejercicio 16: Subclase ProductoFisico (Añade costo de envío según el peso)
public class ProductoFisico extends Producto {
    private double pesoKg;
    private double costoEnvioPorKg;

    public ProductoFisico(String id, String nombre, double precioBase, double pesoKg, double costoEnvioPorKg) {
        super(id, nombre, precioBase);
        this.pesoKg = pesoKg;
        this.costoEnvioPorKg = costoEnvioPorKg;
    }

    public double getPesoKg() { return pesoKg; }

    @Override
    public double calcularPrecioFinal() {
        double costoEnvio = pesoKg * costoEnvioPorKg;
        return getPrecioBase() + costoEnvio;
    }
}
