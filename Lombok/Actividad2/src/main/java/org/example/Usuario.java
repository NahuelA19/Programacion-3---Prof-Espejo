package org.example;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Usuario {
    private String id;
    private String nombre;
    private String email;


}
