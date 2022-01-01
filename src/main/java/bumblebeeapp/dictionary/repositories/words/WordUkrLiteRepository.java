package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.WordUkrLite;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WordUkrLiteRepository extends CrudRepository<WordUkrLite, Integer> {

    List<WordUkrLite> findAllByOrderByName();

}
