import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Tito Calderon",19,"Programacion");
        Estudiante e2 = new Estudiante("Jorge Almiron",24,"Programacion");
        Estudiante e3 = new Estudiante("Maria Lopez",22,"Programacion");

        List<Estudiante> estudiantescurso1 = new ArrayList<>();
        estudiantescurso1.add(e1);
        estudiantescurso1.add(e2);
        estudiantescurso1.add(e3);

        Curso curso1 = new Curso("Base de datos 2","Prof Franco",estudiantescurso1);


        Estudiante e4 = new Estudiante("Nahuel Aciar",27,"Programacion");


        List<Estudiante> estudiantescurso2 = new ArrayList<>();
        estudiantescurso2.add(e4);

        Curso curso2 = new Curso("Materia inventada", "Profe falso", estudiantescurso2);


        System.out.println(curso1);

        System.out.println("////////////////////////////////////////////");

        System.out.println(curso2);


        }
    }
