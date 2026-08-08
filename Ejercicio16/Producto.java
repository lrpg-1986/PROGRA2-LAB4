// Ejercicio 16: Clase base Producto
public abstract class Producto {
    private String id;
    private String nombre;
    private double precioBase;

    public Producto(String id, String nombre, double precioBase) {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase; }

    // Método abstracto para calcular el precio final según el tipo de producto
    public abstract double calcularPrecioFinal();

    public void mostrarInformacionProducto() {
        System.out.printf("[%s] %-25s | Precio Base: $%,8.2f | Precio Final: $%,8.2f%n", 
                          id, nombre, precioBase, calcularPrecioFinal());
    }
}
