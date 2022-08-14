package bumblebeeapp.dictionary.repositories.name;

import bumblebeeapp.common.entities.name.NameEng;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NameEngRepository extends CrudRepository<NameEng, Integer> {

    List<NameEng> findAllByOrderByName();

}
