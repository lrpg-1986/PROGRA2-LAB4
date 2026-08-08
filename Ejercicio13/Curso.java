// Ejercicio 13: Clase Curso
public class Curso {
    private String codigo;
    private String nombreCurso;
    private int creditos;

    public Curso(String codigo, String nombreCurso, int creditos) {
        this.codigo = codigo;
        this.nombreCurso = nombreCurso;
        this.creditos = creditos;
    }

    public String getCodigo() { return codigo; }
    public String getNombreCurso() { return nombreCurso; }
    public int getCreditos() { return creditos; }

    public void mostrarDetallesCurso() {
        System.out.println("  • [" + codigo + "] " + nombreCurso + " (" + creditos + " créditos)");
    }
}
