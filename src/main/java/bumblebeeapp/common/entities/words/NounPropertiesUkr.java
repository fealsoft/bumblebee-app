package bumblebeeapp.common.entities.words;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;


@Entity
public class NounPropertiesUkr {

    @Id
    private Integer id;

    @Enumerated(EnumType.STRING)
    private GrammaticalGender grammaticalGender;

    @Enumerated(EnumType.STRING)
    private GrammaticalAnimacy grammaticalAnimacy;

    public NounPropertiesUkr(Integer id, GrammaticalGender grammaticalGender, GrammaticalAnimacy grammaticalAnimacy) {
        this.id = id;
        this.grammaticalGender = grammaticalGender;
        this.grammaticalAnimacy = grammaticalAnimacy;
    }

    public NounPropertiesUkr() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GrammaticalGender getGrammaticalGender() {
        return grammaticalGender;
    }

    public void setGrammaticalGender(GrammaticalGender grammaticalGender) {
        this.grammaticalGender = grammaticalGender;
    }

    public GrammaticalAnimacy getGrammaticalAnimacy() {
        return grammaticalAnimacy;
    }

    public void setGrammaticalAnimacy(GrammaticalAnimacy grammaticalAnimacy) {
        this.grammaticalAnimacy = grammaticalAnimacy;
    }

    @Override
    public String toString() {
        return "NounPropertiesUkr{" +
                "id=" + id +
                ", grammaticalGender=" + grammaticalGender +
                ", grammaticalAnimacy=" + grammaticalAnimacy +
                '}';
    }
}
