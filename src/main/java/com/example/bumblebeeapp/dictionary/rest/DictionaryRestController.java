package com.example.bumblebeeapp.dictionary.rest;

import com.example.bumblebeeapp.common.entities.WordEng;
import com.example.bumblebeeapp.common.entities.WordUkr;
import com.example.bumblebeeapp.dictionary.services.IDictionaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dictionary")
public class DictionaryRestController {

    private final IDictionaryService dictionaryService;

    public DictionaryRestController(IDictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @GetMapping("eng")
    public List<WordEng> allEnglishWords() {
        return dictionaryService.getAllEnglishWords();
    }

    @GetMapping("ukr")
    public List<WordUkr> allUkrainianWords() {
        return dictionaryService.getAllUkrainianWords();
    }
}
