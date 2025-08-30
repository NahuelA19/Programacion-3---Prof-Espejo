package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Usuario usuario1 =Usuario.builder()
               .id("12311")
               .nombre("Nahuel")
               .email("nahuel@gmail.com")
               .build();


        Usuario usuario2 = Usuario.builder()
                .id("02")
                .nombre("Jorge")
                .email("Jorge@gmail.com")
                .build();


        System.out.println(usuario1);

        System.out.println(usuario2);


        }




    }
