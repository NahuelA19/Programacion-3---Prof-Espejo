import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashMap<String, Curso> cursos = new HashMap<>();
        cursos.put("C01", new Curso("Programacion 3","Espejo"));
        cursos.put("C02", new Curso("Programacion 3","Chiroli"));
        cursos.put("C03", new Curso("Base de datos 2","Gonzales"));


        String codigo = "C01";

        Curso cursoRecuperado = cursos.get(codigo);

        System.out.println("El curso recuperado con el codigo " + codigo+" es: " + cursoRecuperado);

        System.out.println("Todos los cursos son: ");

        for (Map.Entry<String, Curso> entry : cursos.entrySet()) {
            System.out.println("Código: " + entry.getKey() + " : " + entry.getValue());
        }


        }




    }
