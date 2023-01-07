
package com.ARGPrograma.api_portfolio.repository;

import com.ARGPrograma.api_portfolio.entity.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ServicioRepository extends JpaRepository<Servicios, Long> {
    
}