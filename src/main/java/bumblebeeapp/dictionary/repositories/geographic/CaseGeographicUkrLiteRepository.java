package bumblebeeapp.dictionary.repositories.geographic;

import bumblebeeapp.common.entities.geographic.CaseGeographicUkrLite;
import org.springframework.data.repository.CrudRepository;

public interface CaseGeographicUkrLiteRepository extends CrudRepository<CaseGeographicUkrLite, Integer> {

    CaseGeographicUkrLite findByGeographicUkrId(Integer geographicUkrId);
}
