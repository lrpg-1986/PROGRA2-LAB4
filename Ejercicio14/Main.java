// Ejercicio 14: Diagrama de Secuencia (Usuario consulta información de un estudiante)
import java.util.HashMap;
import java.util.Map;

// Componentes del sistema para la secuencia
class EstudianteDTO {
    String carne;
    String nombre;
    String carrera;
    double promedio;

    public EstudianteDTO(String carne, String nombre, String carrera, double promedio) {
        this.carne = carne;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }
}

class EstudianteRepository {
    private Map<String, EstudianteDTO> db = new HashMap<>();

    public EstudianteRepository() {
        db.put("2026-1010", new EstudianteDTO("2026-1010", "Alejandro Pérez", "Ingeniería en Sistemas", 88.5));
    }

    public EstudianteDTO buscarPorCarne(String carne) {
        System.out.println("  [3] EstudianteRepository: Consultando en Base de Datos para carné " + carne);
        return db.get(carne);
    }
}

class EstudianteController {
    private EstudianteRepository repo = new EstudianteRepository();

    public String consultarInformacionEstudiante(String carne) {
        System.out.println("  [2] EstudianteController: Recibida solicitud para consultar estudiante " + carne);
        EstudianteDTO est = repo.buscarPorCarne(carne);

        if (est != null) {
            System.out.println("  [4] EstudianteController: Estudiante encontrado. Retornando datos procesados.");
            return "Carné: " + est.carne + " | Nombre: " + est.nombre + " | Carrera: " + est.carrera + " | Promedio: " + est.promedio;
        } else {
            System.out.println("  [4] EstudianteController: Estudiante NO encontrado.");
            return "Estudiante no registrado.";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 14: DIAGRAMA DE SECUENCIA UML ===\n");

        System.out.println("--- CÓDIGO MERMAID DEL DIAGRAMA DE SECUENCIA ---");
        System.out.println("```mermaid");
        System.out.println("sequenceDiagram");
        System.out.println("    actor Usuario");
        System.out.println("    participant InterfaceUI as Interfaz de Usuario");
        System.out.println("    participant Controller as EstudianteController");
        System.out.println("    participant Repository as EstudianteRepository");
        System.out.println("    participant DB as BaseDeDatos");
        System.out.println();
        System.out.println("    Usuario->>InterfaceUI: 1. Ingresa carné '2026-1010' y solicita consulta");
        System.out.println("    InterfaceUI->>Controller: 2. consultarInformacionEstudiante('2026-1010')");
        System.out.println("    Controller->>Repository: 3. buscarPorCarne('2026-1010')");
        System.out.println("    Repository->>DB: 4. SELECT * FROM estudiantes WHERE carne = '2026-1010'");
        System.out.println("    DB-->>Repository: 5. Retorna registro de estudiante");
        System.out.println("    Repository-->>Controller: 6. Retorna EstudianteDTO");
        System.out.println("    Controller-->>InterfaceUI: 7. Retorna datos formateados del estudiante");
        System.out.println("    InterfaceUI-->>Usuario: 8. Muestra la información del estudiante en pantalla");
        System.out.println("```\n");

        System.out.println("--- SIMULACIÓN DE LA SECUENCIA DE INTERACCIÓN EN JAVA ---");
        EstudianteController controller = new EstudianteController();

        System.out.println("  [1] Usuario -> UI: Hace clic en 'Buscar Estudiante' con carné '2026-1010'");
        String resultado = controller.consultarInformacionEstudiante("2026-1010");
        System.out.println("  [5] UI -> Usuario: Mostrando resultados:\n      " + resultado);
    }
}
