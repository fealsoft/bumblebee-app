package bumblebeeapp.common.entities.geographic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class GeographicEng {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "GeographicTypeEngId")
    private GeographicTypeEng geographicTypeEng;

    private String name;

    public GeographicEng(Integer id, GeographicTypeEng geographicTypeEng, String name) {
        this.id = id;
        this.geographicTypeEng = geographicTypeEng;
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

    public GeographicTypeEng getGeographicTypeEng() {
        return geographicTypeEng;
    }

    public void setGeographicTypeEng(GeographicTypeEng geographicTypeEng) {
        this.geographicTypeEng = geographicTypeEng;
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
                ", geographicTypeEng=" + geographicTypeEng +
                ", name='" + name + '\'' +
                '}';
    }
}
