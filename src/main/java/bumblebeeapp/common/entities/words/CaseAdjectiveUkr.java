package bumblebeeapp.common.entities.words;

import javax.persistence.*;

@Entity
public class CaseAdjectiveUkr {
    @Id
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WordUkrId")
    private WordUkr wordUkr;

    private String nominative;
    private String genitive;
    private String dative;
    private String accusativeAnimate;
    private String accusativeInanimate;
    private String instrumental;
    private String prepositional;
    private String nominativeFeminine;
    private String genitiveFeminine;
    private String dativeFeminine;
    private String accusativeAnimateFeminine;
    private String accusativeInanimateFeminine;
    private String instrumentalFeminine;
    private String prepositionalFeminine;
    private String nominativeNeuter;
    private String genitiveNeuter;
    private String dativeNeuter;
    private String accusativeAnimateNeuter;
    private String accusativeInanimateNeuter;
    private String instrumentalNeuter;
    private String prepositionalNeuter;
    private String nominativePlural;
    private String genitivePlural;
    private String dativePlural;
    private String accusativeAnimatePlural;
    private String accusativeInanimatePlural;
    private String instrumentalPlural;
    private String prepositionalPlural;

    public CaseAdjectiveUkr(Integer id, WordUkr wordUkr, String nominative, String genitive, String dative, String accusativeAnimate, String accusativeInanimate, String instrumental, String prepositional, String nominativeFeminine, String genitiveFeminine, String dativeFeminine, String accusativeAnimateFeminine, String accusativeInanimateFeminine, String instrumentalFeminine, String prepositionalFeminine, String nominativeNeuter, String genitiveNeuter, String dativeNeuter, String accusativeAnimateNeuter, String accusativeInanimateNeuter, String instrumentalNeuter, String prepositionalNeuter, String nominativePlural, String genitivePlural, String dativePlural, String accusativeAnimatePlural, String accusativeInanimatePlural, String instrumentalPlural, String prepositionalPlural) {
        this.id = id;
        this.wordUkr = wordUkr;
        this.nominative = nominative;
        this.genitive = genitive;
        this.dative = dative;
        this.accusativeAnimate = accusativeAnimate;
        this.accusativeInanimate = accusativeInanimate;
        this.instrumental = instrumental;
        this.prepositional = prepositional;
        this.nominativeFeminine = nominativeFeminine;
        this.genitiveFeminine = genitiveFeminine;
        this.dativeFeminine = dativeFeminine;
        this.accusativeAnimateFeminine = accusativeAnimateFeminine;
        this.accusativeInanimateFeminine = accusativeInanimateFeminine;
        this.instrumentalFeminine = instrumentalFeminine;
        this.prepositionalFeminine = prepositionalFeminine;
        this.nominativeNeuter = nominativeNeuter;
        this.genitiveNeuter = genitiveNeuter;
        this.dativeNeuter = dativeNeuter;
        this.accusativeAnimateNeuter = accusativeAnimateNeuter;
        this.accusativeInanimateNeuter = accusativeInanimateNeuter;
        this.instrumentalNeuter = instrumentalNeuter;
        this.prepositionalNeuter = prepositionalNeuter;
        this.nominativePlural = nominativePlural;
        this.genitivePlural = genitivePlural;
        this.dativePlural = dativePlural;
        this.accusativeAnimatePlural = accusativeAnimatePlural;
        this.accusativeInanimatePlural = accusativeInanimatePlural;
        this.instrumentalPlural = instrumentalPlural;
        this.prepositionalPlural = prepositionalPlural;
    }

