package com.example.bumblebeeapp.dictionary.repositories.words;

import com.example.bumblebeeapp.common.entities.words.WordEngLite;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WordEngLiteRepository extends CrudRepository<WordEngLite, Integer> {

    List<WordEngLite> findAllByOrderByName();

}
