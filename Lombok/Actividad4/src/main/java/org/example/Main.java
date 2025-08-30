package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("1","Procesador Ryzen 5 1600",90000);

        Producto p2 = new Producto("2","Motherboard AM4 B350",60000);

        Producto p3 = new Producto("3","Memoria RAM DDR4 16GB 3200",40000);

        Producto p4 = new Producto("4","Placa de Video RX5600",200000);


        ProductoRecord pr1 = new ProductoRecord("1","Procesador Ryzen 5 1600",90000);
        ProductoRecord pr2 = new ProductoRecord("2","Motherboard AM4 B350",60000);

        ProductoRecord pr3 = new ProductoRecord("3","Memoria RAM DDR4 16GB 3200",40000);

        ProductoRecord pr4 = new ProductoRecord("4","Placa de Video RX5600",200000);


        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);


        ArrayList<ProductoRecord> productoRecords = new ArrayList<>();
        productoRecords.add(pr1);
        productoRecords.add(pr2);
        productoRecords.add(pr3);
        productoRecords.add(pr4);

        System.out.println("Imprimiendo lista de productos (Record): ");

        for (ProductoRecord pr : productoRecords) {
            System.out.println(pr);
        }




    }





    }
