package com.example.bumblebeeapp.common.entities.words;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DetailLevelEng {

    @Id
    private Integer id;
    private String comment;

    public DetailLevelEng(Integer id, String comment) {
        this.id = id;
        this.comment = comment;
    }

    public DetailLevelEng() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "DetailLevelEng{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                '}';
    }
}
