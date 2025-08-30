package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProductoDTO productoDTO1 = new ProductoDTO();
        productoDTO1.setCodigo("1");
        productoDTO1.setNombre("Procesador Ryzen 5500");
        productoDTO1.setPrecio(100000);

        ProductoDTO productoDTO2 = new ProductoDTO();
        productoDTO2.setCodigo("2");
        productoDTO2.setNombre("Placa de video RX580 8GB");
        productoDTO2.setPrecio(125000);

        ProductoDTO productoDTO3 = new ProductoDTO();
        productoDTO3.setCodigo("3");
        productoDTO3.setNombre("Fuente Sentey 650W");


        ArrayList<ProductoDTO> productoDTOs = new ArrayList<>();
        productoDTOs.add(productoDTO1);
        productoDTOs.add(productoDTO2);
        productoDTOs.add(productoDTO3);


        for (ProductoDTO productoDTO : productoDTOs) {
            System.out.println(productoDTO.getCodigo() + " " + productoDTO.getNombre() + " " + productoDTO.getPrecio());
        }

        }
    }
