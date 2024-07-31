package com.Parcial.Parcial.controllers;

import com.Parcial.Parcial.model.Estudiante;
import com.Parcial.Parcial.model.Practica;
import com.Parcial.Parcial.responses.ResponseHandler;
import com.Parcial.Parcial.services.EstudianteService;
import com.Parcial.Parcial.services.PracticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    EstudianteService estudianteService;
    @Autowired
    PracticaService practicaService;

    @GetMapping("/")
   public ResponseEntity<Object> findAll(){
        List<Estudiante> estudiante= estudianteService.getAllEstudiantes();
        return ResponseHandler.generateResponse("Listado de estudiantes", HttpStatus.FOUND,estudiante);
    }

    @PostMapping("/{idPractica}")
    public ResponseEntity<Object> save(@RequestBody Estudiante estudiante, @PathVariable Integer idPractica){
        Practica practica= practicaService.findById(idPractica);

        Estudiante response = estudianteService.save(estudiante,practica);
        return ResponseHandler.generateResponse("Estudiante guardado", HttpStatus.CREATED,response);
    }
    @GetMapping("/practica/{idPractica}")
    public ResponseEntity<Object> findByPracticaId(@PathVariable Integer idPractica){
        List<Estudiante> estudiante= estudianteService.findByPracticaId(idPractica);
        return ResponseHandler.generateResponse("Listado de estudiantes por practica", HttpStatus.FOUND,estudiante);
    }
}
