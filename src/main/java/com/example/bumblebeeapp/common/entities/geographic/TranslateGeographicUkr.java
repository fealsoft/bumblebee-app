package com.example.bumblebeeapp.common.entities.geographic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TranslateGeographicUkr {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "GeographicEngId")
    private GeographicEng geographicEng;

    @ManyToOne
    @JoinColumn(name = "GeographicUkrId")
    private GeographicUkr geographicUkr;

    public TranslateGeographicUkr(Integer id, GeographicEng geographicEng, GeographicUkr geographicUkr) {
        this.id = id;
        this.geographicEng = geographicEng;
        this.geographicUkr = geographicUkr;
    }

    public TranslateGeographicUkr() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GeographicEng getGeographicEng() {
        return geographicEng;
    }

    public void setGeographicEng(GeographicEng geographicEng) {
        this.geographicEng = geographicEng;
    }

    public GeographicUkr getGeographicUkr() {
        return geographicUkr;
    }

    public void setGeographicUkr(GeographicUkr geographicUkr) {
        this.geographicUkr = geographicUkr;
    }

    @Override
    public String toString() {
        return "TranslateGeographicUkr{" +
                "id=" + id +
                ", geographicEng=" + geographicEng +
                ", geographicUkr=" + geographicUkr +
                '}';
    }
}
