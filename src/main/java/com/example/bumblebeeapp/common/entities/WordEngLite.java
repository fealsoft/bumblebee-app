package com.example.bumblebeeapp.common.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Lite version of WordEng
 */
@Entity
@Table(name = "WordEng")
public class WordEngLite {

    @Id
    private Integer id;
    private String name;

    public WordEngLite(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public WordEngLite() {

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
        return "WordEngLite{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
