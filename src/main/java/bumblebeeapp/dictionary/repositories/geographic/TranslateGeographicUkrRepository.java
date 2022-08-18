package bumblebeeapp.dictionary.repositories.geographic;

import bumblebeeapp.common.entities.geographic.TranslateGeographicUkr;
import org.springframework.data.repository.CrudRepository;

public interface TranslateGeographicUkrRepository extends CrudRepository<TranslateGeographicUkr, Integer> {

    TranslateGeographicUkr findByGeographicEngId(Integer geographicEngId);
}
