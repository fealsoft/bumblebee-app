package bumblebeeapp.common.entities.name;

import javax.persistence.*;

@Entity
public class NameUkr {

    @Id
    private Integer id;
    private String name;

    @Enumerated(EnumType.STRING)
    private GenderName genderName;

    public NameUkr(Integer id, String name, GenderName genderName) {
        this.id = id;
        this.name = name;
        this.genderName = genderName;
    }

    public NameUkr() {
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

    public GenderName getGenderName() {
        return genderName;
    }

    public void setGenderName(GenderName genderName) {
        this.genderName = genderName;
    }

    @Override
    public String toString() {
        return "NameUkr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genderName=" + genderName +
                '}';
    }
}
