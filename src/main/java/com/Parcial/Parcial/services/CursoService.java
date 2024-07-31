package com.Parcial.Parcial.services;

import com.Parcial.Parcial.model.Docente;
import com.Parcial.Parcial.model.Practica;
import com.Parcial.Parcial.model.curso;
import com.Parcial.Parcial.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    @Autowired
   private CursoRepository cursoRepository;

    public List<curso> getAllCursos(){
        return cursoRepository.findAll();
    }
    public curso save(curso curso, Docente docente, Practica practica){
        curso.setDocente(docente);
        curso.setPractica(practica);
        return cursoRepository.save(curso);
    }
}
