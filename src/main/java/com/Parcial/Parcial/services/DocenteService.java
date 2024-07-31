package com.Parcial.Parcial.services;

import com.Parcial.Parcial.model.Docente;
import com.Parcial.Parcial.repositories.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService{
    @Autowired
    private DocenteRepository docenteRepository;

    public List<Docente> getAllDocentes(){
        return docenteRepository.findAll();
    }
    public Docente save(Docente docente){
        return docenteRepository.save(docente);
    }
    public Docente findById(Integer id){
        return docenteRepository.findById(id).orElse(null);
    }
}
