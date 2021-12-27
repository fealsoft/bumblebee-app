package com.example.bumblebeeapp.dictionary.repositories.words;

import com.example.bumblebeeapp.common.entities.words.WordUkrLite;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WordUkrLiteRepository extends CrudRepository<WordUkrLite, Integer> {

    List<WordUkrLite> findAllByOrderByName();

}
