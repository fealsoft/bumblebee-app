package bumblebeeapp.common.entities.words;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PartOfSpeechUkr")
public class PartOfSpeechUkr {

    @Id
    private Integer id;
    private String name;

    public PartOfSpeechUkr() {
    }

    public PartOfSpeechUkr(Integer id, String name) {
        this.id = id;
        this.name = name;
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
        return "PartOfSpeechUkr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
