package com.example.bumblebeeapp.common.entities.words;

import javax.persistence.*;

@Entity
public class PronounDemonstrativePropertiesEng {

    @Id
    private Integer id;

    @OneToOne
    @JoinColumn(name = "POSLevelEngId")
    POSLevelEng posLevelEng;

    @ManyToOne
    @JoinColumn(name = "PronounDemonstrativeNumberEngId")
    private PronounDemonstrativeNumberEng pronounDemonstrativeNumberEng;
}
