package bumblebeeapp.common.entities.words;

import javax.persistence.*;

@Entity
public class CaseNounUkr {

    @Id
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WordUkrId")
    private WordUkr wordUkr;

    private String nominative;
    private String genitive;
    private String dative;
    private String accusative;
    private String instrumental;
    private String prepositional;
    private String vocative;
    private String nominativePlural;
    private String genitivePlural;
    private String dativePlural;
    private String accusativePlural;
    private String instrumentalPlural;
    private String prepositionalPlural;
    private String vocativePlural;

    public CaseNounUkr(Integer id, WordUkr wordUkr, String nominative, String genitive, String dative, String accusative, String instrumental, String prepositional, String vocative, String nominativePlural, String genitivePlural, String dativePlural, String accusativePlural, String instrumentalPlural, String prepositionalPlural, String vocativePlural) {
        this.id = id;
        this.wordUkr = wordUkr;
        this.nominative = nominative;
        this.genitive = genitive;
        this.dative = dative;
        this.accusative = accusative;
        this.instrumental = instrumental;
        this.prepositional = prepositional;
        this.vocative = vocative;
        this.nominativePlural = nominativePlural;
        this.genitivePlural = genitivePlural;
        this.dativePlural = dativePlural;
        this.accusativePlural = accusativePlural;
        this.instrumentalPlural = instrumentalPlural;
        this.prepositionalPlural = prepositionalPlural;
        this.vocativePlural = vocativePlural;
    }

    public CaseNounUkr() {
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

    public String getNominativePlural() {
        return nominativePlural;
    }

    public void setNominativePlural(String nominativePlural) {
        this.nominativePlural = nominativePlural;
    }

    public String getGenitivePlural() {
        return genitivePlural;
    }

    public void setGenitivePlural(String genitivePlural) {
        this.genitivePlural = genitivePlural;
    }

    public String getDativePlural() {
        return dativePlural;
    }

    public void setDativePlural(String dativePlural) {
        this.dativePlural = dativePlural;
    }

    public String getAccusativePlural() {
        return accusativePlural;
    }

    public void setAccusativePlural(String accusativePlural) {
        this.accusativePlural = accusativePlural;
    }

    public String getInstrumentalPlural() {
        return instrumentalPlural;
    }

    public void setInstrumentalPlural(String instrumentalPlural) {
        this.instrumentalPlural = instrumentalPlural;
    }

    public String getPrepositionalPlural() {
        return prepositionalPlural;
    }

    public void setPrepositionalPlural(String prepositionalPlural) {
        this.prepositionalPlural = prepositionalPlural;
    }

    public String getVocativePlural() {
        return vocativePlural;
    }

    public void setVocativePlural(String vocativePlural) {
        this.vocativePlural = vocativePlural;
    }

    @Override
    public String toString() {
        return "CaseNounUkrEntity{" +
                "id=" + id +
                ", wordUkrId=" + wordUkr.getId() +
                ", nominative='" + nominative + '\'' +
                ", genitive='" + genitive + '\'' +
                ", dative='" + dative + '\'' +
                ", accusative='" + accusative + '\'' +
                ", instrumental='" + instrumental + '\'' +
                ", prepositional='" + prepositional + '\'' +
                ", vocative='" + vocative + '\'' +
                ", nominativePlural='" + nominativePlural + '\'' +
                ", genitivePlural='" + genitivePlural + '\'' +
                ", dativePlural='" + dativePlural + '\'' +
                ", accusativePlural='" + accusativePlural + '\'' +
                ", instrumentalPlural='" + instrumentalPlural + '\'' +
                ", prepositionalPlural='" + prepositionalPlural + '\'' +
                ", vocativePlural='" + vocativePlural + '\'' +
                '}';
    }
}
