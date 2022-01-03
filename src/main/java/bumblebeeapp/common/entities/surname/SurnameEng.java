package bumblebeeapp.common.entities.surname;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SurnameEng {

    @Id
    private Integer id;

    private String surname;
    private String plural;

    public SurnameEng(Integer id, String surname, String plural) {
        this.id = id;
        this.surname = surname;
        this.plural = plural;
    }

    public SurnameEng() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPlural() {
        return plural;
    }

    public void setPlural(String plural) {
        this.plural = plural;
    }

    @Override
    public String toString() {
        return "SurnameEng{" +
                "id=" + id +
                ", Surname='" + surname + '\'' +
                ", Plural='" + plural + '\'' +
                '}';
    }
}
