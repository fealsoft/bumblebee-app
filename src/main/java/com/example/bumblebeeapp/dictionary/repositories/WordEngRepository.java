package com.example.bumblebeeapp.dictionary.repositories;

import com.example.bumblebeeapp.common.entities.WordEng;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WordEngRepository extends CrudRepository<WordEng, Integer> {

}
