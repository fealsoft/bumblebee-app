package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.words.WordEng;
import bumblebeeapp.common.entities.words.WordUkr;
import bumblebeeapp.dictionary.repositories.words.WordEngRepository;
import bumblebeeapp.dictionary.repositories.words.WordUkrRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordsService implements IWordsService {

    final private WordEngRepository wordEngRepository;
    final private WordUkrRepository wordUkrRepository;


    public WordsService(WordEngRepository wordEngRepository, WordUkrRepository wordUkrRepository) {
        this.wordEngRepository = wordEngRepository;
        this.wordUkrRepository = wordUkrRepository;
    }

    @Override
    public List<WordEng> getAllEnglishWords() {
        return wordEngRepository.findAllByOrderByName();
    }

    @Override
    public List<WordUkr> getAllUkrainianWords() {
        return wordUkrRepository.findAllByOrderByName();
    }
}
