package bumblebeeapp.common.entities.name;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TranslateNameUkr {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "NameEngId")
    @JsonIgnore
    private NameEng nameEng;

    @ManyToOne
    @JoinColumn(name = "NameUkrId")
    private NameUkr nameUkr;


    public TranslateNameUkr(Integer id, NameEng nameEng, NameUkr nameUkr) {
        this.id = id;
        this.nameEng = nameEng;
        this.nameUkr = nameUkr;
    }

    public TranslateNameUkr() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NameEng getNameEng() {
        return nameEng;
    }

    public void setNameEng(NameEng nameEng) {
        this.nameEng = nameEng;
    }

    public NameUkr getNameUkr() {
        return nameUkr;
    }

    public void setNameUkr(NameUkr nameUkr) {
        this.nameUkr = nameUkr;
    }

    @Override
    public String toString() {
        return "TranslateNameUkr{" +
                "id=" + id +
                ", nameEng=" + nameEng +
                ", nameUkr=" + nameUkr +
                '}';
    }
}
