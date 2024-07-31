package com.Parcial.Parcial.controllers;

import com.Parcial.Parcial.model.Docente;
import com.Parcial.Parcial.responses.ResponseHandler;
import com.Parcial.Parcial.services.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class DocenteControllers {
    @Autowired
    DocenteService docenteService;

    @GetMapping("/")
  public ResponseEntity<Object> findAll(){
        List<Docente> response = docenteService.getAllDocentes();
        return ResponseHandler.generateResponse("Listado de docentes", HttpStatus.FOUND, response);
    }
    @PostMapping("/")
    public ResponseEntity<Object> save(@RequestBody Docente docente){
        Docente response = docenteService.save(docente);
        return ResponseHandler.generateResponse("Docente guardado", HttpStatus.CREATED, response);
    }

}
