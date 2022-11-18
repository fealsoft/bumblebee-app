package bumblebeeapp.dictionary.rest;

import bumblebeeapp.common.entities.surname.CaseSurnameUkr;
import bumblebeeapp.common.entities.surname.SurnameEng;
import bumblebeeapp.common.entities.surname.SurnameUkr;
import bumblebeeapp.common.entities.surname.TranslateSurnameUkr;
import bumblebeeapp.dictionary.services.ISurnamesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("surnames")
public class SurnamesRestController {

    private final ISurnamesService surnamesService;

    public SurnamesRestController(ISurnamesService surnamesService) {
        this.surnamesService = surnamesService;
    }


    @GetMapping("eng-all")
    public List<SurnameEng> allEnglishSurnames() {
        return surnamesService.getAllEnglishSurnames();
    }

    @GetMapping("ukr-all")
    public List<SurnameUkr> allUkrainianNames() {
        return surnamesService.getAllUkrainianSurnames();
    }

    @GetMapping("case-ukr")
    public CaseSurnameUkr caseSurnameUkr(@RequestParam Integer surnameUkrId) {
        return surnamesService.findBySurnameUkrId(surnameUkrId);
    }

    @GetMapping("translate")
    public TranslateSurnameUkr findTranslateBySurnameEngId(Integer surnameEngId) {
        return surnamesService.findTranslateBySurnameEngId(surnameEngId);
    }
}
