package com.Parcial.Parcial.repositories;

import com.Parcial.Parcial.model.Practica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface PracticaRepository extends JpaRepository<Practica,Integer>{

}
