// Ejercicio 4: Clase hija Libro
public class Libro extends Material {
    private int numPaginas;
    private String isbn;

    public Libro(String titulo, String autor, int anioPublicacion, int numPaginas, String isbn) {
        super(titulo, autor, anioPublicacion);
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro   -> Título: '" + getTitulo() + "' | Autor: " + getAutor() + 
                           " | Año: " + getAnioPublicacion() + " | Páginas: " + numPaginas + " | ISBN: " + isbn);
    }
}
