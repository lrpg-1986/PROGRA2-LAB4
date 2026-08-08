// Ejercicio 2: Clase base Vehiculo aplicando Encapsulamiento
public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Getters y Setters (Encapsulamiento)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para mostrar datos (se sobrescribirá en clases hijas)
    public void mostrarDatos() {
        System.out.println("Vehículo -> Marca: " + marca + " | Modelo: " + modelo + " | Precio: $" + precio);
    }
}
