
package com.ARGPrograma.api_portfolio.repository;

import com.ARGPrograma.api_portfolio.entity.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HabilidadesRepository extends JpaRepository <Habilidades, Long>{
    
}

