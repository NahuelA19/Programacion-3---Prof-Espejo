import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList();

        Producto p1 = new Producto("001","Motherboard ASROCK A520", 72000);
        Producto p2 = new Producto("002","Procesador Ryzen 5600GT", 180000);
        Producto p3 = new Producto("003","Placa de video AMD 5600XT", 300000);



        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);

        System.out.println("Productos en la lista:");
        for (Producto p : listaProductos) {
            System.out.println(p);
        }
    }

        }

