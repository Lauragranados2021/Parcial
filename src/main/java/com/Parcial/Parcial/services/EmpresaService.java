package com.Parcial.Parcial.services;

import com.Parcial.Parcial.model.Empresa;
import com.Parcial.Parcial.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;
    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }
    public Empresa save(Empresa empresa){
        return empresaRepository.save(empresa);
    }
    public Empresa findById(Integer id){
        return empresaRepository.findById(id).orElse(null);
    }
}
