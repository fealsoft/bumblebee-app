package bumblebeeapp.common.entities.geographic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GeographicTypeUkr {

    @Id
    private Integer id;
    private String name;

    public GeographicTypeUkr(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public GeographicTypeUkr() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GeographicTypeUkr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
