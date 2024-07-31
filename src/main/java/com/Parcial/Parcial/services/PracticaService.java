package com.Parcial.Parcial.services;

import com.Parcial.Parcial.model.Docente;
import com.Parcial.Parcial.model.Empresa;
import com.Parcial.Parcial.model.Practica;
import com.Parcial.Parcial.repositories.PracticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class PracticaService {
    @Autowired
    private PracticaRepository practicaRepository;

    public List<Practica> getAllPracticas(){
        return practicaRepository.findAll();
    }
    public Practica save(Practica practica, Empresa empresa, Docente docente){
        practica.setDocente(docente);
        practica.setEmpresa(empresa);
        return practicaRepository.save(practica);
    }
    public Practica findById(Integer id){
        return practicaRepository.findById(id).orElse(null);
    }
    public List<Practica> findPracticasByDocenteId(String id){
        return practicaRepository.findPracticasByDocenteNumIdentificacion(id);
    }
    public List<Practica> findPracticasByDateRange(Date startDate, Date endDate){
        return practicaRepository.findPracticasByDateRange(startDate, endDate);
    }
}
