import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("001","Motherboard ASROCK A520", 72000);
        Producto p2 = new Producto("002","Procesador Ryzen 5600GT", 180000);
        Producto p3 = new Producto("003","Placa de video AMD 5600XT", 300000);

        Set<Producto> productos = new HashSet<Producto>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);

        System.out.println("Contenido: ");

        for (Producto producto : productos) {
            System.out.println(producto);
        }


        System.out.println("La cantidad de productos en el HashSet es de: " + productos.size());


    }
}