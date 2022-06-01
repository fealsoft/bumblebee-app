package bumblebeeapp.common.entities.words;

import javax.persistence.*;

@Entity
public class PronounDemonstrativePropertiesEng {

    @Id
    private Integer id;

    @OneToOne
    @JoinColumn(name = "POSLevelEngId")
    POSLevelEng posLevelEng;

    @Enumerated(EnumType.STRING)
    private PronounDemonstrativeNumberEng pronounDemonstrativeNumberEng;
}