    public CaseAdjectiveUkr() {
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

    public String getAccusativeAnimate() {
        return accusativeAnimate;
    }

    public void setAccusativeAnimate(String accusativeAnimate) {
        this.accusativeAnimate = accusativeAnimate;
    }

    public String getAccusativeInanimate() {
        return accusativeInanimate;
    }

    public void setAccusativeInanimate(String accusativeInanimate) {
        this.accusativeInanimate = accusativeInanimate;
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

    public String getNominativeFeminine() {
        return nominativeFeminine;
    }

    public void setNominativeFeminine(String nominativeFeminine) {
        this.nominativeFeminine = nominativeFeminine;
    }

    public String getGenitiveFeminine() {
        return genitiveFeminine;
    }

    public void setGenitiveFeminine(String genitiveFeminine) {
        this.genitiveFeminine = genitiveFeminine;
    }

    public String getDativeFeminine() {
        return dativeFeminine;
    }

    public void setDativeFeminine(String dativeFeminine) {
        this.dativeFeminine = dativeFeminine;
    }

    public String getAccusativeAnimateFeminine() {
        return accusativeAnimateFeminine;
    }

    public void setAccusativeAnimateFeminine(String accusativeAnimateFeminine) {
        this.accusativeAnimateFeminine = accusativeAnimateFeminine;
    }

    public String getAccusativeInanimateFeminine() {
        return accusativeInanimateFeminine;
    }

    public void setAccusativeInanimateFeminine(String accusativeInanimateFeminine) {
        this.accusativeInanimateFeminine = accusativeInanimateFeminine;
    }

    public String getInstrumentalFeminine() {
        return instrumentalFeminine;
    }

    public void setInstrumentalFeminine(String instrumentalFeminine) {
        this.instrumentalFeminine = instrumentalFeminine;
    }

    public String getPrepositionalFeminine() {
        return prepositionalFeminine;
    }

    public void setPrepositionalFeminine(String prepositionalFeminine) {
        this.prepositionalFeminine = prepositionalFeminine;
    }

    public String getNominativeNeuter() {
        return nominativeNeuter;
    }

    public void setNominativeNeuter(String nominativeNeuter) {
        this.nominativeNeuter = nominativeNeuter;
    }

    public String getGenitiveNeuter() {
        return genitiveNeuter;
    }

    public void setGenitiveNeuter(String genitiveNeuter) {
        this.genitiveNeuter = genitiveNeuter;
    }

    public String getDativeNeuter() {
        return dativeNeuter;
    }

    public void setDativeNeuter(String dativeNeuter) {
        this.dativeNeuter = dativeNeuter;
    }

    public String getAccusativeAnimateNeuter() {
        return accusativeAnimateNeuter;
    }

    public void setAccusativeAnimateNeuter(String accusativeAnimateNeuter) {
        this.accusativeAnimateNeuter = accusativeAnimateNeuter;
    }

    public String getAccusativeInanimateNeuter() {
        return accusativeInanimateNeuter;
    }

    public void setAccusativeInanimateNeuter(String accusativeInanimateNeuter) {
        this.accusativeInanimateNeuter = accusativeInanimateNeuter;
    }

    public String getInstrumentalNeuter() {
        return instrumentalNeuter;
    }

    public void setInstrumentalNeuter(String instrumentalNeuter) {
        this.instrumentalNeuter = instrumentalNeuter;
    }

    public String getPrepositionalNeuter() {
        return prepositionalNeuter;
    }

    public void setPrepositionalNeuter(String prepositionalNeuter) {
        this.prepositionalNeuter = prepositionalNeuter;
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

    public String getAccusativeAnimatePlural() {
        return accusativeAnimatePlural;
    }

    public void setAccusativeAnimatePlural(String accusativeAnimatePlural) {
        this.accusativeAnimatePlural = accusativeAnimatePlural;
    }

    public String getAccusativeInanimatePlural() {
        return accusativeInanimatePlural;
    }

    public void setAccusativeInanimatePlural(String accusativeInanimatePlural) {
        this.accusativeInanimatePlural = accusativeInanimatePlural;
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

    @Override
    public String toString() {
        return "CaseAdjectiveUkr{" +
                "id=" + id +
                ", wordUkrId=" + wordUkr.getId() +
                ", nominative='" + nominative + '\'' +
                ", genitive='" + genitive + '\'' +
                ", dative='" + dative + '\'' +
                ", accusativeAnimate='" + accusativeAnimate + '\'' +
                ", accusativeInanimate='" + accusativeInanimate + '\'' +
                ", instrumental='" + instrumental + '\'' +
                ", prepositional='" + prepositional + '\'' +
                ", nominativeFeminine='" + nominativeFeminine + '\'' +
                ", genitiveFeminine='" + genitiveFeminine + '\'' +
                ", dativeFeminine='" + dativeFeminine + '\'' +
                ", accusativeAnimateFeminine='" + accusativeAnimateFeminine + '\'' +
                ", accusativeInanimateFeminine='" + accusativeInanimateFeminine + '\'' +
                ", instrumentalFeminine='" + instrumentalFeminine + '\'' +
                ", prepositionalFeminine='" + prepositionalFeminine + '\'' +
                ", nominativeNeuter='" + nominativeNeuter + '\'' +
                ", genitiveNeuter='" + genitiveNeuter + '\'' +
                ", dativeNeuter='" + dativeNeuter + '\'' +
                ", accusativeAnimateNeuter='" + accusativeAnimateNeuter + '\'' +
                ", accusativeInanimateNeuter='" + accusativeInanimateNeuter + '\'' +
                ", instrumentalNeuter='" + instrumentalNeuter + '\'' +
                ", prepositionalNeuter='" + prepositionalNeuter + '\'' +
                ", nominativePlural='" + nominativePlural + '\'' +
                ", genitivePlural='" + genitivePlural + '\'' +
                ", dativePlural='" + dativePlural + '\'' +
                ", accusativeAnimatePlural='" + accusativeAnimatePlural + '\'' +
                ", accusativeInanimatePlural='" + accusativeInanimatePlural + '\'' +
                ", instrumentalPlural='" + instrumentalPlural + '\'' +
                ", prepositionalPlural='" + prepositionalPlural + '\'' +
                '}';
    }
}
