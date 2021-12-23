package com.example.bumblebeeapp.dictionary.repositories;

import com.example.bumblebeeapp.common.entities.WordEng;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WordEngRepository extends CrudRepository<WordEng, Integer> {

    List<WordEng> findAll();

}
