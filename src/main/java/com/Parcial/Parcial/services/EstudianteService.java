package com.Parcial.Parcial.services;

import com.Parcial.Parcial.model.Estudiante;
import com.Parcial.Parcial.model.Practica;
import com.Parcial.Parcial.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> getAllEstudiantes(){
        return estudianteRepository.findAll();

    }
    public Estudiante save(Estudiante estudiante, Practica practica){
        estudiante.setPractica(practica);
        return estudianteRepository.save(estudiante);
    }
    public Estudiante findById(Integer id){
        return estudianteRepository.findById(id).orElse(null);
    }
    public List<Estudiante> findByPracticaId(Integer practicaId){
        return estudianteRepository.findByPracticaId(practicaId);
    }
}
