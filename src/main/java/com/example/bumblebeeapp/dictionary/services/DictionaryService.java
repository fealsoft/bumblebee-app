package com.example.bumblebeeapp.dictionary.services;

import com.example.bumblebeeapp.common.entities.WordEng;
import com.example.bumblebeeapp.common.entities.WordUkr;
import com.example.bumblebeeapp.dictionary.repositories.WordEngRepository;
import com.example.bumblebeeapp.dictionary.repositories.WordUkrRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryService implements IDictionaryService {

    final private WordEngRepository wordEngRepository;
    final private WordUkrRepository wordUkrRepository;


    public DictionaryService(WordEngRepository wordEngRepository, WordUkrRepository wordUkrRepository) {
        this.wordEngRepository = wordEngRepository;
        this.wordUkrRepository = wordUkrRepository;
    }

    @Override
    public List<WordEng> getAllEnglishWords() {
        return wordEngRepository.findAll();
    }

    @Override
    public List<WordUkr> getAllUkrainianWords() {
        return wordUkrRepository.findAll();
    }
}
