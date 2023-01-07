
package com.ARGPrograma.api_portfolio.service;

import com.ARGPrograma.api_portfolio.entity.Persona;
import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersonas();

    public void savePersona(Persona  perso);

    public void deletePersona (Long id);

    public Persona findPersona( Long id);

    public Persona findBynombre(String nombre);
    

 
}