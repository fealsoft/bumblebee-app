package bumblebeeapp.common.entities.words;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class VerbExtEng {

    @Id
    private Integer id;

    @OneToOne
    @JoinColumn(name = "POSLevelEngId")
    private POSLevelEng posLevelEng;


}
