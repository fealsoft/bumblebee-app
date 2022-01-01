package bumblebeeapp.dictionary.services;

import bumblebeeapp.dictionary.repositories.words.WordEngLiteRepository;
import bumblebeeapp.dictionary.repositories.words.WordUkrLiteRepository;
import bumblebeeapp.common.entities.words.WordEngLite;
import bumblebeeapp.common.entities.words.WordUkrLite;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryService implements IDictionaryService {

    final private WordEngLiteRepository wordEngLiteRepository;
    final private WordUkrLiteRepository wordUkrLiteRepository;


    public DictionaryService(WordEngLiteRepository wordEngLiteRepository, WordUkrLiteRepository wordUkrLiteRepository) {
        this.wordEngLiteRepository = wordEngLiteRepository;
        this.wordUkrLiteRepository = wordUkrLiteRepository;
    }

    @Override
    public List<WordEngLite> getAllEnglishWords() {
        return wordEngLiteRepository.findAllByOrderByName();
    }

    @Override
    public List<WordUkrLite> getAllUkrainianWords() {
        return wordUkrLiteRepository.findAllByOrderByName();
    }
}
