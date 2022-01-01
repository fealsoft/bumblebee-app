package bumblebeeapp.dictionary.repositories.words;

import bumblebeeapp.common.entities.words.WordEng;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WordEngRepository extends CrudRepository<WordEng, Integer> {

}
