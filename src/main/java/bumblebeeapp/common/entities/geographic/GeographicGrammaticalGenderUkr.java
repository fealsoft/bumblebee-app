package bumblebeeapp.common.entities.geographic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GeographicGrammaticalGenderUkr {

    @Id
    private Integer id;
    private String name;

    public GeographicGrammaticalGenderUkr(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public GeographicGrammaticalGenderUkr() {
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
        return "GeographicGrammaticalGenderUkr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
