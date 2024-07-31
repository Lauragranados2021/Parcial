package com.Parcial.Parcial.controllers;

import com.Parcial.Parcial.model.Docente;
import com.Parcial.Parcial.model.Practica;
import com.Parcial.Parcial.model.curso;
import com.Parcial.Parcial.responses.ResponseHandler;
import com.Parcial.Parcial.services.CursoService;
import com.Parcial.Parcial.services.DocenteService;
import com.Parcial.Parcial.services.PracticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;
    @Autowired
    private DocenteService docenteService;
    @Autowired
    private PracticaService practicaService;

    @GetMapping("/")
    public ResponseEntity<Object> findAll(){
        List<curso> response = cursoService.getAllCursos();
        return ResponseHandler.generateResponse("Listado de cursos", HttpStatus.FOUND, response);
    }
    @PostMapping("/{idDocente}/{idPractica}")
    public ResponseEntity<Object> save(@RequestBody curso curso, @PathVariable Integer idDocente,@PathVariable Integer idPractica){
        Docente docente=docenteService.findById(idDocente);
        Practica practica=practicaService.findById(idPractica);
        curso response = cursoService.save(curso,docente,practica);
        return ResponseHandler.generateResponse("Curso guardado", HttpStatus.CREATED, response);
    }
}
