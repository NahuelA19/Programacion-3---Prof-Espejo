package com.parcial2.springboot.controladores;


import com.parcial2.springboot.entidades.Curso;
import com.parcial2.springboot.servicios.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;



    //GET:

    @GetMapping
    public List<Curso> listarCursos(){

        return cursoService.obtenerTodosLosCursos();
    }

    //Post:

    @PostMapping
    public Curso crearCurso(@RequestBody Curso curso, @RequestParam Long profesorId){

        return cursoService.crearUnCurso(curso, profesorId);

    }


    @PostMapping("/{cursoId}/estudiantes/{estudianteId}")
    public Curso asignarEstudiante(@PathVariable Long cursoId, @PathVariable Long estudianteId){

        return cursoService.asignarUnCurso(cursoId,estudianteId);
    }


}
