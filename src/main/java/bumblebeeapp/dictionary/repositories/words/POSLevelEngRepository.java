package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.POSLevelEng;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface POSLevelEngRepository extends CrudRepository<POSLevelEng, Integer> {
    List<POSLevelEng> findPOSLevelEngByWordEngId(Integer wordEngId);
}
