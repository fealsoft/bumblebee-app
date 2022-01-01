package bumblebeeapp.common.entities.words;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PronounGenderUkr {

    @Id
    private Integer id;
    private String name;

    public PronounGenderUkr(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public PronounGenderUkr() {
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
        return "PronounGenderUkr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
