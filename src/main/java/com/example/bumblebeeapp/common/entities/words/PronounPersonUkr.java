package com.example.bumblebeeapp.common.entities.words;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PronounPersonUkr {

    @Id
    private Integer id;
    private String name;

    public PronounPersonUkr(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public PronounPersonUkr() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PronounPersonUkr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
