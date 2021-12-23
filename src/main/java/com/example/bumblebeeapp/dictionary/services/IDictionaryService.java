package com.example.bumblebeeapp.dictionary.services;

import com.example.bumblebeeapp.common.entities.WordEng;
import com.example.bumblebeeapp.common.entities.WordUkr;

import java.util.List;

public interface IDictionaryService {

    List<WordEng> getAllEnglishWords();

    List<WordUkr> getAllUkrainianWords();

}
