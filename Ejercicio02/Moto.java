// Ejercicio 2: Clase hija Moto con Herencia y Polimorfismo
public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Moto  -> Marca: " + getMarca() + 
                           " | Modelo: " + getModelo() + 
                           " | Precio: $" + getPrecio() + 
                           " | Cilindrada: " + cilindrada + " cc");
    }
}
