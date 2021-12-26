package com.example.bumblebeeapp.common.entities.words;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class NounExtEng {

    @Id
    private Integer id;

    @OneToOne
    @JoinColumn(name = "POSLevelEngId")
    POSLevelEng posLevelEng;

    private String Plural;
    private String PluralAlternative;
    private String PluralAlternativeSecond;

    public NounExtEng(Integer id, POSLevelEng posLevelEng, String plural, String pluralAlternative, String pluralAlternativeSecond) {
        this.id = id;
        this.posLevelEng = posLevelEng;
        Plural = plural;
        PluralAlternative = pluralAlternative;
        PluralAlternativeSecond = pluralAlternativeSecond;
    }

    public NounExtEng() {

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

    public String getPlural() {
        return Plural;
    }

    public void setPlural(String plural) {
        Plural = plural;
    }

    public String getPluralAlternative() {
        return PluralAlternative;
    }

    public void setPluralAlternative(String pluralAlternative) {
        PluralAlternative = pluralAlternative;
    }

    public String getPluralAlternativeSecond() {
        return PluralAlternativeSecond;
    }

    public void setPluralAlternativeSecond(String pluralAlternativeSecond) {
        PluralAlternativeSecond = pluralAlternativeSecond;
    }

    @Override
    public String toString() {
        return "NounExtEng{" +
                "id=" + id +
                ", posLevelEng=" + posLevelEng +
                ", Plural='" + Plural + '\'' +
                ", PluralAlternative='" + PluralAlternative + '\'' +
                ", PluralAlternativeSecond='" + PluralAlternativeSecond + '\'' +
                '}';
    }
}
