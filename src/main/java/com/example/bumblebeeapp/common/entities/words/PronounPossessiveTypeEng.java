package com.example.bumblebeeapp.common.entities.words;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PronounPossessiveTypeEng {

    @Id
    private Integer id;
    private String name;

    public PronounPossessiveTypeEng(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public PronounPossessiveTypeEng() {

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
        return "PronounPossessiveTypeEng{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
