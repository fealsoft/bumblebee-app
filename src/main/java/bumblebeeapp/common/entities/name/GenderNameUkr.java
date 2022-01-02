package bumblebeeapp.common.entities.name;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GenderNameUkr {

    @Id
    private Integer id;
    private String name;

    public GenderNameUkr(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public GenderNameUkr() {
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
        return "GenderNameUkr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
