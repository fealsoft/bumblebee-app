package bumblebeeapp.dictionary.rest;

import bumblebeeapp.common.entities.name.CaseNameUkr;
import bumblebeeapp.common.entities.name.NameEng;
import bumblebeeapp.common.entities.name.NameUkr;
import bumblebeeapp.common.entities.name.TranslateNameUkr;
import bumblebeeapp.dictionary.services.INamesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("names")
public class NamesRestController {

    private final INamesService namesService;

    public NamesRestController(INamesService namesService) {
        this.namesService = namesService;
    }

    @GetMapping("eng-all")
    public List<NameEng> allEnglishNames() {
        return namesService.getAllEnglishNames();
    }

    @GetMapping("ukr-all")
    public List<NameUkr> allUkrainianNames() {
        return namesService.getAllUkrainianNames();
    }

    @GetMapping("case-ukr")
    public CaseNameUkr caseNameUkr(@RequestParam Integer nameUkrId) {
        return namesService.findByNameUkrId(nameUkrId);
    }

    @GetMapping("translate")
    public List<TranslateNameUkr> findTranslateByNameEngId(Integer nameEngId) {
        return namesService.findTranslateByNameEngId(nameEngId);
    }

}
