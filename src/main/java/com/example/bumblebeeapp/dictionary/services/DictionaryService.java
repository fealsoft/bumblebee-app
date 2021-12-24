package com.example.bumblebeeapp.dictionary.services;

import com.example.bumblebeeapp.common.entities.WordEngLite;
import com.example.bumblebeeapp.common.entities.WordUkrLite;
import com.example.bumblebeeapp.dictionary.repositories.WordEngLiteRepository;
import com.example.bumblebeeapp.dictionary.repositories.WordUkrLiteRepository;
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
        return (List<WordEngLite>) wordEngLiteRepository.findAll();
    }

    @Override
    public List<WordUkrLite> getAllUkrainianWords() {
        return (List<WordUkrLite>) wordUkrLiteRepository.findAll();
    }
}
