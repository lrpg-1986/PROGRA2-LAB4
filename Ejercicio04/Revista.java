// Ejercicio 4: Clase hija Revista
public class Revista extends Material {
    private int numeroEdicion;
    private String mesPublicacion;

    public Revista(String titulo, String autor, int anioPublicacion, int numeroEdicion, String mesPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista -> Título: '" + getTitulo() + "' | Editorial/Autor: " + getAutor() + 
                           " | Edición: #" + numeroEdicion + " | Mes: " + mesPublicacion + " " + getAnioPublicacion());
    }
}
