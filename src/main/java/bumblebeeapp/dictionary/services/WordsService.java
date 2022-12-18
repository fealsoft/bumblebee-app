package bumblebeeapp.dictionary.services;

import bumblebeeapp.common.entities.words.POSLevelEng;
import bumblebeeapp.common.entities.words.WordEng;
import bumblebeeapp.common.entities.words.WordUkr;
import bumblebeeapp.dictionary.repositories.words.POSLevelEngRepository;
import bumblebeeapp.dictionary.repositories.words.WordEngRepository;
import bumblebeeapp.dictionary.repositories.words.WordUkrRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordsService implements IWordsService {

    final private WordEngRepository wordEngRepository;
    final private WordUkrRepository wordUkrRepository;
    final private POSLevelEngRepository posLevelEngRepository;


    public WordsService(WordEngRepository wordEngRepository, WordUkrRepository wordUkrRepository, POSLevelEngRepository posLevelEngRepository) {
        this.wordEngRepository = wordEngRepository;
        this.wordUkrRepository = wordUkrRepository;
        this.posLevelEngRepository = posLevelEngRepository;
    }

    @Override
    public List<WordEng> getAllEnglishWords() {
        return wordEngRepository.findAllByOrderByName();
    }

    @Override
    public List<WordUkr> getAllUkrainianWords() {
        return wordUkrRepository.findAllByOrderByName();
    }

    @Override
    public List<POSLevelEng> findPOSLevelEngByWordEngId(Integer wordEngId) {
        return posLevelEngRepository.findPOSLevelEngByWordEngId(wordEngId);
    }
}
