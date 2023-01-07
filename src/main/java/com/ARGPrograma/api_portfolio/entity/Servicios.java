
package com.ARGPrograma.api_portfolio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Servicios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String servicio;
    private String img;
    private String descripcion;
    
    
    public Servicios(Long id, String servicio, String img, String descripcion) {
        this.id = id;
        this.servicio = servicio;
        this.img = img;
        this.descripcion = descripcion;
    }


    public Servicios() {
    }
}
