package bumblebeeapp.dictionary.rest;

import bumblebeeapp.common.entities.words.WordEng;
import bumblebeeapp.common.entities.words.WordUkr;
import bumblebeeapp.dictionary.services.IWordsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("words")
public class WordsRestController {

    private final IWordsService wordsService;

    public WordsRestController(IWordsService wordsService) {
        this.wordsService = wordsService;
    }

    @GetMapping("eng-all")
    public List<WordEng> allEnglishWords() {
        return wordsService.getAllEnglishWords();
    }

    @GetMapping("ukr-all")
    public List<WordUkr> allUkrainianWords() {
        return wordsService.getAllUkrainianWords();
    }
}
