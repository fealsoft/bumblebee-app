package bumblebeeapp.common.entities.words;

import javax.persistence.*;

@Entity
public class CasePronounPersonalUkr {

    @Id
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WordUkrId")
    private WordUkr wordUkr;

    private String nominative;
    private String genitive;
    private String genitivePrepositional;
    private String dative;
    private String dativePrepositional;
    private String accusative;
    private String accusativePrepositional;
    private String instrumental;
    private String instrumentalPrepositional;
    private String prepositional;

    public CasePronounPersonalUkr(Integer id, WordUkr wordUkr, String nominative, String genitive, String genitivePrepositional, String dative, String dativePrepositional, String accusative, String accusativePrepositional, String instrumental, String instrumentalPrepositional, String prepositional) {
        this.id = id;
        this.wordUkr = wordUkr;
        this.nominative = nominative;
        this.genitive = genitive;
        this.genitivePrepositional = genitivePrepositional;
        this.dative = dative;
        this.dativePrepositional = dativePrepositional;
        this.accusative = accusative;
        this.accusativePrepositional = accusativePrepositional;
        this.instrumental = instrumental;
        this.instrumentalPrepositional = instrumentalPrepositional;
        this.prepositional = prepositional;
    }

    public CasePronounPersonalUkr() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public WordUkr getWordUkr() {
        return wordUkr;
    }

    public void setWordUkr(WordUkr wordUkr) {
        this.wordUkr = wordUkr;
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

    public String getGenitivePrepositional() {
        return genitivePrepositional;
    }

    public void setGenitivePrepositional(String genitivePrepositional) {
        this.genitivePrepositional = genitivePrepositional;
    }

    public String getDative() {
        return dative;
    }

    public void setDative(String dative) {
        this.dative = dative;
    }

    public String getDativePrepositional() {
        return dativePrepositional;
    }

    public void setDativePrepositional(String dativePrepositional) {
        this.dativePrepositional = dativePrepositional;
    }

    public String getAccusative() {
        return accusative;
    }

    public void setAccusative(String accusative) {
        this.accusative = accusative;
    }

    public String getAccusativePrepositional() {
        return accusativePrepositional;
    }

    public void setAccusativePrepositional(String accusativePrepositional) {
        this.accusativePrepositional = accusativePrepositional;
    }

    public String getInstrumental() {
        return instrumental;
    }

    public void setInstrumental(String instrumental) {
        this.instrumental = instrumental;
    }

    public String getInstrumentalPrepositional() {
        return instrumentalPrepositional;
    }

    public void setInstrumentalPrepositional(String instrumentalPrepositional) {
        this.instrumentalPrepositional = instrumentalPrepositional;
    }

    public String getPrepositional() {
        return prepositional;
    }

    public void setPrepositional(String prepositional) {
        this.prepositional = prepositional;
    }

    @Override
    public String toString() {
        return "CasePronounPersonalUkr{" +
                "id=" + id +
                ", wordUkrId=" + wordUkr.getId() +
                ", nominative='" + nominative + '\'' +
                ", genitive='" + genitive + '\'' +
                ", genitivePrepositional='" + genitivePrepositional + '\'' +
                ", dative='" + dative + '\'' +
                ", dativePrepositional='" + dativePrepositional + '\'' +
                ", accusative='" + accusative + '\'' +
                ", accusativePrepositional='" + accusativePrepositional + '\'' +
                ", instrumental='" + instrumental + '\'' +
                ", instrumentalPrepositional='" + instrumentalPrepositional + '\'' +
                ", prepositional='" + prepositional + '\'' +
                '}';
    }
}
