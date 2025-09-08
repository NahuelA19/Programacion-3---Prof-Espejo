import java.util.List;

public class Imprimo {

    public static <T> void imprimirLista(List<T> lista){
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

}
