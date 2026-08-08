// Ejercicio 4: Clase principal Main para el Sistema de Biblioteca
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 4: SISTEMA DE BIBLIOTECA ===\n");

        List<Material> catalogo = new ArrayList<>();
        catalogo.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, 471, "978-0307474728"));
        catalogo.add(new Revista("National Geographic", "Editorial NG", 2024, 285, "Agosto"));
        catalogo.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, 863, "978-8424116088"));
        catalogo.add(new Revista("Muy Interesante", "Editorial Zinet", 2024, 490, "Julio"));

        System.out.println("Catálogo de Materiales Bibliográficos:");
        System.out.println("----------------------------------------------------------------------------------------");
        for (Material m : catalogo) {
            m.mostrarInformacion();
        }
    }
}
