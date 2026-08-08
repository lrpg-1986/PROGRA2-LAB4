// Ejercicio 13: Demostración de Diagrama de Clases UML (Persona, Estudiante, Curso)
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 13: DIAGRAMA DE CLASES (SISTEMA DE ESTUDIANTES) ===\n");

        System.out.println("--- REPRESENTACIÓN EN MERMAID / UML ---");
        System.out.println("```mermaid");
        System.out.println("classDiagram");
        System.out.println("    class Persona {");
        System.out.println("        -String dpi");
        System.out.println("        -String nombre");
        System.out.println("        -String email");
        System.out.println("        +mostrarPerfil()");
        System.out.println("    }");
        System.out.println("    class Estudiante {");
        System.out.println("        -String carne");
        System.out.println("        -String carrera");
        System.out.println("        -List~Curso~ cursosInscritos");
        System.out.println("        +inscribirCurso(Curso)");
        System.out.println("        +mostrarPerfil()");
        System.out.println("    }");
        System.out.println("    class Curso {");
        System.out.println("        -String codigo");
        System.out.println("        -String nombreCurso");
        System.out.println("        -int creditos");
        System.out.println("        +mostrarDetallesCurso()");
        System.out.println("    }");
        System.out.println("    Persona <|-- Estudiante : Herencia");
        System.out.println("    Estudiante \"1\" *-- \"*\" Curso : Asociación (Inscripción)");
        System.out.println("```\n");

        System.out.println("--- EJECUCIÓN DEL MODELO DE DOMINIO JAVA ---");
        Curso progra2 = new Curso("CC201", "Programación II", 5);
        Curso bd = new Curso("CC202", "Bases de Datos I", 4);

        Estudiante e1 = new Estudiante("1234567890101", "María López", "maria@universidad.edu", "2026-0042", "Ingeniería en Sistemas");
        
        e1.inscribirCurso(progra2);
        e1.inscribirCurso(bd);

        e1.mostrarPerfil();
    }
}
