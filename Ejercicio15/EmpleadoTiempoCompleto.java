// Ejercicio 15: EmpleadoTiempoCompleto
public class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;
    private double bonificacion;

    public EmpleadoTiempoCompleto(String id, String nombre, double salarioMensual, double bonificacion) {
        super(id, nombre);
        if (salarioMensual < 0) {
            throw new IllegalArgumentException("El salario mensual no puede ser negativo.");
        }
        if (bonificacion < 0) {
            throw new IllegalArgumentException("La bonificación no puede ser negativa.");
        }
        this.salarioMensual = salarioMensual;
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularPago() {
        return salarioMensual + bonificacion;
    }
}
