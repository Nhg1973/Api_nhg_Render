
package com.ARGPrograma.api_portfolio.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Habilidades implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String lenguaje;
    private int progreso;

    public Habilidades(Long id, String lenguaje, int progreso) {
        this.id = id;
        this.lenguaje = lenguaje;
        this.progreso = progreso;
    }
    
    public Habilidades() {
    }
}
