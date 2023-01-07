
package com.ARGPrograma.api_portfolio.controller;

import com.ARGPrograma.api_portfolio.entity.Habilidades;
import com.ARGPrograma.api_portfolio.entity.Main;
import com.ARGPrograma.api_portfolio.entity.Persona;
import com.ARGPrograma.api_portfolio.service.IHabildadesServicio;
import com.ARGPrograma.api_portfolio.service.IMainService;
import com.ARGPrograma.api_portfolio.service.IPersonaService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonaController {
    
@Autowired
private IPersonaService interPersona;

@Autowired
private IMainService interMain;

@Autowired
private IHabildadesServicio interHabi; 

@GetMapping("/portfolio")
public List<Persona> listPersona()
{
    return interPersona.getPersonas();
}

@GetMapping("/portfolio/{nombre}")
public  Persona getPersonas(@PathVariable String nombre)
{
    return interPersona.findBynombre(nombre);  
}

@PostMapping("/persona/crear")
public Persona createStudent(@RequestBody Persona perso)
{
    interPersona.savePersona(perso);

    return perso;
}

@DeleteMapping("/persona/borrar/{id}")
public String borrarStudent(@PathVariable Long id)
{
    interPersona.deletePersona(id);
    return "Persona borrada";
}

@PostMapping("/main/crear")
public Main createCabecera(@RequestBody Main main)
{
    interMain.saveMain(main);

    return main;
}

/**
     * @param id
     * @param habilidad
 * @return
 */
@PostMapping("/habilidades/modificar/{id}")
public Habilidades modificarHabilidad(@PathVariable("id")Long id, @RequestBody Habilidades habilidad)
{
 Habilidades editHabi = interHabi.findById(id);
 editHabi.setProgreso(habilidad.getProgreso());
 interHabi.save(editHabi);

 return editHabi;
}

@GetMapping("/habilidad/borrar/{id}")
public void borrarHabilidades(@PathVariable("id")Long id)
{
    interHabi.delete(id);
}

@PostMapping("/habilidad/crear/{nombre}")
public Persona createHabilidad(@RequestBody Habilidades habi, @PathVariable String nombre)
{
    interHabi.save(habi);
    Persona perso = getPersonas(nombre);

    perso.Habilidades.add(0, habi);
    createStudent(perso);

    return (perso);
}

}