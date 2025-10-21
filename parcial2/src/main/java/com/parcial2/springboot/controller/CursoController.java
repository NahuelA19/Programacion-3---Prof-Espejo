package com.parcial2.springboot.controller;

import com.parcial2.springboot.dto.CursoDTO;
import com.parcial2.springboot.entity.Curso;
import com.parcial2.springboot.mapper.CursoMapper;
import com.parcial2.springboot.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/cursos")
@CrossOrigin("*")
public class CursoController {

    @Autowired
    private CursoService service; // Inyectamos la interfaz del Servicio

    // Listar cursos
    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            // Se obtienen las entidades
            List<Curso> cursos = service.findAll();

            // Traducimos la lista
            List<CursoDTO> cursosDTO = cursos
                    .stream()
                    .map(CursoMapper::toDTO)
                    .collect(Collectors.toList());

            // Devolvemos la lista
            return ResponseEntity.ok(cursosDTO);

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // Crea nuevos cursos
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Curso curso) {
        try {
            // Guardamos la entidad
            Curso cursoGuardado = service.save(curso);

            // Los traducimos
            CursoDTO dto = CursoMapper.toDTO(cursoGuardado);

            // Devolvemos el DTO
            return ResponseEntity.ok(dto);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // Asigna estudiantes
    @PutMapping("/{cursoId}/asignar-estudiante/{estudianteId}")
    public ResponseEntity<?> asignarEstudiante(
            @PathVariable Long cursoId,
            @PathVariable Long estudianteId) {
        try {
            // Llamamos al servicio
            Curso cursoActualizado = service.asignarEstudiante(cursoId, estudianteId);

            // Los traducimos
            CursoDTO dto = CursoMapper.toDTO(cursoActualizado);

            // Y los devolvemos
            return ResponseEntity.ok(dto);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // Cursos por estudiante
    @GetMapping("/por-estudiante/{estudianteId}")
    public ResponseEntity<?> getCursosPorEstudiante(@PathVariable Long estudianteId) {
        try {
            // Obtenemos las entidades
            List<Curso> cursos = service.findCursosByEstudiante(estudianteId);

            // Se "traducen" a DTOs
            List<CursoDTO> cursosDTO = cursos
                    .stream()
                    .map(CursoMapper::toDTO)
                    .collect(Collectors.toList());

            // 3. Los devolvemos:
            return ResponseEntity.ok(cursosDTO);

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}