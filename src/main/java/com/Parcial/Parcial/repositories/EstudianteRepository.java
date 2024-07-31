package com.Parcial.Parcial.repositories;

import com.Parcial.Parcial.model.Estudiante;
import com.Parcial.Parcial.model.Practica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Integer> {
    @Query("SELECT e FROM Estudiante e WHERE e.practica.id = :practicaId")
    List<Estudiante> findByPracticaId(Integer practicaId);

}
