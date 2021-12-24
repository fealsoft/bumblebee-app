package com.example.bumblebeeapp.dictionary.services;

import com.example.bumblebeeapp.common.entities.WordEngLite;
import com.example.bumblebeeapp.common.entities.WordUkrLite;

import java.util.List;

public interface IDictionaryService {

    List<WordEngLite> getAllEnglishWords();

    List<WordUkrLite> getAllUkrainianWords();

}
