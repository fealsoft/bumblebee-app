package bumblebeeapp.common.entities.geographic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CaseGeographicUkr")
public class CaseGeographicUkrLite {

    @Id
    private Integer id;

    private Integer geographicUkrId;

    private String nominative;
    private String genitive;
    private String dative;
    private String accusative;
    private String instrumental;
    private String prepositional;
    private String vocative;

    public CaseGeographicUkrLite(Integer id, Integer geographicUkrId, String nominative, String genitive, String dative, String accusative, String instrumental, String prepositional, String vocative) {
        this.id = id;
        this.geographicUkrId = geographicUkrId;
        this.nominative = nominative;
        this.genitive = genitive;
        this.dative = dative;
        this.accusative = accusative;
        this.instrumental = instrumental;
        this.prepositional = prepositional;
        this.vocative = vocative;
    }

    public CaseGeographicUkrLite() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGeographicUkrId() {
        return geographicUkrId;
    }

    public void setGeographicUkrId(Integer geographicUkrId) {
        this.geographicUkrId = geographicUkrId;
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

    @Override
    public String toString() {
        return "CaseGeographicUkrLite{" +
                "id=" + id +
                ", geographicUkrId=" + geographicUkrId +
                ", nominative='" + nominative + '\'' +
                ", genitive='" + genitive + '\'' +
                ", dative='" + dative + '\'' +
                ", accusative='" + accusative + '\'' +
                ", instrumental='" + instrumental + '\'' +
                ", prepositional='" + prepositional + '\'' +
                ", vocative='" + vocative + '\'' +
                '}';
    }
}
