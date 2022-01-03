package bumblebeeapp.common.entities.surname;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SurnameUkr {

    @Id
    private Integer id;

    private String surname;

    public SurnameUkr(Integer id, String surname) {
        this.id = id;
        this.surname = surname;
    }

    public SurnameUkr() {
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

    @Override
    public String toString() {
        return "SurnameUkr{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                '}';
    }
}
