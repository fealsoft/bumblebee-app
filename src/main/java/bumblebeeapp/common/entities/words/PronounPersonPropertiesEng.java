package bumblebeeapp.common.entities.words;

import javax.persistence.*;

@Entity
public class PronounPersonPropertiesEng {

    @Id
    private Integer id;

    @OneToOne
    @JoinColumn(name = "POSLevelEngId")
    POSLevelEng posLevelEng;

    @Enumerated(EnumType.STRING)
    private PronounPersonTypeEng pronounPersonTypeEng;

    @ManyToOne
    @JoinColumn(name = "PronounNumberEngId")
    private PronounNumberEng pronounNumberEng;

    @Enumerated(EnumType.STRING)
    private PronounGenderEng pronounGenderEng;

    @ManyToOne
    @JoinColumn(name = "PronounPersonEngId")
    private PronounPersonEng pronounPersonEng;

    public PronounPersonPropertiesEng(Integer id, POSLevelEng posLevelEng, PronounPersonTypeEng pronounPersonTypeEng, PronounNumberEng pronounNumberEng, PronounGenderEng pronounGenderEng, PronounPersonEng pronounPersonEng) {
        this.id = id;
        this.posLevelEng = posLevelEng;
        this.pronounPersonTypeEng = pronounPersonTypeEng;
        this.pronounNumberEng = pronounNumberEng;
        this.pronounGenderEng = pronounGenderEng;
        this.pronounPersonEng = pronounPersonEng;
    }

    public PronounPersonPropertiesEng() {

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

    public PronounPersonTypeEng getPronounPersonTypeEng() {
        return pronounPersonTypeEng;
    }

    public void setPronounPersonTypeEng(PronounPersonTypeEng pronounPersonTypeEng) {
        this.pronounPersonTypeEng = pronounPersonTypeEng;
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
        return "PronounPersonPropertiesEng{" +
                "id=" + id +
                ", posLevelEng=" + posLevelEng +
                ", pronounPersonTypeEng=" + pronounPersonTypeEng +
                ", pronounNumberEng=" + pronounNumberEng +
                ", pronounGenderEng=" + pronounGenderEng +
                ", pronounPersonEng=" + pronounPersonEng +
                '}';
    }
}
