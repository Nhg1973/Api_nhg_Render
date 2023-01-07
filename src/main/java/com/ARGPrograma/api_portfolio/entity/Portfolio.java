
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
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String img;
    private String h4;
    private String target;

    public Portfolio(Long id, String img, String h4, String target) {
        this.id = id;
        this.img = img;
        this.h4 = h4;
        this.target = target;
    }
    
    public Portfolio() {
    }
    
}
