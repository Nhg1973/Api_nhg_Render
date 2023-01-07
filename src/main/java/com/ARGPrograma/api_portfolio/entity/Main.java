
package com.ARGPrograma.api_portfolio.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Main implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    private String titulo;
    private String img;
    private String p;
    private String a;
    
    public Main(Long id, String titulo, String img, String p, String a) {
        Id = id;
        this.titulo = titulo;
        this.img = img;
        this.p = p;
        this.a = a;
    }
    public Main() {
    }
}