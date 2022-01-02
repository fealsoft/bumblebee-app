package bumblebeeapp.common.entities.name;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class NameEng {

    @Id
    private Integer id;
    private String name;

    @ManyToOne()
    @JoinColumn(name = "GenderNameEngId")
    private GenderNameEng genderNameEng;

    public NameEng(Integer id, String name, GenderNameEng genderNameEng) {
        this.id = id;
        this.name = name;
        this.genderNameEng = genderNameEng;
    }

    public NameEng() {
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

    public GenderNameEng getGenderNameEng() {
        return genderNameEng;
    }

    public void setGenderNameEng(GenderNameEng genderNameEng) {
        this.genderNameEng = genderNameEng;
    }

    @Override
    public String toString() {
        return "NameEng{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genderNameEng=" + genderNameEng +
                '}';
    }
}
