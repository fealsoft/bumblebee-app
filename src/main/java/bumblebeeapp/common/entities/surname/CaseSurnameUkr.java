package bumblebeeapp.common.entities.surname;


import javax.persistence.*;

@Entity
public class CaseSurnameUkr {

    @Id
    private Integer id;

    @OneToOne
    @JoinColumn(name = "SurNameUkrId")
    private SurnameUkr surnameUkr;

    private String nominative;
    private String genitive;
    private String dative;
    private String accusative;
    private String instrumental;
    private String prepositional;
    private String vocative;
    private String nominativeFeminine;
    private String genitiveFeminine;
    private String dativeFeminine;
    private String accusativeFeminine;
    private String instrumentalFeminine;
    private String prepositionalFeminine;
    private String vocativeFeminine;
    private String nominativePlural;
    private String genitivePlural;
    private String dativePlural;
    private String accusativePlural;
    private String instrumentalPlural;
    private String prepositionalPlural;
    private String vocativePlural;

    public CaseSurnameUkr(Integer id, SurnameUkr surnameUkr, String nominative, String genitive, String dative, String accusative, String instrumental, String prepositional, String vocative, String nominativeFeminine, String genitiveFeminine, String dativeFeminine, String accusativeFeminine, String instrumentalFeminine, String prepositionalFeminine, String vocativeFeminine, String nominativePlural, String genitivePlural, String dativePlural, String accusativePlural, String instrumentalPlural, String prepositionalPlural, String vocativePlural) {
        this.id = id;
        this.surnameUkr = surnameUkr;
        this.nominative = nominative;
        this.genitive = genitive;
        this.dative = dative;
        this.accusative = accusative;
        this.instrumental = instrumental;
        this.prepositional = prepositional;
        this.vocative = vocative;
        this.nominativeFeminine = nominativeFeminine;
        this.genitiveFeminine = genitiveFeminine;
        this.dativeFeminine = dativeFeminine;
        this.accusativeFeminine = accusativeFeminine;
        this.instrumentalFeminine = instrumentalFeminine;
        this.prepositionalFeminine = prepositionalFeminine;
        this.vocativeFeminine = vocativeFeminine;
        this.nominativePlural = nominativePlural;
        this.genitivePlural = genitivePlural;
        this.dativePlural = dativePlural;
        this.accusativePlural = accusativePlural;
        this.instrumentalPlural = instrumentalPlural;
        this.prepositionalPlural = prepositionalPlural;
        this.vocativePlural = vocativePlural;
    }

    public CaseSurnameUkr() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SurnameUkr getSurnameUkr() {
        return surnameUkr;
    }

    public void setSurnameUkr(SurnameUkr surnameUkr) {
        this.surnameUkr = surnameUkr;
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

    public String getAccusativeFeminine() {
        return accusativeFeminine;
    }

    public void setAccusativeFeminine(String accusativeFeminine) {
        this.accusativeFeminine = accusativeFeminine;
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

    public String getVocativeFeminine() {
        return vocativeFeminine;
    }

    public void setVocativeFeminine(String vocativeFeminine) {
        this.vocativeFeminine = vocativeFeminine;
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
        return "CaseSurnameUkr{" +
                "id=" + id +
                ", surnameUkr=" + surnameUkr +
                ", nominative='" + nominative + '\'' +
                ", genitive='" + genitive + '\'' +
                ", dative='" + dative + '\'' +
                ", accusative='" + accusative + '\'' +
                ", instrumental='" + instrumental + '\'' +
                ", prepositional='" + prepositional + '\'' +
                ", vocative='" + vocative + '\'' +
                ", nominativeFeminine='" + nominativeFeminine + '\'' +
                ", genitiveFeminine='" + genitiveFeminine + '\'' +
                ", dativeFeminine='" + dativeFeminine + '\'' +
                ", accusativeFeminine='" + accusativeFeminine + '\'' +
                ", instrumentalFeminine='" + instrumentalFeminine + '\'' +
                ", prepositionalFeminine='" + prepositionalFeminine + '\'' +
                ", vocativeFeminine='" + vocativeFeminine + '\'' +
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
