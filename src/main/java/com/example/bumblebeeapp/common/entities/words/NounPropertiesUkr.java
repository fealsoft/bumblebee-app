package com.example.bumblebeeapp.common.entities.words;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class NounPropertiesUkr {

    @Id
    private Integer id;

    @ManyToOne()
    @JoinColumn(name = "GrammaticalGenderUkrId")
    private GrammaticalGenderUkr grammaticalGenderUkr;

    @ManyToOne()
    @JoinColumn(name = "GrammaticalAnimacyUkrId")
    private GrammaticalAnimacyUkr grammaticalAnimacyUkr;

    public NounPropertiesUkr(Integer id, GrammaticalGenderUkr grammaticalGenderUkr, GrammaticalAnimacyUkr grammaticalAnimacyUkr) {
        this.id = id;
        this.grammaticalGenderUkr = grammaticalGenderUkr;
        this.grammaticalAnimacyUkr = grammaticalAnimacyUkr;
    }

    public NounPropertiesUkr() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GrammaticalGenderUkr getGrammaticalGenderUkr() {
        return grammaticalGenderUkr;
    }

    public void setGrammaticalGenderUkr(GrammaticalGenderUkr grammaticalGenderUkr) {
        this.grammaticalGenderUkr = grammaticalGenderUkr;
    }

    public GrammaticalAnimacyUkr getGrammaticalAnimacyUkr() {
        return grammaticalAnimacyUkr;
    }

    public void setGrammaticalAnimacyUkr(GrammaticalAnimacyUkr grammaticalAnimacyUkr) {
        this.grammaticalAnimacyUkr = grammaticalAnimacyUkr;
    }

    @Override
    public String toString() {
        return "NounPropertiesUkr{" +
                "id=" + id +
                ", grammaticalGenderUkr=" + grammaticalGenderUkr +
                ", grammaticalAnimacyUkr=" + grammaticalAnimacyUkr +
                '}';
    }
}
