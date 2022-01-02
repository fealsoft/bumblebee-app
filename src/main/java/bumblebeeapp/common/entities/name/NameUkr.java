package bumblebeeapp.common.entities.name;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class NameUkr {

    @Id
    private Integer id;
    private String name;

    @ManyToOne()
    @JoinColumn(name = "GenderNameUkrId")
    private GenderNameUkr genderNameUkr;

    public NameUkr(Integer id, String name, GenderNameUkr genderNameUkr) {
        this.id = id;
        this.name = name;
        this.genderNameUkr = genderNameUkr;
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

    public GenderNameUkr getGenderNameUkr() {
        return genderNameUkr;
    }

    public void setGenderNameUkr(GenderNameUkr genderNameUkr) {
        this.genderNameUkr = genderNameUkr;
    }

    @Override
    public String toString() {
        return "NameUkr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genderNameUkr=" + genderNameUkr +
                '}';
    }
}
