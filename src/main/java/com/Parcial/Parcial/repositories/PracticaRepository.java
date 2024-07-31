package com.Parcial.Parcial.repositories;

import com.Parcial.Parcial.model.Practica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface PracticaRepository extends JpaRepository<Practica, Integer> {
    @Query("SELECT p FROM Practica p JOIN p.docente d WHERE d.NumIdentificacion = :numIdentificacion")
    List<Practica> findPracticasByDocenteNumIdentificacion(String numIdentificacion);
}
