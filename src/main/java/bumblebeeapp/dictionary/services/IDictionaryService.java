package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.words.WordEngLite;
import bumblebeeapp.common.entities.words.WordUkrLite;

import java.util.List;

public interface IDictionaryService {

    List<WordEngLite> getAllEnglishWords();

    List<WordUkrLite> getAllUkrainianWords();

}
