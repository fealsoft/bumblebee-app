package bumblebeeapp.dictionary.repositories.geographic;

import bumblebeeapp.common.entities.geographic.GeographicEng;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GeographicEngRepository extends CrudRepository<GeographicEng, Integer> {

    List<GeographicEng> findAllByOrderByName();

}
