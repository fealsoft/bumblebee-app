package com.example.bumblebeeapp.common.entities.words;


import javax.persistence.*;

@Entity
public class WordUkr {

    @Id
    private Integer id;
    private String name;

    @ManyToOne()
    @JoinColumn(name = "partOfSpeechUkrId")
    private PartOfSpeechUkr partOfSpeechUkr;

    @ManyToOne()
    @JoinColumn(name = "GrammaticalGenderUkrId")
    private GrammaticalGenderUkr grammaticalGenderUkr;

    @ManyToOne()
    @JoinColumn(name = "GrammaticalAnimacyUkrId")
    private GrammaticalAnimacyUkr grammaticalAnimacyUkr;

    public WordUkr(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public WordUkr() {

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
