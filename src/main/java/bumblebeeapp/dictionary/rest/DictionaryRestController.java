package bumblebeeapp.dictionary.rest;

import bumblebeeapp.dictionary.services.IDictionaryService;
import bumblebeeapp.common.entities.words.WordEngLite;
import bumblebeeapp.common.entities.words.WordUkrLite;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("dictionary")
public class DictionaryRestController {

    private final IDictionaryService dictionaryService;

    public DictionaryRestController(IDictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @GetMapping("eng")
    public List<WordEngLite> allEnglishWords() {
        return dictionaryService.getAllEnglishWords();
    }

    @GetMapping("ukr")
    public List<WordUkrLite> allUkrainianWords() {
        return dictionaryService.getAllUkrainianWords();
    }
}