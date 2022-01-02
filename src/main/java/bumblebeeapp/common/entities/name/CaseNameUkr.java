package bumblebeeapp.common.entities.name;

import javax.persistence.*;

@Entity
public class CaseNameUkr {

    @Id
    private Integer id;

    @OneToOne
    @JoinColumn(name = "NameUkrId")
    private NameUkr nameUkr;

    private String nominative;
    private String genitive;
    private String dative;
    private String accusative;
    private String instrumental;
    private String prepositional;
    private String vocative;


}
