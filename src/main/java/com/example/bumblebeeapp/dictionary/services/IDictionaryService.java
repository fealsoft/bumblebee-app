package com.example.bumblebeeapp.dictionary.services;

import com.example.bumblebeeapp.common.entities.words.WordEngLite;
import com.example.bumblebeeapp.common.entities.words.WordUkrLite;

import java.util.List;

public interface IDictionaryService {

    List<WordEngLite> getAllEnglishWords();

    List<WordUkrLite> getAllUkrainianWords();

}
