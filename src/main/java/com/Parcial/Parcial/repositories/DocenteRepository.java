package com.Parcial.Parcial.repositories;

import com.Parcial.Parcial.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente,Integer> {
}
