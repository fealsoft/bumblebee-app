package bumblebeeapp.dictionary.rest;

import bumblebeeapp.common.entities.words.POSLevelEng;
import bumblebeeapp.common.entities.words.WordEng;
import bumblebeeapp.common.entities.words.WordUkr;
import bumblebeeapp.dictionary.services.IWordsService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("pos-level-eng")
    public List<POSLevelEng> findPOSLevelEngByWordEngId(@RequestParam Integer wordEngId) {
        return wordsService.findPOSLevelEngByWordEngId(wordEngId);
    }
}
