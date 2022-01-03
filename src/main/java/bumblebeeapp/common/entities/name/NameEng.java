package bumblebeeapp.common.entities.name;


import javax.persistence.*;

@Entity
public class NameEng {

    @Id
    private Integer id;
    private String name;

    @Enumerated(EnumType.STRING)
    private GenderName genderName;

    public NameEng(Integer id, String name, GenderName genderName) {
        this.id = id;
        this.name = name;
        this.genderName = genderName;
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

    public GenderName getGenderName() {
        return genderName;
    }

    public void setGenderName(GenderName genderName) {
        this.genderName = genderName;
    }

    @Override
    public String toString() {
        return "NameEng{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genderName=" + genderName +
                '}';
    }
}
