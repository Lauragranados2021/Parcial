package com.Parcial.Parcial.controllers;

import com.Parcial.Parcial.model.Docente;
import com.Parcial.Parcial.model.Empresa;
import com.Parcial.Parcial.model.Practica;
import com.Parcial.Parcial.responses.ResponseHandler;
import com.Parcial.Parcial.services.DocenteService;
import com.Parcial.Parcial.services.EmpresaService;
import com.Parcial.Parcial.services.PracticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/practica")
public class PracticaControllers {
    @Autowired
    PracticaService practicaService;
    @Autowired
    EmpresaService empresaService;
    @Autowired
    DocenteService docenteService;

    @GetMapping("/")
    public ResponseEntity<Object> findAll(){
        List<Practica> response = practicaService.getAllPracticas();
        return ResponseHandler.generateResponse("Listado de practicas", HttpStatus.FOUND, response);
    }
    @PostMapping("/{idEmpresa}/{idDocente}")
    public ResponseEntity<Object> save(@RequestBody Practica practica,@PathVariable Integer idEmpresa,@PathVariable Integer idDocente){
Docente docente=docenteService.findById(idDocente);
        Empresa empresa = empresaService.findById(idEmpresa);
        Practica practice=practicaService.save(practica,empresa,docente);
        return ResponseHandler.generateResponse("Practica guardada", HttpStatus.CREATED, practice);
    }
    @GetMapping("/docente/{idDocente}")
  public ResponseEntity<Object> findPracticasByDocenteId(@PathVariable String idDocente){
        List<Practica> response = practicaService.findPracticasByDocenteId(idDocente);
        return ResponseHandler.generateResponse("Listado de practicas por docente", HttpStatus.FOUND, response);
    }
    @GetMapping("/dateRange/{startDate}/{endDate}")
   public ResponseEntity<Object> findPracticasByDateRange( @PathVariable("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date startDate,
                                                           @PathVariable("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date endDate)
          {
            List<Practica> practicas= practicaService.findPracticasByDateRange(startDate, endDate);
            return ResponseHandler.generateResponse("Listado de practicas por rango de fechas", HttpStatus.FOUND, practicas);
    }
}
