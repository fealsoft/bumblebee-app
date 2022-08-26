package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.WordEng;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WordEngRepository extends CrudRepository<WordEng, Integer> {

    List<WordEng> findAllByOrderByName();

}
