
package com.ARGPrograma.api_portfolio.repository;

import com.ARGPrograma.api_portfolio.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PersonaRepository extends JpaRepository<Persona ,Long>{

    Persona findByNombre(String nombre);
}
