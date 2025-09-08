import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



//        Caja MODO String

        Caja<String> cajaString = new Caja<>();
        cajaString.setContenido("Genericooooo");
        System.out.println("Caja String : " + cajaString.getContenido());

//      Caja MODO Integer
        Caja<Integer> cajaInteger = new Caja<>();
        cajaInteger.setContenido(10101);
        System.out.println("Caja Integer: " + cajaInteger.getContenido());


//        Coleccion sin genericos:

        List listaSinGenericos= new ArrayList();
        listaSinGenericos.add("Hola");
        listaSinGenericos.add(100);
        listaSinGenericos.add(99);

        System.out.println("Lista SinGenericos:");

        for (Object o : listaSinGenericos) {
            System.out.println(o);
        }


    }
}