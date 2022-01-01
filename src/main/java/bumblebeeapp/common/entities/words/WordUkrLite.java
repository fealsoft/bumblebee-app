package bumblebeeapp.common.entities.words;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

/**
 * Lite version of WordUkr
 */
@Entity
@Table(name = "WordUkr")
public class WordUkrLite {

    @Id
    private Integer id;
    private String name;

    public WordUkrLite(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public WordUkrLite() {

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
        return "WordUkrLite{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
