import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Nahuel",27,"Tecnicatura en programacion");

        Estudiante e2 = new Estudiante("Jimmy", 34, "Abogacia");

        Estudiante e3 = new Estudiante("Julia", 20, "Ingenieria");

        Estudiante e4 = new Estudiante("Chuck", 60, "Abogacia");


        ArrayList<Estudiante> lista = new ArrayList<>();

        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e4);


        for (Estudiante estudiante : lista) {
            System.out.println(estudiante);
        }



        }
    }
