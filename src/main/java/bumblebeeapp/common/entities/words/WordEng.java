package bumblebeeapp.common.entities.words;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class WordEng {

    @Id
    private Integer id;
    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "WordEngId")
    @JsonIgnore
    private Set<POSLevelEng> posLevelEngs;

    public WordEng(Integer id, String name, Set<POSLevelEng> posLevelEngs) {
        this.id = id;
        this.name = name;
        this.posLevelEngs = posLevelEngs;
    }

    public WordEng() {

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

    public Set<POSLevelEng> getPosLevelEngs() {
        return posLevelEngs;
    }

    public void setPosLevelEngs(Set<POSLevelEng> posLevelEngs) {
        this.posLevelEngs = posLevelEngs;
    }

    @Override
    public String toString() {
        return "WordEng{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", posLevelEngs=" + posLevelEngs +
                '}';
    }
}
