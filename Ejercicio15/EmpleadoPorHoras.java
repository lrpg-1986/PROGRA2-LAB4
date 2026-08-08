// Ejercicio 15: EmpleadoPorHoras
public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String id, String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(id, nombre);
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas.");
        }
        if (tarifaPorHora < 0) {
            throw new IllegalArgumentException("La tarifa por hora no puede ser negativa.");
        }
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * tarifaPorHora;
    }
}
