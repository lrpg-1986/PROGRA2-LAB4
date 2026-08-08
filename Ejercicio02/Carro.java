// Ejercicio 2: Clase hija Carro con Herencia y Polimorfismo
public class Carro extends Vehiculo {
    private int numPuertas;

    public Carro(String marca, String modelo, double precio, int numPuertas) {
        super(marca, modelo, precio);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Carro -> Marca: " + getMarca() + 
                           " | Modelo: " + getModelo() + 
                           " | Precio: $" + getPrecio() + 
                           " | Número de Puertas: " + numPuertas);
    }
}
