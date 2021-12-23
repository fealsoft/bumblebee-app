package com.example.bumblebeeapp.common.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("WordUkr")
public class WordUkr {

    @Id
    private Integer id;
    private String name;

    public WordUkr(Integer id, String name) {
        this.id = id;
        this.name = name;
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
        return "WordUkr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
