package com.Parcial.Parcial.repositories;

import com.Parcial.Parcial.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Integer> {
}
