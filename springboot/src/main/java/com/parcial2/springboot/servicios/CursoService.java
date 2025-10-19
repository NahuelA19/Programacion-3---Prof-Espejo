package com.parcial2.springboot.servicios;

import com.parcial2.springboot.entidades.Curso;
import com.parcial2.springboot.entidades.Estudiante;
import com.parcial2.springboot.entidades.Profesor;
import com.parcial2.springboot.repositorios.CursoRepository;
import com.parcial2.springboot.repositorios.EstudianteRepository;
import com.parcial2.springboot.repositorios.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private EstudianteRepository estudianteRepository;

/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Aca van los metodos:

    //Lista todos los cursos:

    public List<Curso> obtenerTodosLosCursos(){

        return cursoRepository.findAll();
    }
// ..........................................................................................................................//

    //Para Crear un curso (el ejercicio pedia que un curso tenia que tener asignado a un profesor).
    public Curso crearUnCurso(Curso curso,Long profesorId){


        Profesor profesor = profesorRepository.findById(profesorId).
                                                orElseThrow(() -> new RuntimeException
                                                        ("El profesor que se esta buscando por ese id  no fue encontrado por el id: " + profesorId));

       curso.setProfesor(profesor);

        return cursoRepository.save(curso);
    }

    //......................................................................................................................................//

    //Asignar un curso a un estudiante por id:

    public Curso asignarUnCurso(Long cursoId,Long estudianteId){

        //Se busca primero el curso:

        Curso curso = cursoRepository.findById(cursoId).
                orElseThrow(() -> new RuntimeException
                        ("El curso que se esta buscando no fue encontrado por el id:  " + cursoId));


        //Se busca ahora al estudiante:

        Estudiante estudiante = estudianteRepository.findById(estudianteId).
                orElseThrow(() -> new RuntimeException
                        ("El estudiante que se esta buscando no fue encontrado por ese id:  " + estudianteId));


        curso.getEstudiantes().add(estudiante);

        return cursoRepository.save(curso);
    }

    //......................................................................................................................................//

    //Obtener los cursos de un estudiante por su id:

    public List<Curso> obtenerCursosPorEstudiante(Long estudianteId){


        //Se busca al estudiante en cuestion:

        Estudiante estudiante = estudianteRepository.findById(estudianteId).
                orElseThrow(() -> new RuntimeException
                        ("El alumno que se esta buscando no fue encontrado por el id:  " + estudianteId));

        //Se devuelve la lista de cursos:
        return estudiante.getCursos();
    }


}
