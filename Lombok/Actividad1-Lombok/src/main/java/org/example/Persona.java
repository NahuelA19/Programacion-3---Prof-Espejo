package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Persona {


    @Getter
    private String nombre;

    @Getter
    private int edad;

}
