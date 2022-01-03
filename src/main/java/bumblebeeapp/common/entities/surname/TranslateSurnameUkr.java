package bumblebeeapp.common.entities.surname;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TranslateSurnameUkr {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "SurnameEngId")
    private SurnameEng surnameEng;

    @ManyToOne
    @JoinColumn(name = "SurnameUkrId")
    private SurnameUkr surnameUkr;


    public TranslateSurnameUkr(Integer id, SurnameEng surnameEng, SurnameUkr surnameUkr) {
        this.id = id;
        this.surnameEng = surnameEng;
        this.surnameUkr = surnameUkr;
    }

    public TranslateSurnameUkr() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SurnameEng getSurnameEng() {
        return surnameEng;
    }

    public void setSurnameEng(SurnameEng surnameEng) {
        this.surnameEng = surnameEng;
    }

    public SurnameUkr getSurnameUkr() {
        return surnameUkr;
    }

    public void setSurnameUkr(SurnameUkr surnameUkr) {
        this.surnameUkr = surnameUkr;
    }

    @Override
    public String toString() {
        return "TranslateSurnameUkr{" +
                "id=" + id +
                ", surnameEng=" + surnameEng +
                ", surnameUkr=" + surnameUkr +
                '}';
    }
}
