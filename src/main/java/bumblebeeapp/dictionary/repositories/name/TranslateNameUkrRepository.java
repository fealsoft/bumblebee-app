package bumblebeeapp.dictionary.repositories.name;

import bumblebeeapp.common.entities.name.TranslateNameUkr;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TranslateNameUkrRepository extends CrudRepository<TranslateNameUkr, Integer> {

    List<TranslateNameUkr> findAllByNameEngId(Integer NameEngId);

}
