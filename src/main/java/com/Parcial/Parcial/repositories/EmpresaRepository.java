package com.Parcial.Parcial.repositories;

import com.Parcial.Parcial.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {
}
