// Ejercicio 2: Clase principal Main demostrando Herencia, Encapsulamiento y Polimorfismo
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 2: SISTEMA DE VEHÍCULOS ===");

        // Crear lista de vehículos demostrando Polimorfismo
        List<Vehiculo> flota = new ArrayList<>();
        flota.add(new Carro("Toyota", "Corolla", 22000.0, 4));
        flota.add(new Moto("Yamaha", "MT-07", 7500.0, 689));
        flota.add(new Carro("Ford", "Mustang", 45000.0, 2));
        flota.add(new Moto("Honda", "CBR500R", 6800.0, 471));

        System.out.println("Listado de Datos de la Flota de Vehículos:");
        System.out.println("--------------------------------------------------");
        for (Vehiculo v : flota) {
            v.mostrarDatos();
        }
    }
}
