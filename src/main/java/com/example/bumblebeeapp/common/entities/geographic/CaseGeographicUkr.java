package com.example.bumblebeeapp.common.entities.geographic;

import javax.persistence.*;


@Entity
public class CaseGeographicUkr {

    @Id
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GeographicUkrId")
    private GeographicUkr geographicUkr;

    private String nominative;
    private String genitive;
    private String dative;
    private String accusative;
    private String instrumental;
    private String prepositional;
    private String vocative;

    public CaseGeographicUkr(Integer id, GeographicUkr geographicUkr, String nominative, String genitive, String dative, String accusative, String instrumental, String prepositional, String vocative) {
        this.id = id;
        this.geographicUkr = geographicUkr;
        this.nominative = nominative;
        this.genitive = genitive;
        this.dative = dative;
        this.accusative = accusative;
        this.instrumental = instrumental;
        this.prepositional = prepositional;
        this.vocative = vocative;
    }

    public CaseGeographicUkr() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GeographicUkr getGeographicUkr() {
        return geographicUkr;
    }

    public void setGeographicUkr(GeographicUkr geographicUkr) {
        this.geographicUkr = geographicUkr;
    }

    public String getNominative() {
        return nominative;
    }

    public void setNominative(String nominative) {
        this.nominative = nominative;
    }

    public String getGenitive() {
        return genitive;
    }

    public void setGenitive(String genitive) {
        this.genitive = genitive;
    }

    public String getDative() {
        return dative;
    }

    public void setDative(String dative) {
        this.dative = dative;
    }

    public String getAccusative() {
        return accusative;
    }

    public void setAccusative(String accusative) {
        this.accusative = accusative;
    }

    public String getInstrumental() {
        return instrumental;
    }

    public void setInstrumental(String instrumental) {
        this.instrumental = instrumental;
    }

    public String getPrepositional() {
        return prepositional;
    }

    public void setPrepositional(String prepositional) {
        this.prepositional = prepositional;
    }

    public String getVocative() {
        return vocative;
    }

    public void setVocative(String vocative) {
        this.vocative = vocative;
    }

    @Override
    public String toString() {
        return "CaseGeographicUkr{" +
                "id=" + id +
                ", geographicUkrId=" + geographicUkr.getId() +
                ", nominative='" + nominative + '\'' +
                ", genitive='" + genitive + '\'' +
                ", dative='" + dative + '\'' +
                ", accusative='" + accusative + '\'' +
                ", instrumental='" + instrumental + '\'' +
                ", prepositional='" + prepositional + '\'' +
                ", vocative='" + vocative + '\'' +
                '}';
    }
}
