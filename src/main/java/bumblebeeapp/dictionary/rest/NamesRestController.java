package bumblebeeapp.dictionary.rest;

import bumblebeeapp.common.entities.name.NameEng;
import bumblebeeapp.common.entities.name.NameUkr;
import bumblebeeapp.dictionary.services.INamesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
