
package com.ARGPrograma.api_portfolio.repository;

import com.ARGPrograma.api_portfolio.entity.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Long>{
    
}
