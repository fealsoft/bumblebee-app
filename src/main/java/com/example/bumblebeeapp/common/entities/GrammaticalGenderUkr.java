package com.example.bumblebeeapp.common.entities;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GrammaticalGenderUkr {

    @Id
    private Integer id;
    private String name;

    public GrammaticalGenderUkr(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public GrammaticalGenderUkr() {

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
        return "GrammaticalGenderUkr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
