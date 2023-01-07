
package com.ARGPrograma.api_portfolio.service;

import com.ARGPrograma.api_portfolio.entity.Habilidades;
import com.ARGPrograma.api_portfolio.repository.HabilidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabildadesServicio{

    @Autowired
    public HabilidadesRepository habiRepo;

    @Override
    public Habilidades findById(Long id) {
        Habilidades habili = habiRepo.findById(id).orElse(null);
        return habili;
    }

    @Override
    public void save(Habilidades editHabi) {
 
        habiRepo.save(editHabi);
        
    }

    @Override
    public void delete(Long id) {
        habiRepo.deleteById(id);
        
    }


        
}
