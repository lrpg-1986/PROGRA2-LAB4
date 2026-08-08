// Ejercicio 13: Clase Estudiante (Hereda de Persona y se asocia con Curso)
import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private String carne;
    private String carrera;
    private List<Curso> cursosInscritos;

    public Estudiante(String dpi, String nombre, String email, String carne, String carrera) {
        super(dpi, nombre, email);
        this.carne = carne;
        this.carrera = carrera;
        this.cursosInscritos = new ArrayList<>();
    }

    public String getCarne() { return carne; }
    public String getCarrera() { return carrera; }
    public List<Curso> getCursosInscritos() { return cursosInscritos; }

    public void inscribirCurso(Curso curso) {
        cursosInscritos.add(curso);
        System.out.println("✓ Curso '" + curso.getNombreCurso() + "' inscrito al estudiante " + getNombre());
    }

    @Override
    public void mostrarPerfil() {
        System.out.println("=========================================================================");
        System.out.println("ESTUDIANTE -> Carné: " + carne + " | Nombre: " + getNombre() + " | Carrera: " + carrera);
        System.out.println("DPI: " + getDpi() + " | Email: " + getEmail());
        System.out.println("Cursos Inscritos (" + cursosInscritos.size() + "):");
        if (cursosInscritos.isEmpty()) {
            System.out.println("  (Sin cursos asignados)");
        } else {
            for (Curso c : cursosInscritos) {
                c.mostrarDetallesCurso();
            }
        }
        System.out.println("=========================================================================\n");
    }
}
