
package com.ARGPrograma.api_portfolio.security.service;

import com.ARGPrograma.api_portfolio.security.entity.Rol;
import com.ARGPrograma.api_portfolio.security.enums.RolNombre;
import com.ARGPrograma.api_portfolio.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
