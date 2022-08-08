package bumblebeeapp.common.entities.words;

import javax.persistence.*;

@Entity
public class PronounPropertiesEng {

    @Id
    private Integer id;

    @OneToOne
    @JoinColumn(name = "POSLevelEngId")
    POSLevelEng posLevelEng;

    @Enumerated(EnumType.STRING)
    private PronounTypeEng pronounTypeEng;

    @Enumerated(EnumType.STRING)
    private PronounNumberEng pronounNumberEng;

    @Enumerated(EnumType.STRING)
    private PronounGenderEng pronounGenderEng;

    @ManyToOne
    @JoinColumn(name = "PronounPersonEngId")
    private PronounPersonEng pronounPersonEng;

    public PronounPropertiesEng(Integer id, POSLevelEng posLevelEng, PronounTypeEng pronounTypeEng, PronounNumberEng pronounNumberEng, PronounGenderEng pronounGenderEng, PronounPersonEng pronounPersonEng) {
        this.id = id;
        this.posLevelEng = posLevelEng;
        this.pronounTypeEng = pronounTypeEng;
        this.pronounNumberEng = pronounNumberEng;
        this.pronounGenderEng = pronounGenderEng;
        this.pronounPersonEng = pronounPersonEng;
    }

    public PronounPropertiesEng() {

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

    public PronounTypeEng getPronounTypeEng() {
        return pronounTypeEng;
    }

    public void setPronounTypeEng(PronounTypeEng pronounTypeEng) {
        this.pronounTypeEng = pronounTypeEng;
    }

    public PronounNumberEng getPronounNumberEng() {
        return pronounNumberEng;
    }

    public void setPronounNumberEng(PronounNumberEng pronounNumberEng) {
        this.pronounNumberEng = pronounNumberEng;
    }

    public PronounGenderEng getPronounGenderEng() {
        return pronounGenderEng;
    }

    public void setPronounGenderEng(PronounGenderEng pronounGenderEng) {
        this.pronounGenderEng = pronounGenderEng;
    }

    public PronounPersonEng getPronounPersonEng() {
        return pronounPersonEng;
    }

    public void setPronounPersonEng(PronounPersonEng pronounPersonEng) {
        this.pronounPersonEng = pronounPersonEng;
    }

    @Override
    public String toString() {
        return "PronounPropertiesEng{" +
                "id=" + id +
                ", posLevelEng=" + posLevelEng +
                ", pronounTypeEng=" + pronounTypeEng +
                ", pronounNumberEng=" + pronounNumberEng +
                ", pronounGenderEng=" + pronounGenderEng +
                ", pronounPersonEng=" + pronounPersonEng +
                '}';
    }
}
