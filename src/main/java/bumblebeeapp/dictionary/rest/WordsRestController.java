package bumblebeeapp.dictionary.rest;

import bumblebeeapp.dictionary.services.IWordsService;
import bumblebeeapp.common.entities.words.WordEngLite;
import bumblebeeapp.common.entities.words.WordUkrLite;
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
    public List<WordEngLite> allEnglishWords() {
        return wordsService.getAllEnglishWords();
    }

    @GetMapping("ukr-all")
    public List<WordUkrLite> allUkrainianWords() {
        return wordsService.getAllUkrainianWords();
    }
}
