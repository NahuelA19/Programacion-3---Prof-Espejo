import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        Alumno a1 = new Alumno("Marcos Lopez",5);
        Alumno a2 = new Alumno("Joaquin DelValle",8);
        Alumno a3= new Alumno("Sofia Mendez",10);
        Alumno a4= new Alumno("Tatiana Garcia",5);

        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);


        System.out.println("Las notas de los alumnos del curso son: ");

        for(Alumno alumno:alumnos){
            System.out.println(alumno);
        }



        }
    }
