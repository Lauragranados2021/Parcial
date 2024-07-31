package com.Parcial.Parcial.controllers;

import com.Parcial.Parcial.model.Empresa;
import com.Parcial.Parcial.responses.ResponseHandler;
import com.Parcial.Parcial.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaControllers {
    @Autowired
    EmpresaService empresaService;


    @GetMapping("/")
    public ResponseEntity<Object> findAll(){
        List<Empresa> response = empresaService.findAll();
        return ResponseHandler.generateResponse("Listado de empresas", HttpStatus.FOUND, response);
    }
    @PostMapping("/")
    public ResponseEntity<Object> save(Empresa empresa){
        Empresa response = empresaService.save(empresa);
        return ResponseHandler.generateResponse("Empresa guardada", HttpStatus.CREATED, response);
    }
}
