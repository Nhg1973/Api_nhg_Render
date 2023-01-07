
package com.ARGPrograma.api_portfolio.service;

import com.ARGPrograma.api_portfolio.entity.Habilidades;

public interface IHabildadesServicio {

    public Habilidades findById(Long id);

    public void save(Habilidades editHabi);

    public void delete(Long id);


    
}
