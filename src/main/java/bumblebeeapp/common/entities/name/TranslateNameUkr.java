package bumblebeeapp.common.entities.name;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TranslateNameUkr {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "NameEngId")
    private NameEng nameEng;

    @ManyToOne
    @JoinColumn(name = "NameUkrId")
    private NameUkr nameUkr;

}
