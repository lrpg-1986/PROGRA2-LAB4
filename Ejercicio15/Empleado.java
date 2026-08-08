// Ejercicio 15: Clase abstracta Empleado con validación de datos
public abstract class Empleado {
    private String id;
    private String nombre;

    public Empleado(String id, String nombre) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID del empleado no puede estar vacío.");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del empleado no puede estar vacío.");
        }
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }

    // Método abstracto para cálculo de pago (Polimorfismo)
    public abstract double calcularPago();

    public void mostrarRecibo() {
        System.out.printf("Empleado ID: %-8s | Nombre: %-20s | Sueldo a Recibir: $%,10.2f%n", 
                          id, nombre, calcularPago());
    }
}
