package com.svasa.boot.mvc.samplewebbootmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Country {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String capital;

    public Country() {
        super();
    }
    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

}
