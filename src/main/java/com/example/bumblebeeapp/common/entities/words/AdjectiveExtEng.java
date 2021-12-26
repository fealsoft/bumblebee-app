package com.example.bumblebeeapp.common.entities.words;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AdjectiveExtEng {

    @Id
    private Integer id;

    @OneToOne
    @JoinColumn(name = "POSLevelEngId")
    private POSLevelEng posLevelEng;

    private String Comparative;
    private String Superlative;

    public AdjectiveExtEng(Integer id, POSLevelEng posLevelEng, String comparative, String superlative) {
        this.id = id;
        this.posLevelEng = posLevelEng;
        Comparative = comparative;
        Superlative = superlative;
    }

    public AdjectiveExtEng() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public POSLevelEng getPosLevelEng() {
        return posLevelEng;
    }

    public void setPosLevelEng(POSLevelEng posLevelEng) {
        this.posLevelEng = posLevelEng;
    }

    public String getComparative() {
        return Comparative;
    }

    public void setComparative(String comparative) {
        Comparative = comparative;
    }

    public String getSuperlative() {
        return Superlative;
    }

    public void setSuperlative(String superlative) {
        Superlative = superlative;
    }

    @Override
    public String toString() {
        return "AdjectiveExtEng{" +
                "id=" + id +
                ", posLevelEng=" + posLevelEng +
                ", Comparative='" + Comparative + '\'' +
                ", Superlative='" + Superlative + '\'' +
                '}';
    }
}
