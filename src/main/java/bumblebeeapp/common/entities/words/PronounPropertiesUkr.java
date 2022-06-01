package bumblebeeapp.common.entities.words;

import javax.persistence.*;

@Entity
public class PronounPropertiesUkr {

    @Id
    private Integer id;

    @Enumerated(EnumType.STRING)
    private PronounNumberUkr pronounNumberUkr;

    @Enumerated(EnumType.STRING)
    private PronounGenderUkr pronounGenderUkr;

    @Enumerated(EnumType.STRING)
    private PronounPersonUkr pronounPersonUkr;
}
