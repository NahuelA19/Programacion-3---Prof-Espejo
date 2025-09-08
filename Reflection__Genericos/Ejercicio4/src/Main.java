import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> listaInt = Arrays.asList(100, 22, 345, 22, 19);

        System.out.println("lista de enteros: ");

        Imprimo.imprimirLista(listaInt);


        List<String> listaCadenas = Arrays.asList("Hola", "Soy", "una","cadena","#Genericos");
        System.out.println("lista de cadenas: ");

        Imprimo.imprimirLista(listaCadenas);

    }
}