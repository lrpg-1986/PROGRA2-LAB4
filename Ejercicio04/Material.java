// Ejercicio 4: Clase base Material
public class Material {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Material(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    public void mostrarInformacion() {
        System.out.println("Material -> Título: " + titulo + " | Autor: " + autor + " | Año: " + anioPublicacion);
    }
}
