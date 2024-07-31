package com.Parcial.Parcial.repositories;

import com.Parcial.Parcial.model.curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<curso,Integer> {
}
