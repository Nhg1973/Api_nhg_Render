
package com.ARGPrograma.api_portfolio.security.repository;

import com.ARGPrograma.api_portfolio.security.entity.Rol;
import com.ARGPrograma.api_portfolio.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
