package bumblebeeapp.common.entities.words;


import javax.persistence.*;

@Entity
public class WordUkr {

    @Id
    private Integer id;
    private String name;

    @Enumerated(EnumType.STRING)
    private PartOfSpeechUkr partOfSpeechUkr;

    private String Comment;


    public WordUkr(Integer id, String name, PartOfSpeechUkr partOfSpeechUkr, String comment) {
        this.id = id;
        this.name = name;
        this.partOfSpeechUkr = partOfSpeechUkr;
        Comment = comment;
    }

    public WordUkr() {

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

    public PartOfSpeechUkr getPartOfSpeechUkr() {
        return partOfSpeechUkr;
    }

    public void setPartOfSpeechUkr(PartOfSpeechUkr partOfSpeechUkr) {
        this.partOfSpeechUkr = partOfSpeechUkr;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    @Override
    public String toString() {
        return "WordUkr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", partOfSpeechUkr=" + partOfSpeechUkr +
                ", Comment='" + Comment + '\'' +
                '}';
    }
}
