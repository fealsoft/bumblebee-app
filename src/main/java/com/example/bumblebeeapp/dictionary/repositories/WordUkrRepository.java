package com.example.bumblebeeapp.dictionary.repositories;

import com.example.bumblebeeapp.common.entities.WordUkr;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WordUkrRepository extends CrudRepository<WordUkr, Integer> {

    List<WordUkr> findAll();

}
