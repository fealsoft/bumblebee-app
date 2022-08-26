package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.words.WordEng;
import bumblebeeapp.common.entities.words.WordUkr;

import java.util.List;

public interface IWordsService {

    List<WordEng> getAllEnglishWords();

    List<WordUkr> getAllUkrainianWords();



}
