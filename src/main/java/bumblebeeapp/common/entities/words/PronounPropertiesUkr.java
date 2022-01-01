package bumblebeeapp.common.entities.words;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PronounPropertiesUkr {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "PronounNumberUkrId")
    private PronounNumberUkr pronounNumberUkr;

    @ManyToOne
    @JoinColumn(name = "PronounGenderUkrId")
    private PronounGenderUkr pronounGenderUkr;

    @ManyToOne
    @JoinColumn(name = "PronounPersonUkrId")
    private PronounPersonUkr pronounPersonUkr;

}
