package bumblebeeapp.common.entities.geographic;

import javax.persistence.*;

@Entity
public class GeographicEng {

    @Id
    private Integer id;

    @Enumerated(EnumType.STRING)
    private GeographicType geographicType;

    private String name;

    public GeographicEng(Integer id, GeographicType geographicType, String name) {
        this.id = id;
        this.geographicType = geographicType;
        this.name = name;
    }

    public GeographicEng() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GeographicEng{" +
                "id=" + id +
                ", geographicType=" + geographicType +
                ", name='" + name + '\'' +
                '}';
    }
}
