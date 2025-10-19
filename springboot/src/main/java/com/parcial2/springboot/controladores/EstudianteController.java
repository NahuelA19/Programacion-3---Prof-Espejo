package com.parcial2.springboot.controladores;


import com.parcial2.springboot.entidades.Curso;
import com.parcial2.springboot.entidades.Estudiante;
import com.parcial2.springboot.servicios.CursoService;
import com.parcial2.springboot.servicios.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;
    @Autowired
    private CursoService cursoService;


    //Get:

    //Lista todos los alumnos:

    @GetMapping
    public List<Estudiante> obtenerEstudiantes(){
        return estudianteService.obtenerTodosLosEstudiantes();
    }

    //Lista cursos por estudiante especifico:

    @GetMapping("/{estudianteId}/cursos")

    public List<Curso> listarPorCurso(@PathVariable Long estudianteId){
        return cursoService.obtenerCursosPorEstudiante(estudianteId);
    }

    //Post:

    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante){
        return estudianteService.guardarCambiosEstudiante(estudiante);
    }










}
