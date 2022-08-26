package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.WordUkr;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WordUkrRepository extends CrudRepository<WordUkr, Integer> {

    List<WordUkr> findAllByOrderByName();

}
