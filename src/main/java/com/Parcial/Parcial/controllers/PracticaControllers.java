package com.Parcial.Parcial.controllers;

import com.Parcial.Parcial.model.Empresa;
import com.Parcial.Parcial.model.Practica;
import com.Parcial.Parcial.responses.ResponseHandler;
import com.Parcial.Parcial.services.EmpresaService;
import com.Parcial.Parcial.services.PracticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/practica")
public class PracticaControllers {
    @Autowired
    PracticaService practicaService;
    @Autowired
    EmpresaService empresaService;

    @GetMapping("/")
    public ResponseEntity<Object> findAll(){
        List<Practica> response = practicaService.getAllPracticas();
        return ResponseHandler.generateResponse("Listado de practicas", HttpStatus.FOUND, response);
    }
    @PostMapping("/{idEmpresa}")
    public ResponseEntity<Object> save(@RequestBody Practica practica,@PathVariable Integer idEmpresa){

        Empresa empresa = empresaService.findById(idEmpresa);
        Practica practice=practicaService.save(practica,empresa);
        return ResponseHandler.generateResponse("Practica guardada", HttpStatus.CREATED, practice);
    }
}
