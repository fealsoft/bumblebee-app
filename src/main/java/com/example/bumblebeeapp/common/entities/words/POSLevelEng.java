package com.example.bumblebeeapp.common.entities.words;


import javax.persistence.*;
import java.util.Set;

@Entity
public class POSLevelEng {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "PartOfSpeechEngId")
    private PartOfSpeechEng partOfSpeechEng;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "POSLevelEngId")
    private Set<DetailLevelEng> detailLevelEngs;

    public POSLevelEng(Integer id, PartOfSpeechEng partOfSpeechEng, Set<DetailLevelEng> detailLevelEngs) {
        this.id = id;
        this.partOfSpeechEng = partOfSpeechEng;
        this.detailLevelEngs = detailLevelEngs;
    }

    public POSLevelEng() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PartOfSpeechEng getPartOfSpeechEng() {
        return partOfSpeechEng;
    }

    public void setPartOfSpeechEng(PartOfSpeechEng partOfSpeechEng) {
        this.partOfSpeechEng = partOfSpeechEng;
    }

    public Set<DetailLevelEng> getDetailLevelEngs() {
        return detailLevelEngs;
    }

    public void setDetailLevelEngs(Set<DetailLevelEng> detailLevelEngs) {
        this.detailLevelEngs = detailLevelEngs;
    }

    @Override
    public String toString() {
        return "POSLevelEng{" +
                "id=" + id +
                ", partOfSpeechEng=" + partOfSpeechEng +
                ", detailLevelEngs=" + detailLevelEngs +
                '}';
    }
}
