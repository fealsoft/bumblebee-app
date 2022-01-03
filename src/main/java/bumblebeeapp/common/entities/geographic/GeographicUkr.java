package bumblebeeapp.common.entities.geographic;

import javax.persistence.*;

@Entity
public class GeographicUkr {

    @Id
    private Integer id;

    @Enumerated(EnumType.STRING)
    private GeographicType geographicType;

    @Enumerated(EnumType.STRING)
    private GeographicGrammaticalGender geographicGrammaticalGender;

    private String name;

    public GeographicUkr(Integer id, GeographicType geographicType, GeographicGrammaticalGender geographicGrammaticalGender, String name) {
        this.id = id;
        this.geographicType = geographicType;
        this.geographicGrammaticalGender = geographicGrammaticalGender;
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

    public GeographicType getGeographicType() {
        return geographicType;
    }

    public void setGeographicType(GeographicType geographicType) {
        this.geographicType = geographicType;
    }

    public GeographicGrammaticalGender getGeographicGrammaticalGender() {
        return geographicGrammaticalGender;
    }

    public void setGeographicGrammaticalGender(GeographicGrammaticalGender geographicGrammaticalGender) {
        this.geographicGrammaticalGender = geographicGrammaticalGender;
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
                ", geographicType=" + geographicType +
                ", geographicGrammaticalGender=" + geographicGrammaticalGender +
                ", name='" + name + '\'' +
                '}';
    }
}
