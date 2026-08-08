// Ejercicio 1: Clase principal Main para demostrar Polimorfismo
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1: SISTEMA DE ANIMALES ===");

        // Crear objetos usando referencias de la clase base Animal (Polimorfismo)
        Animal miPerro = new Perro("Max");
        Animal miGato = new Gato("Michi");

        // Colección polimórfica
        List<Animal> animales = new ArrayList<>();
        animales.add(miPerro);
        animales.add(miGato);
        animales.add(new Perro("Rex"));
        animales.add(new Gato("Luna"));

        System.out.println("Demostración de Polimorfismo:");
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
