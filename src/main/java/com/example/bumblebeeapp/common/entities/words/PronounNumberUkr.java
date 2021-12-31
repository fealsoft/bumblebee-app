package com.example.bumblebeeapp.common.entities.words;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PronounNumberUkr {

    @Id
    private Integer id;
    private String name;

    public PronounNumberUkr(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public PronounNumberUkr() {

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
        return "PronounNumberUkr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
