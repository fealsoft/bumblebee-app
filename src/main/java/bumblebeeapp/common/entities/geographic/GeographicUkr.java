package bumblebeeapp.common.entities.geographic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class GeographicUkr {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "GeographicTypeUkrId")
    private GeographicTypeUkr geographicTypeUkr;

    @ManyToOne
    @JoinColumn(name = "GeographicGrammaticalGenderUkrId")
    private GeographicGrammaticalGenderUkr grammaticalGenderUkr;

    private String name;

    public GeographicUkr(Integer id, GeographicTypeUkr geographicTypeUkr, GeographicGrammaticalGenderUkr grammaticalGenderUkr, String name) {
        this.id = id;
        this.geographicTypeUkr = geographicTypeUkr;
        this.grammaticalGenderUkr = grammaticalGenderUkr;
        this.name = name;
    }

    public GeographicUkr() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GeographicTypeUkr getGeographicTypeUkr() {
        return geographicTypeUkr;
    }

    public void setGeographicTypeUkr(GeographicTypeUkr geographicTypeUkr) {
        this.geographicTypeUkr = geographicTypeUkr;
    }

    public GeographicGrammaticalGenderUkr getGrammaticalGenderUkr() {
        return grammaticalGenderUkr;
    }

    public void setGrammaticalGenderUkr(GeographicGrammaticalGenderUkr grammaticalGenderUkr) {
        this.grammaticalGenderUkr = grammaticalGenderUkr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GeographicUkr{" +
                "id=" + id +
                ", geographicTypeUkr=" + geographicTypeUkr +
                ", grammaticalGenderUkr=" + grammaticalGenderUkr +
                ", name='" + name + '\'' +
                '}';
    }
}
