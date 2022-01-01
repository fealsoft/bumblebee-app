package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.WordEngLite;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WordEngLiteRepository extends CrudRepository<WordEngLite, Integer> {

    List<WordEngLite> findAllByOrderByName();

}
