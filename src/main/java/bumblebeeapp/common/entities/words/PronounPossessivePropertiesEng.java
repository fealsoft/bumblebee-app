package bumblebeeapp.common.entities.words;

import javax.persistence.*;

@Entity
public class PronounPossessivePropertiesEng {

    @Id
    private Integer id;

    @OneToOne
    @JoinColumn(name = "POSLevelEngId")
    POSLevelEng posLevelEng;

    @ManyToOne
    @JoinColumn(name = "PronounPossessiveTypeEngId")
    private PronounPossessiveTypeEng pronounPossessiveTypeEng;

    @ManyToOne
    @JoinColumn(name = "PronounNumberEngId")
    private PronounNumberEng pronounNumberEng;

    @ManyToOne
    @JoinColumn(name = "PronounGenderEngId")
    private PronounGenderEng pronounGenderEng;

    @ManyToOne
    @JoinColumn(name = "PronounPersonEngId")
    private PronounPersonEng pronounPersonEng;

    public PronounPossessivePropertiesEng(Integer id, POSLevelEng posLevelEng, PronounPossessiveTypeEng pronounPossessiveTypeEng, PronounNumberEng pronounNumberEng, PronounGenderEng pronounGenderEng, PronounPersonEng pronounPersonEng) {
        this.id = id;
        this.posLevelEng = posLevelEng;
        this.pronounPossessiveTypeEng = pronounPossessiveTypeEng;
        this.pronounNumberEng = pronounNumberEng;
        this.pronounGenderEng = pronounGenderEng;
        this.pronounPersonEng = pronounPersonEng;
    }


    public PronounPossessivePropertiesEng() {

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

    public PronounPossessiveTypeEng getPronounPossessiveTypeEng() {
        return pronounPossessiveTypeEng;
    }

    public void setPronounPossessiveTypeEng(PronounPossessiveTypeEng pronounPossessiveTypeEng) {
        this.pronounPossessiveTypeEng = pronounPossessiveTypeEng;
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
        return "PronounPossessivePropertiesEng{" +
                "id=" + id +
                ", posLevelEng=" + posLevelEng +
                ", pronounPossessiveTypeEng=" + pronounPossessiveTypeEng +
                ", pronounNumberEng=" + pronounNumberEng +
                ", pronounGenderEng=" + pronounGenderEng +
                ", pronounPersonEng=" + pronounPersonEng +
                '}';
    }
}
