package com.example.bumblebeeapp.common.entities.words;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PronounGenderEng {

    @Id
    private Integer id;
    private String name;

    public PronounGenderEng(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    public PronounGenderEng() {

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
        return "PronounGenderEng{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
