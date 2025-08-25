import java.util.List;

public class Curso {

    private String nombre;
    private String profesor;
    private List<Estudiante> estudiantes;

    public Curso(String nombre, String profesor, List<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        String resultado = "Curso: " + nombre + "\n";
        resultado += "Profesor: " + profesor + "\n";
        resultado += "Cantidad de alumnos: " + estudiantes.size() + "\n";

        for (int i = 0; i < estudiantes.size(); i++) {
            resultado += (i + 1) + ". " + estudiantes.get(i) + "\n";
        }

        return resultado;
    }
}
