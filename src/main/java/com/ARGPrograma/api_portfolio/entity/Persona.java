
package com.ARGPrograma.api_portfolio.entity;


import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private String jobtitle;
    private String contact;
    private String portfolios;
    private String imgAlex;

    @OneToOne
    private Main main;

    @OneToMany
    public List<Habilidades> Habilidades = new LinkedList<>();

    @OneToMany
    private List<Servicios> Servicios = new LinkedList<>();

    @OneToMany
    private List<Portfolio> Portfolio = new LinkedList<>();

  
    public Persona(Long id, String nombre, String apellido, String jobtitle, String contact, String portfolios,
            String imgAlex, Main main_id, List<com.ARGPrograma.api_portfolio.entity.Habilidades> habilidades,
            List<com.ARGPrograma.api_portfolio.entity.Servicios> servicios, List<com.ARGPrograma.api_portfolio.entity.Portfolio> portfolio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.jobtitle = jobtitle;
        this.contact = contact;
        this.portfolios = portfolios;
        this.imgAlex = imgAlex;
        this.main = main_id;
        Habilidades = habilidades;
        Servicios = servicios;
        Portfolio = portfolio;
    }


    public Persona() {
    }
    
}
