package com.parcial2.springboot.controladores;


import com.parcial2.springboot.entidades.Profesor;
import com.parcial2.springboot.servicios.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {
    @Autowired
    private ProfesorService profesorService;


    //Get:

    @GetMapping
    public List<Profesor> listarProfesores() {
        return profesorService.obtenerTodosLosProfesores();
    }

    //Post:

    @PostMapping
    public Profesor crearProfesor(@RequestBody Profesor profesor){
        return profesorService.guardarCambiosProfesor(profesor);
    }
}
