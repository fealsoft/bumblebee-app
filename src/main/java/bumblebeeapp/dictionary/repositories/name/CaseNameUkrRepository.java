package bumblebeeapp.dictionary.repositories.name;

import bumblebeeapp.common.entities.name.CaseNameUkr;
import org.springframework.data.repository.CrudRepository;

public interface CaseNameUkrRepository extends CrudRepository<CaseNameUkr, Integer> {

    CaseNameUkr findByNameUkrId(Integer nameUkrId);

}
