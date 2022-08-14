package bumblebeeapp.dictionary.repositories.name;

import bumblebeeapp.common.entities.name.NameUkr;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NameUkrRepository extends CrudRepository<NameUkr, Integer> {

    List<NameUkr> findAllByOrderByName();
}
