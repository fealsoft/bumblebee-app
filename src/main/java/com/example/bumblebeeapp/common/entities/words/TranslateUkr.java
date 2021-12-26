package com.example.bumblebeeapp.common.entities.words;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TranslateUkr {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "DetailLevelEngId")
    private DetailLevelEng detailLevelEng;

    @ManyToOne
    @JoinColumn(name = "WordUkrId")
    private WordUkr wordUkr;

    public TranslateUkr(Integer id, DetailLevelEng detailLevelEng, WordUkr wordUkr) {
        this.id = id;
        this.detailLevelEng = detailLevelEng;
        this.wordUkr = wordUkr;
    }

    public TranslateUkr() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DetailLevelEng getDetailLevelEng() {
        return detailLevelEng;
    }

    public void setDetailLevelEng(DetailLevelEng detailLevelEng) {
        this.detailLevelEng = detailLevelEng;
    }

    public WordUkr getWordUkr() {
        return wordUkr;
    }

    public void setWordUkr(WordUkr wordUkr) {
        this.wordUkr = wordUkr;
    }

    @Override
    public String toString() {
        return "TranslateUkr{" +
                "id=" + id +
                ", detailLevelEng=" + detailLevelEng +
                ", wordUkr=" + wordUkr +
                '}';
    }
}
