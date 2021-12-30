package com.example.bumblebeeapp.common.entities.words;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PronounNumberEng {

    @Id
    private Integer id;
    private String name;

    public PronounNumberEng(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public PronounNumberEng() {

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
        return "PronounNumberEng{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}