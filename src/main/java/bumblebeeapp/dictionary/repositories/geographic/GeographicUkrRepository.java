package bumblebeeapp.dictionary.repositories.geographic;

import bumblebeeapp.common.entities.geographic.GeographicUkr;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GeographicUkrRepository extends CrudRepository<GeographicUkr, Integer> {

    List<GeographicUkr> findAllByOrderByName();

}
