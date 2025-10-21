package com.parcial2.springboot.controller;

import com.parcial2.springboot.entity.Profesor;
import com.parcial2.springboot.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/profesores")
@CrossOrigin("*")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService; //Inyeccion de la interfaz

    //Lista los profesores:
    @GetMapping("")
    public ResponseEntity<?> getAll (){
        try {
            return ResponseEntity.ok(profesorService.findAll());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //Crea el/los profesores:
    @PostMapping("") // Se accede con POST a /api/profesores
    public ResponseEntity<?> save(@RequestBody Profesor profesor) {
        try {
            return ResponseEntity.ok(profesorService.save(profesor));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
