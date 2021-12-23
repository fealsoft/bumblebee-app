package com.example.bumblebeeapp.dictionary.services;

import com.example.bumblebeeapp.common.entities.WordEng;
import com.example.bumblebeeapp.dictionary.repositories.WordEngRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryService {

    final private WordEngRepository wordEngRepository;

    public DictionaryService(WordEngRepository wordEngRepository) {
        this.wordEngRepository = wordEngRepository;
    }

    public List<WordEng> getAllEnglishWords() {
        return wordEngRepository.findAll();
    }
}
