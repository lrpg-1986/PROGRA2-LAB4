// Ejercicio 13: Clase Persona
public class Persona {
    private String dpi;
    private String nombre;
    private String email;

    public Persona(String dpi, String nombre, String email) {
        this.dpi = dpi;
        this.nombre = nombre;
        this.email = email;
    }

    public String getDpi() { return dpi; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }

    public void mostrarPerfil() {
        System.out.println("Persona -> DPI: " + dpi + " | Nombre: " + nombre + " | Email: " + email);
    }
}
